/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

/**
 *
 * @author felipe.fhenriques
 */
public class Exercicio2 {
    public static void main(String[] args) {
        int n = 18;
        PilhaInt p = new PilhaInt(50);
        do{
            int r = n%2;
            p.push(r);
            n = n/2;
        }
        while(n!=0);
     
        System.out.println("Binário");
        while(!p.isEmpty()){
            System.out.print(p.pop());
        }
        System.out.println("");
        
    }
    
}
