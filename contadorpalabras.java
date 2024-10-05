import java.util.Scanner;

public class contarpalbras {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un texto para analizar:");
        String texto = scanner.nextLine().toLowerCase();

        
        int totalLetras = 0;
        int totalPalabras = 0;
    

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c >= 'a' && c <= 'z') {
                
                totalLetras++;
                
            } if (c == ' ' && i > 0 && texto.charAt(i - 1) != ' ') {
                totalPalabras++;
            }
        }
        totalPalabras++; 

        System.out.println("la palabra del texto:");
        System.out.println("cantidad de letras: " + totalLetras);
        System.out.println("cantidad  de palabras: " + totalPalabras);
        
        
        
        scanner.close();
        
    }
}
