
package io.github.yodemisj.sabordecasa.funcionario;

import io.github.gabrielsizilio.sabordecasa.entity.Entity;

/**
 * Classe Credencial
 * @author yodem
 */
public class Credencial extends Entity{
    private String email;
    private String senha;

    public Credencial() {
    }
    
    public Credencial(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}