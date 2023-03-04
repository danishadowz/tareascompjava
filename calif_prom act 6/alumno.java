import java.util.Scanner; 

public class alumno{
	private String nombre; 
	private double[] calificaciones = new double[5]; 
	
	public void ingresarDatos() {
		Scanner input = new Scanner(System.in); 
		System.out.print("Por favor, ingresa el nombre del estudiante: ");
		this.nombre = input.nextLine(); 
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Calificacion " +(i+1) +": " ); 
			this.calificaciones[i] = input.nextDouble(); 
		}
	}
	
	public double calcularPromedio() {
		double sum = 0; 
		for(double calificacion : this.calificaciones) {
			sum += calificacion; 
		}
		return sum / this.calificaciones.length; 
	}
	
	public char obtenerCalificacionFinal(double promedio){
		char calificacion; 
		if(promedio <= 50) {
			calificacion = 'F'; 
		} else if (promedio <= 60) {
			calificacion = 'E'; 
		} else if (promedio <= 70) {
			calificacion= 'D'; 
		} else if (promedio <= 80) {
			calificacion = 'C'; 
		} else if (promedio <= 90) {
			calificacion = 'B'; 
		} else {
			calificacion = 'A'; 
		}
		return calificacion; 
	}
	
	public void ImprimirResultados() {
		double promedio = this.calcularPromedio(); 
		char calificacion = this.obtenerCalificacionFinal(promedio); 
		System.out.println("Nombre del estudiante: " + this.nombre); 
		for (int i = 0; i < 5; i++) {
			System.out.println("Calificacion- "  +(i+1) +": " + this.calificaciones[i]); 
		}
		System.out.println("Su promedio es de: " +promedio );
		System.out.println("Y su nota es: " +calificacion); 
		
	}
}