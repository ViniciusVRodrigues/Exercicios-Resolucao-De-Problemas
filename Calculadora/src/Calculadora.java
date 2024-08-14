import java.util.Scanner;

public class Calculadora {
    private float a,b,res;
    private Scanner scanner = new Scanner(System.in);
    public void inicializar(){
        System.out.println("Bem vindo a Calculadora!");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Qual operação deseja realizar? ");
        int escolha = scanner.nextInt();
        scanner.nextLine();
        switch (escolha){
            case 1:
                soma();
                break;
            case 2:
                subtracao();
                break;
            case 3:
                multiplicacao();
                break;
            case 4:
                divisao();
                break;
            default:
                break;
        }
    }

    public void pegarValores(){
        System.out.print("Digite o primeiro valor: ");
        a = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Digite o segundo valor: ");
        b = scanner.nextFloat();
        scanner.nextLine();
    }
    public void soma(){
        pegarValores();
        res = a+b;
        System.out.println("O resultado da soma foi "+res);
    }
    public void subtracao(){
        pegarValores();
        res = a-b;
        System.out.println("O resultado da subtração foi "+res);
    }
    public void multiplicacao(){
        pegarValores();
        res = a*b;
        System.out.println("O resultado da multiplicação foi "+res);
    }
    public void divisao(){
        pegarValores();
        res = a/b;
        System.out.println("O resultado da divisão foi "+res);
    }

}
