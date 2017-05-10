/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifam.jdbc.teste;

import br.edu.ifam.modelo.Contatos;
import java.sql.SQLException;
import java.util.Calendar;
import br.edu.ifam.jdbc.ContatoDao;

/**
 *
 * @author Aluno
 */
public class TesteDaocon {

    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        ContatoDao cd1 = new ContatoDao();
        System.out.print(cd1.consulta().toString());
        

    }

}
