import java.util.Scanner; 

public class actividad5{
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		double num1, num2, suma, resta, multi, div, mod; 
		
		System.out.println("Bienvenido a la calculadora de numeros"); 
		System.out.println("Por favor, introduce el primer numero"); 
		num1= reader.nextDouble(); 
		System.out.println("Ahora, por favor introduce el segundo numero"); 
		num2= reader.nextDouble(); 
		
		suma= num1+num2; 
		
		resta= num1-num2;  
		
		multi= num1*num2; 
		
		div= num1/num2; 
				
		mod=num1%num2; 
		
		System.out.println("Aqui estan tus resultados");
		System.out.println("El primer numero es:  " +num1);
		System.out.println("El segundo numero es:  " +num2);
		System.out.println("El resultado de su suma es: " +suma);
		System.out.println("El resultado de su resta es:  " +resta);
		System.out.println("El resultado de su multiplicacion es:  "+multi);
		System.out.println("El resultado de su divison es:  " +div);
		System.out.println("El resultado de su modulo es: " +mod);
		
	}
	
}