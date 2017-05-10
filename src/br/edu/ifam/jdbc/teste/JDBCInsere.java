/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifam.jdbc.teste;

import br.edu.ifam.jdbc.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

/**
 *
 * @author Aluno
 */
public class JDBCInsere {

    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        Connection con = new ConnectionFactory().getConnection();
        
       
        String sql = "insert into contatos"
                + "(nome, email, endereco, dataNascimento)"
                + "value (?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);

        stmt.setString(1, "caleum1");
        stmt.setString(2, "caleum@mail.com");
        stmt.setString(3, "rua x n0 bairro z");
        stmt.setDate(4, new java.sql.Date(Calendar.getInstance().getTimeInMillis()));

        stmt.execute();
        stmt.close();

        System.out.println("gravado");
        
        
        con.close();
        
        
    }

}
