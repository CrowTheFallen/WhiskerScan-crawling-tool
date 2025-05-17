package dev.crowthefallen.whiskerscan.classes;


import java.util.Arrays;

public class Urls {
    public String[] Urls(String[] input) {
        return input;
    }

    public String Validation(String[] input){
        // Exemple d'interaction simple pour récupérer l'URL de départ
        for (String url: input) {
            if (url.toLowerCase().contains("http://") || url.toLowerCase().contains("https://")) {
                Urls(input);
            } else {
                return "URL invalide. Essayez encore !";
            }
        }
        return "URL acceptée : " + Arrays.toString(input);
    }
}
