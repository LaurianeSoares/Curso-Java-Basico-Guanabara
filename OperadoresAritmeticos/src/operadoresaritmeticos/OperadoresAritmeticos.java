/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author Lauriane Costa
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n1 = 3;
        int n2 = 5;
        float m = (n1+n2)/2;
        System.out.println("A média é igual a: " + m);
       /* int numero = 5;
        numero++;
        System.out.println(numero);
        numero--;
        System.out.println(numero);
    
      
       int numero = 5;
       int valor = 5 + numero;
       valor++;
        System.out.println(valor);
        System.out.println(valor);
       int x = 4;
       float y;
       x +=2;
        System.out.println(x);
        y = (float) Math.PI;
        System.out.println(y);
        y = (float) Math.pow(x, 2);
        System.out.println(y);
        y = (float) Math.sqrt(25);
        System.out.println(y);
        y = (float) Math.cbrt(27);
        System.out.println(y);
*/
       float v = 8.3f;
       int ar = (int)Math.floor(v);
       System.out.println(ar);
       int ar1 = (int)Math.ceil(v);
       System.out.println(ar1);
       int ar2 = (int)Math.round(v);
       System.out.println(ar2);
       double ale = Math.random();
       int resultado = (int)(0 + ale * (15-0));
        System.out.println("Numero aleatorio: " + resultado);
       
        
       
    }
    
}
