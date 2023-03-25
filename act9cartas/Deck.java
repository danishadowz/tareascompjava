package juegocartas;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane; 

public class Deck {
    private ArrayList<Card> cards;
    
    public Deck() {
        cards = new ArrayList<Card>();
        String color; 
        String[] suits = {"treboles", "corazones", "picas", "diamantes"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};
        
        for (String suit : suits) {
            	if (suit == "treboles" || suit == "picas"){
            		color= "negro"; 
            		for (String value : values) {
                        Card card = new Card(suit, color, value);
                        cards.add(card);
            		}
            	}else{
            		color="rojo";
            		for (String value : values) {
                        Card card = new Card(suit, color, value);
                        cards.add(card);        
            		}
            	}
        }
    }
    
    public void shuffle() {
        Collections.shuffle(cards);
        System.out.println("Se mezcló el Deck.");
    }
    
    public Card head() {
        Card card = cards.get(0);
        System.out.println(" ");
        System.out.println("La primera carta del deck es:  ");
        cards.remove(0);
        System.out.println(card.toString());  
        System.out.println("Quedan " + cards.size() + " cartas en el Deck.");
        return card;
    }
    
    public Card pick() {
    	System.out.println(" "); 
    	System.out.println("La carta que te salio fue: "); 
        int randomIndex = (int) (Math.random() * cards.size());
        Card card = cards.get(randomIndex);
        cards.remove(randomIndex);
        System.out.println(card.toString());
        System.out.println("Quedan " + cards.size() + " cartas en el Deck.");
        return card;
    }
    
    public ArrayList<Card> hand() {
        ArrayList<Card> hand = new ArrayList<Card>();
        System.out.println(" "); 
        System.out.println("Estas sontus cartas: "); 
        for (int i = 0; i < 5; i++) {
        	System.out.println(" ");
        	System.out.println("Tu carta numero " + (i+1) + " es: " );
            Card card = pick();
            hand.add(card);
        }
        System.out.println("Quedan " + cards.size() + " cartas en el Deck.");
        return hand;
    }


public void cambiar(int numCards) {
    if (numCards > 5 || numCards < 0) {
        System.out.println("Debe ingresar un número de 0 a 5.");
        return;
    }
    ArrayList<Card> newCards = new ArrayList<Card>();
    for (int i = 0; i < numCards; i++) {
        int index = (int) (Math.random() * cards.size());
        Card card = cards.get(index);
        newCards.add(card);
        cards.remove(index);
    }
    System.out.println("Se cambiaron " + numCards + " cartas.");
    for (Card card : newCards) {
        System.out.println(card);
    }
    System.out.println("Quedan " + cards.size() + " cartas en deck.");
	}


public void Menu() {
    String[] options = {"Mezclar el deck", "Mostrar la primera carta del deck", "Seleccionar una carta al azar", "Tomar una mano de 5 cartas", "Cambiar cartas", "Salir"};
    int choice = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Menú de Deck", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

    switch (choice) {
        case 0:
            shuffle();
            break;
        case 1:
            head();
            break;
        case 2:
            pick();
            break;
        case 3:
            hand();
            break;
        case 4:
            int numCardsToChange = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas cartas quieres cambiar? (0 a 5)"));
            cambiar(numCardsToChange);
            break;
        default:
            System.exit(0);
    }

    Menu();
}

}








