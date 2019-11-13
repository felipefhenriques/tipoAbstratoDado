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
public class PilhaInt {
    
    //atributos
    private int[] elementos;
    private int topo;
    
    //consrutor
    public PilhaInt(int n){
        elementos = new int[n];
        topo = -1;
    }
    
    //métodos
    public boolean isEmpty(){
        return topo == -1;
    }
    
    public boolean isFull(){
        return topo == elementos.length-1;
    }
    
    public void push(int e){
        if(!isFull()){
            topo++;
            elementos[topo] = e;
        }
    }
    
    public int pop(){
        int e = elementos[topo];
        topo--;
        return e;
    }
    
}
