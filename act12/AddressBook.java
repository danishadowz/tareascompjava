import java.util.HashMap; 
import java.util.Map; 
import java.util.Scanner; 
import java.io.File; 
import java.io.FileNotFoundException; 
import java.io.FileWriter; 
import java.io.IOException; 

public class AddressBook{
	private Map<String, String> contacts; 
	
	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();
		addressBook.load("src/contactos.txt");
		addressBook.menu(); 
		addressBook.save("src/contactos.txt"); 
	}
	
	
	public AddressBook() {
		contacts = new HashMap<String, String>(); 
	}
	
	public void load(String fileName) {
		try {
			File file = new File(fileName); 
			Scanner scanner = new Scanner(file); 
			
			while(scanner.hasNextLine() ) {
				String line = scanner.nextLine(); 
				String[] values = line.split(","); 
				contacts.put(values[0], values[1]); 
			}	
			scanner.close(); 
		} catch(FileNotFoundException e) {
			System.out.println("El archivo no existe"); 
		}
	}
	
	public void save(String fileName) {
		try {
			FileWriter writer = new FileWriter(fileName); 
			for(Map.Entry<String, String> entry : contacts.entrySet() ) {
				writer.write(entry.getKey() + "," + entry.getValue() + "\n" );
			}
			
			writer.close(); 
		} catch (IOException e){
			System.out.println("Hubo un error al guardar el archivo"); 
		}
	}

	public void list() {
		System.out.println("Contactos"); 
		
		for (Map.Entry<String, String> entry : contacts.entrySet() ) {
			System.out.println(entry.getKey() + " : " + entry.getValue()); 
		}
	}
	
	public void create() {
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Ingresa el nombre del contacto: "); 
		String name = scanner.nextLine(); 
		
		System.out.println("Ingresa el número de teléfono: ");
		String number = scanner.nextLine(); 
		
		contacts.put(name, number); 
		System.out.println("El contacto se guardo exitosamente "); 
	}
	
	public void delete() {
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Ingresa el nombre del contacto que deseas eliminar: "); 
		String name = scanner.nextLine(); 
		
		if (contacts.containsKey(name)) {
			contacts.remove(name); 
			System.out.println("El contacto ha sido eliminado"); 
		}else {
			System.out.println("El contacto no existe"); 
		}
	}
	
	public void menu() {
		Scanner scanner = new Scanner(System.in); 
		boolean quit = false; 
		
		while(!quit) {
			System.out.println("Selecciona una opción: "); 
			System.out.println("1. Ver contactos"); 
			System.out.println("2. Crear contacto"); 
			System.out.println("3. Eliminar contacto"); 
			System.out.println("4. Salir"); 
			
			int choice = scanner.nextInt();
			scanner.nextLine(); 
			
			switch(choice) {
			case 1: 
				list(); 
				break; 
				
			case 2: 
				create(); 
				break; 
				
			case 3: 
				delete(); 
				break; 
				
			case 4: 
				quit = true; 
				break; 
				
			default: 
				System.out.println("Opción inválida. ");
				break;
			}
		}
	}

	
}

