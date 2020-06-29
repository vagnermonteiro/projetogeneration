/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetogeneration;

/**
 * 
 *
 * @author Vagner Monteiro
 */
public class Marca {
    private String  nome;
    private int numModelo;
    private int anoLancamento;
    private int codInt;
    
    public Marca(String nome, int numModelo, int anoLancamento, int codInt) {
        this.nome = nome;
        this.numModelo = numModelo;
        this.anoLancamento = anoLancamento;
        this.codInt = codInt;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumModelo() {
        return numModelo;
    }

    public void setNumModelo(int numModelo) {
        this.numModelo = numModelo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getCodInt() {
        return codInt;
    }

    public void setCodInt(int codInt) {
        this.codInt = codInt;
    }
       
    
}
