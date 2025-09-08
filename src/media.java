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

        System.out.print("Digite o nome do aluno:");
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
        valormedia = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

    }
        public void exibirResultados(){
            calcularmedia();
            System.out.println("*****************************************************");
            System.out.println("Digite o nome do aluno : "+ nome);
            System.out.println("Digite sua primeira nota: "+ nota1);
            System.out.println("Digite sua segunda nota: "+ nota2);
            System.out.println("Digite sua terceira nota: "+ nota3);
            System.out.println("Digite o peso da nota 1: "+ peso1);
            System.out.println("Digite o peso da nota 2: "+ peso2);
            System.out.println("Digite o peso da nota 3: "+ peso3);
            System.out.println("A média do aluno é: "+ valormedia);
            System.out.println("*****************************************************");


    }

}
