import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("escribe una linea");
        String linea=teclado.nextLine().toLowerCase();
        char[] letras=linea.toCharArray();
        int contador=0;
        for (int i = 0; i < letras.length; i++) {
            if (letras[i]=='a'||letras[i]=='e'||letras[i]=='i'||letras[i]=='o'||letras[i]=='u'){
                contador++;
            }
        }
        System.out.println("Hay "+contador+" vocales.");
    }
}

