import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int num, soma;

        soma = 0;

        do{
            System.out.println("Digite um número:");
            num = (sc.nextInt());

            if(num % 2 != 0){
                soma = soma + num;
            }
        } while(num != 0);

        System.out.println("A soma dos números ímpares é: "+soma);
    }
}
