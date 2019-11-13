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
public class BemFormada {
    public static boolean bemFormada(String s){
        PilhaChar p = new PilhaChar(s.length());
        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '('|| c == '['){
                p.push(c);
            }
            else{
                // verifica se a pilha esta vaiza
                if(p.isEmpty()) return false; //erro
                
                //retira o caracter do topo
                char topo = p.pop();
                if(c == ')' && topo == '[') return false; // erro
                
                if(c == ']' && topo == '(') return false; // erro
            }
        }
        return p.isEmpty(); // se estiver vazia é verdadeiro, se não é falso
    }
    
    
    public static void main(String[] args) {
        String s = "(([]))";
        boolean b = bemFormada(s);
        System.out.println("Bem formada? " + b);
    }
    
}
