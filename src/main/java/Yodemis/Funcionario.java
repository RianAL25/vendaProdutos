/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Yodemis;

import io.github.gabrielsizilio.sabordecasa.entity.Entity;

/**
 * Classe Funcionario
 * @author yodem
 */
public class Funcionario extends Entity {
    private Long matricula;
    private String nome;
    private Credencial credencial;
    private Boolean ativo;
    private Boolean Administrador;
    
    public Funcionario () {
        
    }

    public Funcionario(Long matricula, String nome, Credencial credencial, Boolean ativo, Boolean Administrador) {
        this.matricula = matricula;
        this.nome = nome;
        this.credencial = credencial;
        this.ativo = ativo;
        this.Administrador = Administrador;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Credencial getCredencial() {
        return credencial;
    }

    public void setCredencial(Credencial credencial) {
        this.credencial = credencial;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Boolean getAdministrador() {
        return Administrador;
    }

    public void setAdministrador(Boolean Administrador) {
        this.Administrador = Administrador;
    }
    
    
}
