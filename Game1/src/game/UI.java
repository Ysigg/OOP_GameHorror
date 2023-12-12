
package game;

import game.Game.ChoiceHandler;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author naufa
 */
public class UI {
    
    JFrame window;
    JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
    JTextArea mainTextArea;
    JLabel titleNameLabel, kerasukanNumber;
    JButton startButton, choice1, choice2, choice3, choice4;
    Font TextFont = new Font("Times New Roman", Font.PLAIN, 25);
    
    //method untuk menampilkan UI
    public void screenUI(ChoiceHandler cHandler){
        
        // WINDOW
        window = new JFrame();
        window.setSize(1000, 700);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setVisible(true);
        
        String fontPath = "C:\\Users\\naufa\\Documents\\NetBeansProjects\\Game\\Font\\Zombie_Holocaust.ttf"; // 

        try {
            // Membuat objek font dari file yang sudah diunduh
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPath));

            // Mengubah ukuran font sesuai kebutuhan
            Font customFontSized = customFont.deriveFont(Font.PLAIN, 120); // Ubah ukuran dan style sesuai kebutuhan

            // Panel untuk menampilkan teks
            titleNamePanel = new JPanel();
            titleNamePanel.setBounds(200, 100, 600, 150);
            titleNamePanel.setBackground(Color.black);
            

            // Label untuk menampilkan teks 
            titleNameLabel = new JLabel("Rumah Hantu");
            titleNameLabel.setForeground(Color.red);
            titleNameLabel.setFont(customFontSized);
            
            // Untuk menampilkan teks start
            startButtonPanel = new JPanel();
            startButtonPanel.setBounds(400, 400, 200, 100);
            startButtonPanel.setBackground(Color.black);
            
            startButton = new JButton("START");
            startButton.setBackground(Color.black);
            startButton.setForeground(Color.white);
            startButton.setFont(TextFont);
            startButton.addActionListener(cHandler);
            startButton.setActionCommand("start");
            startButton.setFocusPainted(false);

            // Memasukan Label ke Panel
            titleNamePanel.add(titleNameLabel);
            startButtonPanel.add(startButton);
            
            //
            window.add(titleNamePanel);
            window.add(startButtonPanel);
            
        }catch (IOException | FontFormatException e) {
            e.printStackTrace();
        }
            //Game Screen
            mainTextPanel = new JPanel();
            mainTextPanel.setBounds(100, 100, 800, 350);
            mainTextPanel.setBackground(Color.black);


            mainTextArea = new JTextArea("Hello ");
            mainTextArea.setBounds(100,200,800,350);
            mainTextArea.setBackground(Color.black);
            mainTextArea.setForeground(Color.white);
            mainTextArea.setFont(TextFont);

            choiceButtonPanel = new JPanel();
            choiceButtonPanel.setBounds(350, 450, 300, 150);
            choiceButtonPanel.setBackground(Color.black);
            choiceButtonPanel.setLayout(new GridLayout(1,4));

            choice1 = new JButton("Choice1");
            choice1.setBackground(Color.black);
            choice1.setForeground(Color.white);
            choice1.setFont(TextFont);
            choice1.setFocusPainted(false);
            choice1.addActionListener(cHandler);
            choice1.setActionCommand("c1");
            mainTextArea.setFont(TextFont);

            choice2 = new JButton("Choice2");
            choice2.setBackground(Color.black);
            choice2.setForeground(Color.white);
            choice2.setFont(TextFont);
            choice2.setFocusPainted(false);
            choice2.addActionListener(cHandler);
            choice2.setActionCommand("c2");

            choice3 = new JButton("Choice3");
            choice3.setBackground(Color.black);
            choice3.setForeground(Color.white);
            choice3.setFont(TextFont);
            choice3.setFocusPainted(false);
            choice3.addActionListener(cHandler);
            choice3.setActionCommand("c3");

            choice4 = new JButton("Choice4");
            choice4.setBackground(Color.black);
            choice4.setForeground(Color.white);
            choice4.setFont(TextFont);
            choice4.setFocusPainted(false);
            choice4.addActionListener(cHandler);
            choice4.setActionCommand("c4");

            playerPanel = new JPanel();
            playerPanel.setBounds(140, 15, 600, 50);
            playerPanel.setBackground(Color.black);
            playerPanel.setLayout(new GridLayout(1,1));

            kerasukanNumber = new JLabel();
            kerasukanNumber.setFont(TextFont);
            kerasukanNumber.setForeground(Color.white);

            mainTextArea.setLineWrap(true);
            window.add(mainTextPanel);
            window.add(playerPanel);
            window.add(choiceButtonPanel);

            mainTextPanel.add(mainTextArea);
            choiceButtonPanel.add(choice1);
            choiceButtonPanel.add(choice2);
            choiceButtonPanel.add(choice3);
            choiceButtonPanel.add(choice4);
            playerPanel.add(kerasukanNumber);
            
//            soundButton = new JButton("Sound");
//            soundButton.setFocusPainted(false);
          
    }
}
