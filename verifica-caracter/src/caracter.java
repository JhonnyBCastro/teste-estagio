import java.util.Scanner;

public class caracter {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String texto;
        char caracter;

        System.out.println("Entre com o texto:");
        texto = scanner.nextLine();
        
        System.out.print("Entre com um caracter: ");
        caracter = scanner.nextLine().charAt(0);

        System.out.println(verificaCaracterNaString(texto.toLowerCase(), Character.toLowerCase(caracter)));

    }

    public static String verificaCaracterNaString(String text, char caracter){
        int quantidade = 0;
        char c;
        for(int cont = 0; cont < text.length(); cont++){
            c = text.charAt(cont);
            if (c == caracter) {
                quantidade++;
            }
        }
        if(quantidade > 0){
            return "Existe " + quantidade + " carateres (" + caracter + ") no texto.";
        }else{
            return "Existe " + quantidade + " carater (" + caracter + ") no texto.s";
        }
        
    }
}
