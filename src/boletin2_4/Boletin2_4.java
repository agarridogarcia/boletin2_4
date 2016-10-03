
package boletin2_4;

import javax.swing.JOptionPane;


public class Boletin2_4 {

    
    public static void main(String[] args) {
        float num1,num2,suma,resta, producto, cociente;
        num1=Float.parseFloat(JOptionPane.showInputDialog("num1"));
        num2=Float.parseFloat(JOptionPane.showInputDialog("num2"));
        suma= num1 + num2;
        resta= num1 - num2;
        producto= num1 * num2;
        cociente= num1 % num2;
        
        JOptionPane.showMessageDialog(null, "suma= "+ suma);
        JOptionPane.showMessageDialog(null, "resta="+ resta);
        JOptionPane.showMessageDialog(null, "producto="+ producto);
        JOptionPane.showMessageDialog(null, "cociente="+cociente);
        JOptionPane.showMessageDialog(null, "suma="+ suma + "\nresta="+ resta + "\nproducto="+producto + "\ncociente="+cociente);
        
        
    }
    
}
