import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        float nota1, nota2, media;
        int cont;

        cont = 1;

        while(cont<=10){
            System.out.println("Digite a primeira nota:");
            nota1 = (sc.nextFloat());
            System.out.println("Digite a segunda nota:");
            nota2 = (sc.nextFloat());

            media = (nota1 + nota2)/2;

            System.out.println("A média é "+media);

            cont = cont + 1;
        }
    }
}
