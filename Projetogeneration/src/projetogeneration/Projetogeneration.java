/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetogeneration;

/**
 * * @author Vagner Monteiro
 */
public class Projetogeneration {

    public static void main(String[] args) {
      Endereco end = new Endereco("Rua 1" , "Jd paraiso" , "Itap da Serra" , "São Paulo" ,"06850-305" , "Casa 02" );  
      Proprietario p = new Proprietario("Vagner", "1234343", "32423432424");
      p.setEndereco(end);
      Marca marca = new Marca("Fiat" , 20 , 1 , 5);
      
      Carro meuCarro = new Carro(p);
        meuCarro.setMarca(marca);
        meuCarro.status();
        meuCarro.trocaMarcha(1);
        meuCarro.trocaMarcha(2);
        meuCarro.freia();
        meuCarro.calculoAutonomiaviagem(5);
                      
        
    }
}