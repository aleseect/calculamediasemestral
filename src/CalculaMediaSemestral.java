import java.util.Scanner;

public class CalculaMediaSemestral {

    public static void main (String[]args){
        Scanner meuScanner = new Scanner(System.in);//instancia o obj

        System.out.println("/****** SISTEMA DE GESTÃO DE CÁLCULO DA MÉDIA SEMESTRAL *******/ ");
        System.out.println("Insira o nome da primeira aluna ");

        String nomePrimeraAluna = meuScanner.nextLine();
        System.out.println("Insira a nota do primeiro bimestre da aluna " +nomePrimeraAluna);
        Float n1 = meuScanner.nextFloat();
        System.out.println("Insira a nota do segundo bimestre da aluna " +nomePrimeraAluna);
        Float n2 = meuScanner.nextFloat();

        float mediaAluna1 = (n1 + n2) /2;
        System.out.println("A média da aluna "+nomePrimeraAluna+ " é " +mediaAluna1);

    }
}
