package juegocartas;

import java.util.ArrayList;
import java.util.Collections;

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
}
