package dev.crowthefallen.whiskerscan.designs;

import static dev.crowthefallen.whiskerscan.designs.Box.textArea;

public class DisplayMessage {
    // Afficher un message dans la "console"
    static void displayMessage(String message) {
        textArea.append(message + "\n");
        textArea.setCaretPosition(textArea.getDocument().getLength()); // Scroll to bottom
    }
}
