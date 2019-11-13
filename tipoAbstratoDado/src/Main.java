/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felipe.fhenriques
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fracao f1 = new Fracao(3,4);
        Fracao f2 = new Fracao (2,3);
        //f1.apresentar();
        System.out.println(f1);
        System.out.println(f2);
        Fracao r = f1.soma(f2);
        System.out.println(r);
    }
    
}
