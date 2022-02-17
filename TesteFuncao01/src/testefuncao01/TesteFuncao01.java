/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao01;

/**
 *
 * @author Lauriane Costa
 */
public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
   static void soma(int a, int b){
        int s = a + b;
        System.out.println("A soma é: " + s);
    }
   static int somab( int a, int b){
       int s = a + b;
       return s;
   }
    public static void main(String[] args) {
        // TODO code application logic here
       // soma(4,5);
    
        System.out.println("A soma é: " + somab(4,5));
    
    }
    
}
