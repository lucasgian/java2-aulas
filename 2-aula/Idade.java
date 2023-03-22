import java.util.Scanner;

class Idade {
    public static void main(String[] args) {
        Scanner stringScanner = new Scanner(System.in);
        System.out.println("Por favor informe sua idade");
        int minhaIdade = stringScanner.nextInt();

        System.out.println(minhaIdade + " anos, é uma boa idade ");
        stringScanner.close();
    }
}