package dev.crowthefallen.whiskerscan.designs;

import java.util.Arrays;

import static dev.crowthefallen.whiskerscan.designs.Box.textField;
import static dev.crowthefallen.whiskerscan.designs.DisplayMessage.displayMessage;
import static dev.crowthefallen.whiskerscan.designs.HandleUserInput.flag;
import static dev.crowthefallen.whiskerscan.designs.HandleUserInput.handleUserInput;

public class InputFlow {
    static String[] websites = new String[0];
    static int pages = 0;
    private static int currentStep = 0; // 0 = URL, 1 = Pages, etc.

    public void inputFlow() {
        displayMessage("URL");

        textField.addActionListener(e -> {
            String input = textField.getText();
            textField.setText("");

            switch (currentStep) {
                case 0 -> {
                    websites = input.split(",");
                    handleUserInput(websites);
                    if (!flag){
                        displayMessage("Profondeur");
                        currentStep++;
                    }

                }
                case 1 -> { // Pages
                    handleUserInput(input); // handle number of pages
                    if (!flag){
                        displayMessage("Delais"); // ou fin
                        currentStep++;
                    }
                }
                case 2 -> { // Pages
                    handleUserInput(input); // handle number of pages
                    if (!flag){
                        displayMessage("Format de sortie"); // ou fin
                        currentStep++;
                    }
                }
                case 3-> { // Pages
                    handleUserInput(input); // handle number of pages
                    if (!flag){
                        displayMessage("Chemin de sortie"); // ou fin
                        currentStep++;
                    }
                }
                case 4 -> { // Pages
                    handleUserInput(input); // handle number of pages
                    if (!flag){
                        displayMessage("Respect de Robot.txt"); // ou fin
                        currentStep++;
                    }
                }
                case 5 -> { // Pages
                    handleUserInput(input); // handle number of pages
                    if (!flag){
                        displayMessage("userAgent"); // ou fin
                        currentStep++;
                    }
                }
                case 6 -> { // Pages
                    handleUserInput(input); // handle number of pages
                    if (!flag){
                        displayMessage("Nombre de page visité maximum"); // ou fin
                        currentStep++;
                    }
                }
                case 7 -> { // Pages
                    handleUserInput(input); // handle number of pages
                    if (!flag){
                        displayMessage("Suivre sous domaine"); // ou fin
                        currentStep++;
                    }
                }
                case 8 -> { // Pages
                    handleUserInput(input); // handle number of pages
                    if (!flag){
                        displayMessage("Keywords"); // ou fin
                        currentStep++;
                    }
                }
                case 9 -> { // Pages
                    handleUserInput(input); // handle number of pages
                    if (!flag){
                        displayMessage("Exclusion d'extension"); // ou fin
                        currentStep++;
                    }
                }
                case 10 -> { // Pages
                    handleUserInput(input); // handle number of pages
                    if (!flag){
                        displayMessage("Autre chose ?"); // ou fin
                        currentStep++;
                    }
                }
                default -> displayMessage("Toutes les données sont saisies !");
            }
        });
    }
}
