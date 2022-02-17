/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Lauriane Costa
 */
public class ResolucaoTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dimension dimensaoTela = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = (int) dimensaoTela.getWidth();
        int altura = (int) dimensaoTela.getHeight();
        System.out.println("A dimensao da tela é: " + largura + " x "+ altura);
 
    }
    
}
