import java.util.Scanner;

public class CalculaMediaSemestral {

    public static void main (String[]args){
        Scanner meuScanner = new Scanner(System.in);//instancia o obj

        //Variaveis
        int menor =0, maior=0; //comparativa
        int tamanho = 6; //tamanho do vetor
        int pos,posMenor;//posicao do vetor

        int notas[] = new int[tamanho]; //declara vetor

        System.out.println("/****** Gestão de Notas Semestrais ******/");
        System.out.println("Digite a nota da prova, projeto e exercícios referente ao 1º e 2º bimestre");
        for(pos=0; pos<tamanho;pos++){

            System.out.printf("Digite a%2da. nota :",(pos+1));
            notas[pos] = meuScanner.nextInt();
            //armazena o maior numero
            if(notas[pos] > maior){
               maior = notas[pos];
            }
        }
       menor = maior; //o valor maior é atribuido ao menor, entra na condicional

        //repetição menor valor
        for(posMenor=0; posMenor<tamanho;posMenor++){
            if(notas[posMenor] < menor){//pega os valores digitados e compara com a variavel 'menor'
                menor = notas[posMenor];//se for menor que o valor da variavel, passa a ser a nova pos
            }
        }
        System.out.println("maior numero " +maior);
        System.out.println("menor numero" +menor);

        int primeiroBimestre = (notas[0] + notas[1] + notas[2])/3 ;
        int segundoBimestre = (notas[3] + notas[4] + notas[5])/3;
        int media = (primeiroBimestre + segundoBimestre) /2;

        if(media >= 8){
            System.out.println("Aluna aprovada com média de " +media);
        }
        if(media < 7.9 & media >5){
            System.out.println("Aluna terá que realizar Avaliação Final, média atual " +media);
        }
        else{
            System.out.println("Aluna reprovada com média " +media);
        }

    }
}
