package gui;

import Util.PlaySound;
import Util.Wait;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bombe extends JFrame {
    private JButton bKlick;
    private JPanel pMain;



    public Bombe(){

        bKlick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int counter = 4;
                if(counter == 2 || counter == 4){
                    bKlick.setText("Klick mich!");
                    bKlick.setIcon(new ImageIcon("bombe_1.png"));
                    counter--;
                }else if(counter == 1 || counter == 3){
                    bKlick.setText("Tsssssss....");
                    bKlick.setIcon(new ImageIcon("bombe_2.png"));
                    PlaySound.playSound(entzuenden_sound.mp3);
                    Wait.wait(500);
                    bKlick.setText("BUMMMMM!!!!");
                    bKlick.setIcon(new ImageIcon("Bombe_3.png"));
                    Wait.wait(500);
                    bKlick.setText("Das tat ganz schön weh! Mach das noch eins zwei mal und dieses Fenster geht Kaputt!");
                }else if(counter == 0){
                    bKlick.setText("SO! DAS WAR'S JETZT!");
                    Wait.wait(500);
                    bKlick.setText("CLOSING IN:3");
                    Wait.wait(1000);
                    bKlick.setText("CLOSING IN:2");
                    Wait.wait(1000);
                    bKlick.setText("CLOSING IN:1");
                    Wait.wait(1000);
                    bKlick.setText("CLOSING IN:0");
                }
            }
        });

        setTitle("ein Bomben Projekt!");
        add(pMain);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);

    }


    public static void main(String[] args) {
        new Bombe();
    }

}
