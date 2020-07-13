import java.util.Scanner;

public class SomaNumeros {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numeroDeSomas = obterNumeroDeSomas("Digite o número de somas que deseja realizar:");
        System.out.println("A soma dos números digitados é: "+somar(numeroDeSomas));

    }

    private static int obterNumeroDeSomas(String mensagemAoUsuario) {
        System.out.println(mensagemAoUsuario);
        return scanner.nextInt();
    }

    private static int somar(int numeroDeSomas) {
        int soma = 0;
        for (int numeroSendoSomadoNoMomento = 1; numeroSendoSomadoNoMomento <= numeroDeSomas; numeroSendoSomadoNoMomento++) {
            System.out.println("Digite o "+numeroSendoSomadoNoMomento+"O número da soma:");
            soma += scanner.nextInt();
        }
        return soma;
    }
}
