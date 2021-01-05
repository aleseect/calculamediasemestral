import java.util.Scanner;

public class CalculaMediaSemestral {

    public static void main (String[]args){
        Scanner meuScanner = new Scanner(System.in);//instancia o obj

        System.out.println("****** SISTEMA DE GESTÃO DE CÁLCULO DA MÉDIA SEMESTRAL *******");
        System.out.println("Insira o nome da primeira aluna ");

        String nomePrimeraAluna = meuScanner.nextLine();
        System.out.println("Insira primeira nota bimestral");
        Float n1 = meuScanner.nextFloat();
        System.out.println("Insira a segunda nota bimestral");
        Float n2 = meuScanner.nextFloat();

        float mediaAluna1 = (n1 + n2) /2;
        System.out.println("A média da aluna "+nomePrimeraAluna+ " é " +mediaAluna1);

        // Dados da Aluna 2

        System.out.println("Insira o nome da segunda aluna ");

        String nomeSegundaAluna = meuScanner.nextLine();
        System.out.println("Insira a primeira nota bimestral");
        Float n3 = meuScanner.nextFloat();
        System.out.println("Insira a segunda nota bimestral");
        Float n4 = meuScanner.nextFloat();

        float mediaAluna2 = (n3+n4)/2;
        System.out.println("A média da aluna" +nomeSegundaAluna+ " é " +mediaAluna2);

        //Dados da Aluna 3

    }
}
