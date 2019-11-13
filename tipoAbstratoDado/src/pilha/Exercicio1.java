/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

import java.util.Scanner;

/**
 *
 * @author felipe.fhenriques
 */
public class Exercicio1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Texto: ");
        String s = sc.nextLine();
        
        PilhaChar p = new PilhaChar(100);
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c!= ' '){
                p.push(c);
            }
            else{
                while(!p.isEmpty()){
                    System.out.print(p.pop());
                }
                System.out.print(' ');
            }
        }
        while(!p.isEmpty()){
                    System.out.print(p.pop());
                }
        System.out.println("");
    }
    
}
