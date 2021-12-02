package de.paul.gui;

import javax.swing.*;

public class Window {
    private JFrame frame = new JFrame();
    private JTextField ecryptField = new JTextField(), decryptField = new JTextField();
    private JButton ecryptButton = new JButton(), decryptButton = new JButton();
    private JLabel ecryptedText = new JLabel(), decryptedText = new JLabel();

    public Window() {
        frame.setBounds(0,0,600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Cäsar Chiffre");
        frame.setLayout(null);

        frame.add(ecryptButton);
        frame.add(decryptButton);
        frame.add(ecryptField);
        frame.add(decryptField);
        frame.add(ecryptedText);
        frame.add(decryptedText);
    }
}
