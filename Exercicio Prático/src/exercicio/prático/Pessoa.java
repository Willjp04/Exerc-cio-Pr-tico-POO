/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.prático;

/**
 *
 * @author PORTOMASTER
 */
public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

public Pessoa(String n, int i, String s){
    this.nome =n;
    this.idade = i;
    this.sexo = s;
}    
    
    public void fazerAniver(){
        this.idade = this.idade +1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}

