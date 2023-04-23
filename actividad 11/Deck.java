import java.util.ArrayList; 
import java.util.Collections;
import java.util.Scanner;

public class Deck {
	private static int length;
	private ArrayList<Card> cards; 
	private int cartasdisponibles;
	private int opcion; 
	
	public Deck(){
		
		cards = new ArrayList<Card>(); 
		cartasdisponibles = Deck.length; 
		String color; 
		String[] suits = {"treboles", "corazones", "picas", "diamantes"};
		String[] values =  {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		
		for(String suit : suits) {
			if( suit == "treboles" || suit == "picas" ) {
				color = "negro"; 
				for (String value : values) {
					Card card = new Card(suit, color, value); 
					cards.add(card); 
					}
				}else {
					color = "rojo"; 
					for (String value : values) {
						Card card = new Card(suit, color, value); 
						cards.add(card); 
							}
					}
				}
		}	
	


	public void shuffle(){ 
		Collections.shuffle(cards);
		System.out.println("Se mezcló el Deck"); 
		}

	public Card head() throws Exception{
		if (cards.isEmpty()) {
		throw new Exception("No hay suficientes cartas");
			}
		Card card = cards.get(0); 
		System.out.println(" ");
		System.out.println("La primera carta del deck es: "); 
		cards.remove(0); 
		System.out.println(card.toString()); 
		System.out.println("Quedan " + cards.size() + " cartas en el deck. "); 
		return card; 
	}
	
	public Card pick() throws Exception{
		if (cards.isEmpty()) {
			throw new Exception("No hay suficientes cartas");
			}
		System.out.println(" "); 
		System.out.println("La carta que tomaste fue: "); 
		int randomIndex = (int) (Math.random() * cards.size()); 
		Card card = cards.get(randomIndex); 
		cards.remove(randomIndex); 
		System.out.println(card.toString()); 
		System.out.println("Quedan  " + cards.size() + "  cartas en el Deck." );
		return card;
	}
	
	public ArrayList<Card> hand() throws Exception{
		if (cards.isEmpty()) {
			throw new Exception("No hay suficientes cartas");
		}
		ArrayList<Card> hand = new ArrayList<Card>(); 
		System.out.println(" "); 
		System.out.println("Estas son tus cartas:  "); 
		
		for(int i= 0; i < 5; i++) {
			System.out.println(" ");
			System.out.println("Tu carta numero  " + (i+1) + " es: "); 
			Card card = pick(); 
			hand.add(card); 
			}
		System.out.println("Quedan " +cards.size() + " cartas en el deck" );
		return hand; 
		}
	
	public void cambiar(int numCards) throws Exception{
		if (numCards > 5 || numCards < 0) {
			System.out.println("Ingresa el número de cartas que quieras cambiar de 0 a 5"); 
			return; 
			}
			ArrayList<Card> newCards = new ArrayList<Card>();
			
				for (int i = 0; i < numCards; i++) {
					int index = (int) (Math.random() * cards.size() ); 
					Card card = cards.get(index); 
					newCards.add(card); 
					cards.remove(index); 
					}
				System.out.println("Se cambiaron " + numCards +" cartas "); 
					for(Card card: newCards) {
					System.out.println(card); 
						}
					System.out.println("Quedan " + cards.size() +" cartas en el deck."); 
			}

	
		public int Menu() {
			int opcion = 0; 
			Scanner scanner = new Scanner(System.in); 
			do {
				try {
					System.out.println("Bienvenido al programa para jugar Poker ");
					System.out.println("¿Qué opción quieres?");
					System.out.println("1. Mezclar el Deck");
					System.out.println("2. Mostrar la primera carta del deck ");
					System.out.println("3. Seleccionar una carta al azar");
					System.out.println("4. Tomar una mano de 5 cartas");
					System.out.println("5. Cambiar cartas ");
					System.out.println("0. Salir ");
					opcion = scanner.nextInt();
					
					
					switch (opcion) {
					case 1: 
						shuffle(); 
						break; 
					case 2:
						head(); 
						break; 
							
					case 3: 
						pick(); 
						break; 
							
					case 4: 
						hand(); 
						break; 
							
					case 5: 
						System.out.println("¿Cuántas cartas quieres cambiar?"); 
						int numCardsToChange = scanner.nextInt(); 
						cambiar(numCardsToChange);
						break; 
							
					case 0: 
						System.out.println("Gracias por jugar"); 
						System.exit(0); 
						
					default: 
						System.out.println("Opcion no valida");
						}
					
				}catch (Exception e) {
					System.out.println(e.getMessage()); 
				}
			} while (opcion !=0); 

			return opcion; 
		 		
		}
}