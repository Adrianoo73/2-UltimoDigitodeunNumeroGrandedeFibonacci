import java.util.Scanner;

public class FibonacciLastDigit { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Ingrese el numero deseado: ");
        int n = scanner.nextInt(); 
        scanner.close(); 

        int lastDigit = getFibonacciLastDigit(n);
        System.out.println("El ultimo numero es: "+ lastDigit); 
    }

    // Método que calcula el último dígito del n-ésimo número de Fibonacci
    public static int getFibonacciLastDigit(int n) {
        if (n <= 1) {
            return n; 
        }

        int previous = 0; 
        int current = 1; 

        for (int i = 2; i <= n; i++) { 
            int temp = (previous + current) % 10; 
            previous = current; 
            current = temp; 
        }

        return current;
    }
}