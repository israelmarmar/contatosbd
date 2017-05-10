package br.edu.ifam.modelo;



import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aluno //implements Comparable<Contatos>
 */
public class Contatos implements Comparable<Contatos> {

    private String Nome, Endereco, email, Telefone;
    private Long id;
    private Calendar dataNascimento;
    static int cont = 0;

    @Override
    
    public String toString() {
        return "nome: "+this.getNome()+'\n'+"email: "+this.email+'\n'+"endereco: "+this.Endereco+'\n'+"telefone: "+this.Telefone+'\n';
    }

    

    public Long getId() {
        return this.id;
    }

    public void setId(Long novo) {
        this.id = novo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public String getemail() {
        return email;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public Contatos(String Nome, String Endereco, String email, String Telefone, Long id, Calendar dataNascimento) {
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.email = email;
        this.Telefone = Telefone;
        this.id = id;
        this.dataNascimento = dataNascimento;
    }

    public Calendar getDataNascimento() {
        
        return this.dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int compareTo(Contatos o) {

        int comp = (this.getNome()).compareTo(o.getNome());

        if ( comp < 0) {
            return -1;
        }
            if (comp > 0) {
                return 1;
            }
                return 0;

           
            }

        }
