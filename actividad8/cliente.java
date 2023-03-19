package juegocartas;

public class cliente{
    
    public static void main(String[] args) {
      
        
        Deck miDeck = new Deck();
        miDeck.shuffle();
        miDeck.head();
        miDeck.pick();
        miDeck.hand();
    }
}
