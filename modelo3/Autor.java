/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Autor {

    private String nome;
    private String email;
    private int anoNasc;
    private ArrayList<Livro> obras;

    public Autor(String nome, String email, int anoNasc, ArrayList<Livro> obras) {
        this.obras = new ArrayList<>();
        this.nome = nome;
        this.email = email;
        this.anoNasc = anoNasc;
        this.obras = obras;
    }

    public Autor() {
        this.obras = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public void getObras() {
        for (int i = 0; i < obras.size(); i++) {
            System.out.println("o Autor "+this.nome+" escreve o livro: "+ obras.get(i).getTitulo());
        }
    }

    public void setObras(Livro l) {
        obras.add(l);
        this.obras = obras;
    }

    
}
