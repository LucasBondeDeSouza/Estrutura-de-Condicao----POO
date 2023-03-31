import java.util.Scanner;

public class Exemplo02 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        float n1, soma;
        int i;

        soma = 0;

        for(i=1; i<=10; i++){
            System.out.println("Digite um número:");
            n1 = (sc.nextFloat());
            soma = soma + n1;
        }
        System.out.println("A somatória é: " +soma);
    }
}
