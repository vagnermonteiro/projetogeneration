/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetogeneration;

/**
 *
 * @author Vagner Monteiro
 */
public class Carro {

    private String modelo;
    private String cor;
    private String ano;
    private Marca marca;
    private String chassi;
    private Proprietario proprietario;
    private int velmax;
    private int velAtual;
    private String numPortas;
    private boolean tetoSolar;
    private int numMarcha;
    private boolean cambioAuto;
    private int volCombustivel;

    public Carro(Proprietario p) {
        this.velmax = 10;
        this.proprietario = p;
        this.volCombustivel = 100;

    }

    public void acelera() {
        if (this.velAtual < this.velmax) {
            this.velAtual += 1;
            this.volCombustivel = this.volCombustivel - 1;

        }
    }

    /**
     *
     * @param marcha
     */
    public void trocaMarcha(int marcha) {
        if (marcha >= 1 && marcha < 6) {
            this.acelera();
            System.out.println("\n" + marcha + " marcha | Velocidade Atual: " + this.velAtual + "| Combustivel - " + this.volCombustivel);
            System.out.println("Estou acelerando");
            System.out.println("impossível dar ré\n");
            

        } else if (marcha == 6 && this.velAtual != 0) {
            System.out.println("impossível dar ré");
        } else if (marcha == 6 && this.velAtual == 0) {
            System.out.println("Dando ré");
            this.acelera();
        }
    }

    public void reduzMarcha() {
        if (numMarcha >= 1 && numMarcha < 6) {
            this.numMarcha -= 1;
        }
    }

    public void calculoAutonomiaviagem(float consumoMedio) {
        double autonomiaViagem = 3.90 / consumoMedio;
        System.out.println("Autonomia de Viagem " + autonomiaViagem + "/km");

    }

    public void status() {

        System.out.println("\nProprietario: " + this.proprietario.getNome());
        System.out.println("Endereco: " + this.proprietario.getEndereco().getRua() + " - " + this.proprietario.getEndereco().getBairro() + " - " + this.proprietario.getEndereco().getCidade()+ " , " 
        + this.proprietario.getEndereco().getEstado()+ ", " + this.proprietario.getEndereco().getCep()+ " - " + this.proprietario.getEndereco().getComplemento());
                System.out.println("Marca: " + this.marca.getNome());
    }

    public void freia() {
        this.velAtual = 0;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public int getVelmax() {
        return velmax;
    }

    public void setVelmax(int velmax) {
        this.velmax = velmax;
    }

    public int getVelAtual() {
        return velAtual;
    }

    public void setVelAtual(int velAtual) {
        this.velAtual = velAtual;
    }

    public String getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(String numPortas) {
        this.numPortas = numPortas;
    }

    public boolean isTetoSolar() {
        return tetoSolar;
    }

    public void setTetoSolar(boolean tetoSolar) {
        this.tetoSolar = tetoSolar;
    }

    public int getNumMarcha() {
        return numMarcha;
    }

    public void setNumMarcha(int numMarcha) {
        this.numMarcha = numMarcha;
    }

    public boolean isCambioAuto() {
        return cambioAuto;
    }

    public void setCambioAuto(boolean cambioAuto) {
        this.cambioAuto = cambioAuto;
    }

    public int getVolCombustivel() {
        return volCombustivel;
    }

    public void setVolCombustivel(int volCombustivel) {
        this.volCombustivel = volCombustivel;
    }

}
