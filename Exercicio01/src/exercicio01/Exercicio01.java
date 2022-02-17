/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01;
import javax.swing.JOptionPane;

/**
 *
 * @author Lauriane Costa
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Olá Mundo", "Boas Vindas",JOptionPane.INFORMATION_MESSAGE);
        int n = 0;
        int s = 0;
        int cont = 0;
        int pares = 0;
         int impares = 0;
         int acima = 0;
         int  media = 0;
        do{
        n = Integer.parseInt(JOptionPane.showInputDialog(null,"<html>Informe um Número: <br><em>(Valor 0 interrompe)</em></br></html>"));
        //JOptionPane.showMessageDialog(null,"Você digitou o número: "+ n);
        s +=n;
        cont++;
        if(n!=0){
        if(n%2==0){
            pares++;
        }else{
            impares++;
        }
        }
        if(n>100){
            acima++;
        }
        
        }while(n !=0);
        
        //JOptionPane.showMessageDialog(null,"<html>Resultado final <br>-------------------" + "<br>Somatório vale: "+s);
        media = s/(cont-1);
       
        System.out.println(media);
        JOptionPane.showMessageDialog(null,"<html>Resultado final <br>-------------------" + "<br>Total de Valores: "+(cont-1) + "<br>Total de Pares: " +
                pares + "<br>Total de Impares: " + impares + "<br>Total Acima de 100: " + acima + "<br>Media dos Valores: " + media 
        );
     }
}
