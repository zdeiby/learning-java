package inout;
import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler;
import javax.swing.text.AttributeSet.ColorAttribute;

import java.awt.Color;
import java.awt.event.*;
import java.text.Format;

public class acciones extends JFrame implements ActionListener, ItemListener {
    private JComboBox select;
    private JButton boton1, boton2, boton3;
    private JLabel label1;
    private JTextField input;

    public acciones(){
        setLayout(null);

        select = new JComboBox();
        select.setBounds(10,10,180,20);
        add(select);

        select.addItem("Peso colombiano a dolar");
        select.addItem("peso COP a peso MX");
        select.addItem("Peso colombiano a yenes");
        select.addItemListener(this);


        input = new JTextField();
        input.setBounds(120,17,150,20);
        add(input);
        //input.addActionListener(this);

        boton1 = new JButton("boton1");
        boton1.setBounds(10,100,90,30);
        add(boton1);
        boton1.addActionListener(this);

        boton2 = new JButton("boton2");
        boton2.setBounds(110,100,90,30);
        add(boton2);
        boton2.addActionListener(this);

        boton3 = new JButton("boton3");
        boton3.setBounds(210,100,90,30);
       boton3.setBackground(Color.GREEN);
        add(boton3);
        boton3.addActionListener(this);

        label1 = new JLabel("en espera...");
        label1.setBounds(10,10,300,30);
        add(label1);
    }

    @Override
    public void itemStateChanged(ItemEvent e){
        if(e.getSource()==select){
            String texto = select.getSelectedItem().toString();
            setTitle(texto);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == boton1 ){
            label1.setText("has presionado el boton 1");
            String texto = input.getText();
            setTitle(texto);
        }
        if(e.getSource() == boton2 ){
            label1.setText("has presionado el boton 2");
        }
        if(e.getSource() == boton3 ){
            label1.setText("has presionado el boton 3");
        } 
    }

    public static void main(String[] args) {
        acciones formulario1= new acciones();
        formulario1.setBounds(0,0,350,200);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);

    
    }

  


}
