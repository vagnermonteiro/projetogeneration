/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetogeneration2;

/**
 *
 * @author Vagner Monteiro
 */
public class Fatura {

    private String numero;
    private String descricao;
    private int quantidadeItem;
    private double valorItem;

    public Fatura(String numero, String descricao, int quantidadeItem, double valorItem) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidadeItem = quantidadeItem;
        this.valorItem = valorItem;

    }

    public double getTotalFatura() {
        double totalFatura = quantidadeItem * valorItem;
        if (totalFatura < 0) {
            totalFatura = 0;

        }

        return totalFatura;

    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public void setQuantidadeItem(int quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }

    public double getValorItem() {
        return valorItem;
    }

    public void setValorItem(double valorItem) {
        this.valorItem = valorItem;
    }

}
