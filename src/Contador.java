import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int primeiroParametro;
        int segundoParametro;

        System.out.println("Informe o primeiro parâmnetro: ");
        primeiroParametro = scanner.nextInt();

        System.out.println("Informe o segundo parâmetro: ");
        segundoParametro = scanner.nextInt();

        try{
            contar(primeiroParametro, segundoParametro);
        }catch(ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }

        scanner.close();
    }

    public static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        if(primeiroParametro > segundoParametro)
            throw new ParametrosInvalidosException();

        int limiteContador = segundoParametro - primeiroParametro;

        for(int i = 0; i < limiteContador; i++) {
            System.out.println("Imprimindo o número " + (i+1) + ".");
        }
    }
}
