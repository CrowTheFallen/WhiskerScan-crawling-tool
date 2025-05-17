package dev.crowthefallen.whiskerscan.classes;

public class UserAgent {
    public String UserAgent() {
        return null;
    }


    public String Validation(String input){
        // Exemple d'interaction simple pour récupérer l'URL de départ
        if (input.toLowerCase().contains("http://") || input.toLowerCase().contains("https://")) {

            return "URL acceptée : " + input;
            // Ici tu pourrais stocker l'URL, ou démarrer ton crawler, etc.
        } else {
            return "URL invalide. Essayez encore !";
        }
    }
}
