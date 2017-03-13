package clientdesarenes;

import IA.Brain;
import jeu.Joueur;
import jeu.Plateau;

public class Bot extends jeu.Joueur implements reseau.JoueurReseauInterface {

    String key;
    
    Bot(String id, String cle) {
        super(id);
        key = cle;
    }
    
    @Override
    public Joueur.Action faitUneAction(Plateau t) {  
    	Brain brain = new Brain(t, this);
    	Action action = brain.run();
        System.out.println("Bot.faitUneAction: Je joue " + action); 
        return action;
    }
            
    @Override
    public String donneID() {
        return donneNom();
    }

    @Override
    public String donneCle() {
        return key;
    }

    @Override
    public void debutNouvellePartie() {
        System.out.println("Bot: La partie commence.");
    }

    @Override
    public void finDeLaPartie(Plateau t) {
        System.out.println("Bot: La partie est finie.");
    }

    @Override
    public void deconnecte() {
        System.out.println("Bot: On est déconnecté du serveur.");
    }
}
