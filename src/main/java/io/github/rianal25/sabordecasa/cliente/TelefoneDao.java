/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.rianal25.sabordecasa.cliente;

import io.github.gabrielsizilio.sabordecasa.database.Dao;
import io.github.gabrielsizilio.sabordecasa.database.DbConnection;
import static io.github.rianal25.sabordecasa.cliente.EnderecoDao.TABLE;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *<pre>telefone | CREATE TABLE `telefone` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `ddd` tinyint(4) NOT NULL,
  `numero` int(11) NOT NULL,
  `mensageiro` tinyint(1) DEFAULT '0',
  `cliente_id` bigint(20) unsigned NOT NULL,
  `excluido` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`),
  KEY `cliente_id` (`cliente_id`),
  CONSTRAINT `telefone_ibfk_1` FOREIGN KEY (`cliente_id`) REFERENCES `cliente` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1</pre>
 * @author Rian Alves <Rian at IFNMG>
 */
public class TelefoneDao extends Dao<Telefone> {
    public static final String TABLE = "telefone";

    @Override
    public String getSaveStatement() {
        return "insert into "+ TABLE +" (ddd,numero,mensageiro,cliente_id) values (?,?,?,?)";
    }

    @Override
    public String getUpdateStatement() {
        return "update "+ TABLE +" set ddd = ?, numero = ?, mensageiro = ?, cliente_id = ? where id = ?";
    }

    @Override
    public void composeSaveOrUpdateStatement(PreparedStatement pstmt, Telefone e) {
        try{
            pstmt.setByte(1, e.getDdd());
            pstmt.setInt(2, e.getNumero());
            pstmt.setBoolean(3, e.getMensageiro());
            pstmt.setLong(4, e.getCliente().getId());
            
            if(e.getId() != null) {
                pstmt.setObject(5, e.getId());
                
            }

        } catch(SQLException ex){
            Logger.getLogger(TelefoneDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getFindByIdStatement() {
        return "select * from "+ TABLE + " where id = ?";
    }

    @Override
    public String getFindAllStatement() {
        return "select * from "+ TABLE + " where excluido = 0";
    }

    @Override
    public String getMoveToTrashStatement() {
        return "update "+ TABLE + " set excluido = 1 where id = ?";
    }

    @Override
    public String getRestoreFromTrashStatement() {
        return "update " + TABLE + " set excluido = 0 where id = ?";
    }

    @Override
    public String getFindAllOnTrashStatement() {
        return "select * from "+ TABLE + " where excluido = 1";
    }
    public List<Telefone> findByClienteId(Long id) {
        
        final String SQL = "SELECT * FROM " +TABLE+ " WHERE cliente_id=?";
        
        try ( PreparedStatement preparedStatement
                = DbConnection.getConnection().prepareStatement(SQL)) {
            
            preparedStatement.setLong(1, id);
            
            // Show the full sentence
            System.out.println(">>FINDBYCLIENTEID SQL: " + preparedStatement);

            // Performs the query on the database
            ResultSet resultSet = preparedStatement.executeQuery();

            // Returns the respective object
            return extractObjects(resultSet);

        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }

        return null;
    }
    @Override
    public Telefone extractObject(ResultSet resultSet) {
        Telefone telefone = null;

        try {
            telefone = new Telefone();
            telefone.setId(resultSet.getLong("id"));
            telefone.setDdd(resultSet.getByte("ddd"));
            telefone.setNumero(resultSet.getInt("numero"));
            telefone.setMensageiro(resultSet.getBoolean("mensageiro"));
            telefone.setExcluido(resultSet.getBoolean("excluido"));
            
        } catch (SQLException ex) {
                Logger.getLogger(TelefoneDao.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
            Logger.getLogger(TelefoneDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            return telefone;
    }  
}
