package inout;

import javax.swing.JOptionPane;

public class alert {
    public static void main(String[] args) {
        String cadena;
        //int entero;
        //char letra;
        //double decimal;
//
        cadena = JOptionPane.showInputDialog("digite una cadena: ");
        String option = JOptionPane.showInputDialog("digite un entero");
       // entero = Integer.parseInt(option);
       // String character= JOptionPane.showInputDialog("digite un caracter");
       // letra=character.charAt(0);
       // String decimales= JOptionPane.showInputDialog("ingrese un decimal");
       // decimal=Double.parseDouble(decimales); 
       // System.out.println(cadena + entero+letra+decimal);

        JOptionPane.showMessageDialog(null, "la cadena es: "+ cadena);
        JOptionPane.showInternalOptionDialog(null, option, cadena, 0, 0, null, args, option);
    }
}
