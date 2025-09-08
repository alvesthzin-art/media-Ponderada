import java.util.Scanner;

public class media {

    String nome;
    double peso1;
    double peso2;
    double peso3;
    double nota1;
    double nota2;
    double nota3;
    double valormedia;


    public void obterDados(){

        Scanner leitorString = new Scanner(System.in);
        Scanner leitordouble = new Scanner(System.in);

        System.out.print("Digite o nome do(a) aluno(a):");
                nome = leitorString.nextLine();

        System.out.print("Digite sua primeira nota: ");
                 nota1 = leitordouble.nextDouble();

        System.out.print("Digite sua segunda nota: ");
                 nota2 = leitordouble.nextDouble();

        System.out.print("Digite sua terceira nota: ");
                 nota3 = leitordouble.nextDouble();

        System.out.print("Digite o peso da nota 1: ");
                 peso1 = leitordouble.nextDouble();

        System.out.print("Digite o peso da nota 2: ");
                 peso2 = leitordouble.nextDouble();

        System.out.print("Digite o peso da nota 3: ");
                 peso3 = leitordouble.nextDouble();



        exibirResultados();

    }

    public void calcularmedia() {
        valormedia = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3)
                / (peso1 + peso2 + peso3);

    }
        public void exibirResultados(){
            calcularmedia();
            System.out.println("*****************************************************");
            System.out.println("Nome do(a) aluno(a) : "+ nome);
            System.out.println("A média do(a) aluno(a) é: "+ valormedia);
            System.out.println("Programa encerrado.");
            System.out.println("*****************************************************");


    }

}
