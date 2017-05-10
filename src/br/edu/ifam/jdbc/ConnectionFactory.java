/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifam.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Aluno
 */
public class ConnectionFactory {

    String driver = "com.mysql.jdbc.Driver";

    public Connection getConnection() {
        try {
           // Class.forName(driver);
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/contato", "root", "123");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
