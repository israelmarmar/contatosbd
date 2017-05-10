/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifam.jdbc.teste;

import br.edu.ifam.jdbc.ContatoDao;
import br.edu.ifam.modelo.Contatos;
import java.sql.SQLException;
import java.util.Calendar;

/**
 *
 * @author Aluno
 */
public class TesteDao {

    public static void main(String arg[]) throws ClassNotFoundException, SQLException {
        Contatos contato = new Contatos(null,null,null,null,null,null);

        contato.setNome("euzinhoalterado");
        contato.setemail("oi@com.br");
        contato.setEndereco("R. Vergueiro 3185 cj87");
        contato.setDataNascimento(Calendar.getInstance());
        contato.setId(5l);
        ContatoDao cd=new ContatoDao();
        
        cd.deletar(contato);
        
        
    }

}
