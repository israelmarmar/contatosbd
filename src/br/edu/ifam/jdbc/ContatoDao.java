/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifam.jdbc;

import br.edu.ifam.modelo.Contatos;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ContatoDao {

    private Connection connection;

    public ContatoDao() {

        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Contatos contato) {
        String sql = "insert into contatos"
                + "(nome,email,endereco,dataNascimento)"
                + "value (?,?,?,?)";

        try {

            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getemail());
            stmt.setString(3, contato.getEndereco());
            stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));

            stmt.execute();
            stmt.close();

            System.out.println("gravado");

            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void altera(Contatos contato) {
        String sql = "update contatos set nome=?, email=?,"
                + "endereco=?, dataNascimento=? where id=?";

        try {

            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getemail());
            stmt.setString(3, contato.getEndereco());
            stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
            stmt.setLong(5, contato.getId());
            stmt.execute();
            stmt.close();

            System.out.println("alterado");

            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void deletar(Contatos contato) {
        String sql = "delete from contatos where id=?";

        try {

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setLong(1, contato.getId());
            stmt.execute();
            stmt.close();

            System.out.println("deletado");

            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public List<Contatos> consulta() {
        String sql = "select * from contatos";
        List<Contatos> contatos = new ArrayList<Contatos>();
        try {

            PreparedStatement stmt = connection.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                Contatos c1 = new Contatos(null, null, null, null, null, null);
                c1.setNome(rs.getString("nome"));
                c1.setemail(rs.getString("email"));
                Calendar data = Calendar.getInstance();
                data.setTime(rs.getDate("dataNascimento"));
                c1.setDataNascimento(data);
                c1.setId(rs.getLong("id"));
                c1.setEndereco(rs.getString("endereco"));
                contatos.add(c1);

            }

            stmt.execute();
            stmt.close();

            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return contatos;
    }
    
    public List<Contatos> pesquisar(String pes) {
        String sql = "select * from contatos where nome LIKE '"+"%"+pes+"%"+"'";
        List<Contatos> contatos = new ArrayList<Contatos>();
        try {

            PreparedStatement stmt = connection.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                Contatos c1 = new Contatos(null, null, null, null, null, null);
                c1.setNome(rs.getString("nome"));
                c1.setemail(rs.getString("email"));
                Calendar data = Calendar.getInstance();
                data.setTime(rs.getDate("dataNascimento"));
                c1.setDataNascimento(data);
                c1.setId(rs.getLong("id"));
                c1.setEndereco(rs.getString("endereco"));
                contatos.add(c1);

            }

            stmt.execute();
            stmt.close();

            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return contatos;
    }

}
