package dev.crowthefallen.whiskerscan.designs;

import static dev.crowthefallen.whiskerscan.designs.DisplayMessage.displayMessage;
import dev.crowthefallen.whiskerscan.classes.Urls;

import java.util.Arrays;

public class HandleUserInput {
    static Urls urls = new Urls();
    public static boolean flag;
    public static void handleUserInput(String[] input) {
        displayMessage("Vous avez entré : " + Arrays.toString(input));

        String result = urls.Validation(input);
        flag = result.equals("URL invalide. Essayez encore !");
        displayMessage(result);
    }
    public static void handleUserInput(String input) {
        displayMessage("Vous avez entré : " + input);

        String result = input;

        displayMessage(result);
    }
}
