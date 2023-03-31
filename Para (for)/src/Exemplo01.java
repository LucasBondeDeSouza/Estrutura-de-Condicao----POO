import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int num, i;

        System.out.println("Entre com um número:");
        num = (sc.nextInt());

        for(i=0; i<=10; i++){
            System.out.println(num*i);
        }
    }
}
