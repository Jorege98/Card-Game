/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.control.ComboBox;
import javax.swing.*;

/**
 *
 * @author DAM 6N
 */
public class Frame extends JFrame implements ActionListener{
    private JPanel jpmain;
    private GridLayout gly;
    private String[] images = { "/images/espadas.png", "/images/bastos.png", "/images/oros.png", "/images/copas.png"};
    private Icon icono = new ImageIcon(getClass().getResource("/images/dorso.png"));
    private JPanel jpjuego;
    private JButton[] cartas;
    private JTextField credito;
    private ComboBox palos;
    private String[] palo ={"copas","espadas","bastos","oros"}; 

    public Frame() {
        //le pongo titulo, medidas, layout y operacion de cierre
        setTitle("Juego de Cartas");
        setBounds(0,0,600,450); 
        setLocationRelativeTo(null);    //Con aparece en el centro de la pantalla
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //Panel donde irás las cartas
        jpmain = new JPanel(); 
        add(jpmain); //Lo añado a la ventana
        gly = new GridLayout(2, 4, 20, 20);
        
        //Botones de las cartass 
        cartas = new JButton[6]; 
        //Les pongo dorso
        for (int i = 0; i < 6; i++) {
            cartas[i] = new JButton();
            cartas[i].setIcon(icono);;
            cartas[i].addActionListener(this);
        }
        //Panel lateral
        jpjuego = new JPanel();
        
        //Establezco el layout de el panel principal, meto los botones y el panel lateral
        jpmain.setLayout(gly);
        jpmain.add(cartas[0]);
        jpmain.add(cartas[1]);
        jpmain.add(cartas[2]);
        jpmain.add(jpjuego);
        jpmain.add(cartas[3]);
        jpmain.add(cartas[4]);
        jpmain.add(cartas[5]);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //Genero número aleatorio para seleccionar imagen
        int num = (int) (Math.random()*4);
        Icon icono2 = new ImageIcon(getClass().getResource(images[num]));
        
        //metodo que aplica una imagen a el boton pulsado
        for (int i = 0; i < 6; i++) {
            if (cartas[i].equals(e.getSource()) && cartas[i].getIcon().equals(icono)) { //Solo si tiene el dorso, le pone un palo
                cartas[i].setIcon(icono2);
            }
           
        }
        
    }
    
}
