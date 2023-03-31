import java.util.Scanner;

public class Exemplo04 {

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        float media, soma;
        int num, qtde;
        char resp;

        soma = 0;
        qtde = 0;
        resp = 'S';

        while(resp == 's' || resp == 'S'){
            System.out.println("Digite um número:");
            num = (sc.nextInt());

            soma = soma + num;
            qtde = qtde + 1;

            System.out.println("Deseja continuar?");
            resp = sc.next().charAt(0);
        }

        media = soma / qtde;
        System.out.println("A média dos números digitados é: "+media);
    }
}