package inout;

import java.awt.LayoutManager;

import javax.swing.*;    //import javax.swing.JOptionPane;

public class alert extends JFrame{
 private JLabel label1;
 private JLabel label2;
   public alert(){
        setLayout(null);
        label1= new JLabel("conversor de moneda");
        label1.setBounds(10,20,200,10);
        add(label1);
        label2= new JLabel("selecciona un tipo de conversor");
        label2.setBounds(10,100,200,40);
         add(label2);

   }
  
   public static void main(String[] args) {
   alert Formulario1= new alert();
   Formulario1.setBounds(0,0,400,300);
   //Formulario1.setResizable(false);
   Formulario1.setVisible(true);
   Formulario1.setLocationRelativeTo(null);
   // String cadena;
    //int entero;
    //char letra;
    //double decimal;
//
   // cadena = JOptionPane.showInputDialog("digite una cadena: ");
  //  String option = JOptionPane.showInputDialog("digite un entero");
   // entero = Integer.parseInt(option);
   // String character= JOptionPane.showInputDialog("digite un caracter");
   // letra=character.charAt(0);
   // String decimales= JOptionPane.showInputDialog("ingrese un decimal");
   // decimal=Double.parseDouble(decimales); 
   // System.out.println(cadena + entero+letra+decimal);

   // JOptionPane.showMessageDialog(null, "la cadena es: "+ cadena);
   // JOptionPane.showInternalOptionDialog(null, option, cadena, 0, 0, null, args, option);
}

}