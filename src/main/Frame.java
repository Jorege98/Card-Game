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
    private String[] images = { "/images/espadas.png", "/images/bastos.png", "/images/oros.png", "/images/copas.png", "/images/dorso.png" };
    
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
        
        jpmain = new JPanel();
        add(jpmain);
        gly = new GridLayout(2, 4, 20, 20);
        
        cartas = new JButton[6];
        Icon icono = new ImageIcon(getClass().getResource("/images/dorso.png"));
        for (int i = 0; i < 6; i++) {
            cartas[i] = new JButton();
            cartas[i].setIcon(icono);;
        }
        jpjuego = new JPanel();
        
        
        jpmain.add(cartas[0]);
        jpmain.add(cartas[1]);
        jpmain.add(cartas[2]);
        jpmain.add(jpjuego);
        jpmain.add(cartas[3]);
        jpmain.add(cartas[4]);
        jpmain.add(cartas[5]);
        jpmain.setLayout(gly);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
