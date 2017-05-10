/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifam.jdbc.teste;

import br.edu.ifam.modelo.Contatos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class listeste {
    public static void main(String args[]){
        Contatos c1 = new Contatos(null,null,null,null,null,null);
        c1.setNome("alex");
        Contatos c2 = new Contatos(null,null,null,null,null,null);
        c2.setNome("bandolex");
        Contatos c3 = new Contatos(null,null,null,null,null,null);
        c3.setNome("cicralex");
        
    List<Contatos> lista = new ArrayList<Contatos>();
    lista.add(c2);
    lista.add(c3);
    lista.add(c1);
    Collections.sort(lista);
    System.out.println(lista);
    }

}
