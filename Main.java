import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
       System.out.println("escribe una linea");
       String linea=teclado.nextLine().toLowerCase();
       char[] letras=linea.toCharArray();
       int contador=0;
       int contadoro=0;
       for (int i = 0; i < letras.length; i++) {
           if (letras[i]=='a'||letras[i]=='e'||letras[i]=='i'||letras[i]=='o'||letras[i]=='u'){
               contador++;
               if (letras[i]=='o') contadoro++;
           }
       }
       System.out.println("Hay "+contador+" vocales.\nHi ha "+contadoro+" o.");
       try {
           FileWriter readme = new FileWriter("README.md");
           String text="Aquest programa conta cuantes vocals i cuantes 'o' hi ha.";
           readme.write(text);
           readme.close();
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
}

