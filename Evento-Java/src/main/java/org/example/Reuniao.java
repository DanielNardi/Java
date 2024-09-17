package org.example;

public class Reuniao extends Evento {
    //atributo
    private String senha = "1234";
    private boolean privado = true;

    //construtor

    public Reuniao(String nome, String data, boolean privado, String senha) {
        super(nome, data);
        this.senha = senha;
        this.privado = privado;
    }
    //metodos

    public String getSenha() {
        return senha;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    //metodo
    public boolean validar() {
        if (nome.isEmpty() && data.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean acessarReuniao(String s) {

        if (privado) {
            if (senha.equals(s)) {
                return true;
            } else {
                System.out.println("Senha incorreta");
                return false;
            }
        } else {
            return true;
        }
    }
}
