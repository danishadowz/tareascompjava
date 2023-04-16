import java.util.Scanner; 

public class menu {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println(" "); 
			System.out.println("Selecciona la figura que deseas: ");
			System.out.println("1. Circulo");
			System.out.println("2. Triangulo"); 
			System.out.println("3. Cuadrado");
			System.out.println("4. Rectangulo"); 
			System.out.println("0. Salir");
			
			int opcion = scanner.nextInt(); 
			
			if(opcion == 0) {
				break; 
			}
			
			Shape shape = null;
			double resultado, resultado2 = 0; 
			
		switch(opcion){
				
		case 1: 
			System.out.println("Ingresa el radio del circulo");
			double radius = scanner.nextDouble(); 
			shape = new Circle(radius);
			
			resultado = shape.getArea(); 
			System.out.println("El area del circulo es: " +resultado);
			resultado2 = shape.getPerimeter();
			System.out.println("El permietro del circulo es: " +resultado2); 
			
			break;
			
		case 2: 
			System.out.println("Ingresa la medida de la base del triangulo"); 
			double base = scanner.nextDouble(); 
			System.out.println("Ingresa la altura del triangulo");
			double height = scanner.nextDouble();
			System.out.println("Ingresa la medida del primer lado");
			double side1 = scanner.nextDouble(); 
			System.out.println("Ingresa la medida del segundo lado"); 
			double side2 = scanner.nextDouble(); 
			System.out.println("Ingresa la medida del tercer lado(abajo)");
			double side3 = scanner.nextDouble(); 
			
			shape = new triangle(base, height, side1, side2, side3);
			resultado = shape.getArea(); 
			System.out.println("El area del triangulo es: " +resultado); 
			resultado2 = shape.getPerimeter();  
			System.out.println("El perimetro del triangulo es: " +resultado2); 
			
			break; 
			
		case 3: 
			System.out.println("Ingresa la medida del lado");
			double side = scanner.nextDouble(); 
			
			shape = new square(side); 
			resultado = shape.getArea(); 
			System.out.println("El area del cuadrado es: " +resultado); 
			resultado2 = shape.getPerimeter(); 
			System.out.println("El perimetro del cuadrado es: " +resultado2);
			
			break; 
		case 4: 
			System.out.println("Ingresa la medida de la base del rectangulo"); 
			double baser = scanner.nextDouble(); 
			System.out.println("Ingresa la medida de la altura del rectangulo"); 
			double alturar = scanner.nextDouble(); 
			
			shape = new rectangle(baser, alturar); 
			resultado= shape.getArea(); 
			System.out.println("El area del rectangulo es: "+resultado); 
			resultado2 = shape.getPerimeter(); 
			System.out.println("El perimetro del rectangulo es: " +resultado2); 
			break; 
			
			default: 
				System.out.println("Opcion no valida"); 
			}
		
		}
	}
	
}
