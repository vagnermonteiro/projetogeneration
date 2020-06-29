/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetogeneration2;

/**(String numero, String descricao, int quantidadeItem, double valorItem)
 *
 * @author Vagner Monteiro
 */
public class Projetogeneration2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Fatura f = new Fatura("001", "Macarrão ",4, 4);
      System.out.println("Total da Fatura: R$ "+ f.getTotalFatura());
    }
    
    
}
