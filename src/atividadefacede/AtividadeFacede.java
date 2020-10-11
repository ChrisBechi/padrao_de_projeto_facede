/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadefacede;

/**
 *
 * @author christian
 */
public class AtividadeFacede {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FacedeCalculadora fc = new FacedeCalculadora();
        System.out.println(fc.adicao(5, 5));
        System.out.println(fc.subtracao(5, 5));
        System.out.println(fc.multiplicacao(5, 5));
        System.out.println(fc.divisao(5, 5));
    }
    
}
