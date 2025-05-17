package dev.crowthefallen.whiskerscan.designs;
import static dev.crowthefallen.whiskerscan.designs.DisplayMessage.displayMessage;

import javax.swing.*;
import java.awt.*;



public class Box {


    static JTextArea textArea;
    static JTextField textField;
    static InputFlow flow = new InputFlow();

    public static void interfaceBox() {
        JFrame frame = new JFrame("Whiskerscan");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Créer le panneau principal
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Créer un JTextArea pour afficher les messages (console)
        textArea = new JTextArea();
        textArea.setEditable(false); // L'utilisateur ne peut pas éditer directement le texte
        textArea.setBackground(Color.BLACK);
        textArea.setForeground(Color.GREEN);
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 14));

        // Ajouter le JTextArea à la fenêtre
        JScrollPane scrollPane = new JScrollPane(textArea);
        panel.add(scrollPane, BorderLayout.CENTER);

        // Créer un JTextField pour recevoir les commandes de l'utilisateur
        textField = new JTextField();
        textField.setBackground(Color.BLACK);
        textField.setForeground(Color.GREEN);
        textField.setCaretColor(Color.GREEN);
        textField.setFont(new Font("Monospaced", Font.PLAIN, 14));


        // Ajouter le JTextField à la fenêtre
        panel.add(textField, BorderLayout.SOUTH);

        // Ajouter le panel à la fenêtre
        frame.add(panel);

        // Afficher la fenêtre
        frame.setVisible(true);

        // Démarrer l'application avec un message d'introduction
        displayMessage("Bienvenue dans le Whiskerscan terminal !");

        flow.inputFlow();
    }


}
