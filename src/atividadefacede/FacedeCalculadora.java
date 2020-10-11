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
public class FacedeCalculadora {
    private Adicao ad = null;
    private Subtracao sub = null;
    private Multiplicacao mult = null;
    private Divisao div = null;
    
    public FacedeCalculadora (){
        ad = new Adicao();
        sub = new Subtracao();
        mult = new Multiplicacao();
        div = new Divisao();
    }
    
    public double adicao(double operador1, double operador2){
        return ad.somar(operador1, operador2);
    }
    
    public double subtracao(double operador1, double operador2){
        return sub.subtrair(operador1, operador2);
    }
    
    public double multiplicacao(double operador1, double operador2){
        return mult.multiplicar(operador1, operador2);
    }
    
    public double divisao(double operador1, double operador2){
        return div.dividir(operador1, operador2);
    }
}
