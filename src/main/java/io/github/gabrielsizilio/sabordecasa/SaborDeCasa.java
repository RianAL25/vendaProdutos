/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package io.github.gabrielsizilio.sabordecasa;

import io.github.gabrielsizilio.sabordecasa.cliente.Cliente;
import io.github.gabrielsizilio.sabordecasa.cliente.Endereco;
import io.github.gabrielsizilio.sabordecasa.cliente.Telefone;
import io.github.gabrielsizilio.sabordecasa.produto.Item;
import io.github.gabrielsizilio.sabordecasa.produto.Produto;
import io.github.gabrielsizilio.sabordecasa.produto.Recheio;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel Sizilio <Gabriel at IFNMG>
 */
public class SaborDeCasa {

    public static void main(String[] args) throws Exception {
        
        /*Recheio recheio = new Recheio(1L, "Recheio de carne", "Carne com molho", new BigDecimal("2"));
        Produto produto = new Produto(2L, "Mineirinho", new BigDecimal("10"), recheio);
        Item item = new Item(produto, 3);
        
        System.out.println(">>" + item);
        System.out.println(">>" + item.calcularTotal());*/
        
//        Cliente cliente = new Cliente();
//        cliente.setNome("Rian");
//        
//        Endereco e = new Endereco("18",(short)80,"village","c");
//        cliente.setEndereco((List<Endereco>) e);
//        
//        System.out.println(">> "+ e);

        Endereco endereco1 = new Endereco("18", (short)80, "Village", "casa");
        Telefone telefone1 = new Telefone((byte)38, 12341234, false);
        
        Endereco endereco2 = new Endereco("17", (short)81, "Minas Gerais", "apt 101");
        Telefone telefone2 = new Telefone((byte)38, 12344444, true);
        
        Cliente cliente1 = new Cliente("Rian");
        cliente1.addTelefone(telefone1);
        cliente1.addTelefone(telefone2);
        cliente1.addEndereco(endereco1);
        cliente1.addEndereco(endereco2);
        
        System.out.println(">>" + cliente1);
        
    }
}
