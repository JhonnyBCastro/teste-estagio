import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) throws Exception {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com um numero: ");
        num = scanner.nextInt();
        scanner.close();
        System.out.println(sequenciaFibonacci(num));
    }

    public static String sequenciaFibonacci(int num){
        int valorUm = 0;
        int valorDois = 1;

        while (valorUm <= num) {  
            if (valorUm == num || valorDois == num) {
                return "O numero pertence a sequencia de fibonacci";
            }
            valorUm += valorDois;
            valorDois += valorUm;   
             
        }
        return "O numero nao pertence a sequencia de fibonacci";
        
    }
}
