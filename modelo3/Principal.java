/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Autor at01 = new Autor();
        Autor at02 = new Autor();
        Livro lv01 = new Livro();
        Livro lv02 = new Livro();

        at01.setNome("Thiago");
        at01.setAnoNasc(2000);
        at01.setEmail("TT@gmail.com");

        at02.setNome("Gabi");
        at02.setAnoNasc(1999);
        at02.setEmail("gabi@gmail.com");
        
        lv01.setTitulo("POO");
        lv01.setAno(2018);
        lv01.setEditora("ABC");
        
        lv02.setTitulo("FARMA");
        lv02.setAno(2015);
        lv02.setEditora("ABC");
        
        lv01.setEscritores(at01);
        lv01.setEscritores(at02);
        lv02.setEscritores(at01);
        lv02.setEscritores(at02);
        
        at01.setObras(lv01);
        at01.setObras(lv02);
        at02.setObras(lv01);
        at02.setObras(lv02);
        
        lv01.getEscritores();
        lv02.getEscritores();
        at01.getObras();
        at02.getObras();
       
       
        
       
    }

}
