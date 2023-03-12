import java.util.Scanner;

public class Calculadora {
    private int n;

    public void setN(int n) {
        this.n = n;
    }
    
    public static void main(String[] args) {
    	int suc; 
        Calculadora calculadora = new Calculadora();
        Scanner reader = new Scanner(System.in); 
        System.out.println("Por favor introduce cuantos numeros quieres calcular");
        suc= reader.nextInt();
        calculadora.setN(suc);
        
        int[] primos = calculadora.calcularPrimos();
        int[] fibonacci = calculadora.calcularFibonacci();
        System.out.println("Números primos:");
        for (int primo : primos) {
            System.out.println(primo);
        }
        System.out.println("Sucesión de Fibonacci:");
        for (int numero : fibonacci) {
            System.out.println(numero);
        }
    }

    public int[] calcularPrimos() {
        int[] primos = new int[n];
        int contador = 0;
        int numero = 2;
        while (contador < n) {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                primos[contador] = numero;
                contador++;
            }
            numero++;
        }
        return primos;
    }

    public int[] calcularFibonacci() {
        int[] fibonacci = new int[n];
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            fibonacci[i] = a;
            int auxiliar = a;
            a = b;
            b = auxiliar + b;
        }
        return fibonacci;
    }


}
