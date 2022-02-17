/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34;

/**
 *
 * @author Lauriane Costa
 */
public class JavaApplication34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int cc = 0;
        while(cc<10){
            
            cc = 1 + cc;
            if(cc==2 || cc==3 || cc ==4){
                continue;
            }
            if(cc==7){
                break;
            }
                System.out.println("Cambalhota " + (cc));
            
        }
               
    }
    
}
