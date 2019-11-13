/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felipe.fhenriques
 */
public class Fracao {
    
    private int numerador, denominador;

    public Fracao(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    /*public void apresentar(){
        System.out.println(numerador + "/" + denominador);
    }*/
    
    @Override
    public String toString(){
        return numerador + "/" + denominador;
    }
    
    public Fracao soma (Fracao f){
        int n = this.numerador*f.denominador + this.denominador * f.numerador;
        int d = this.denominador * f.denominador;
        return new Fracao(n, d);
    }
    
}
