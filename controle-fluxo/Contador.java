import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = scanner.nextInt();

        try {
			contar(parametroUm,  parametroDois);
			System.out.println(" ");
		} catch (ParametrosInvalidosException e) {
			e.printStackTrace();		
		}
		
		scanner.close();
	}


    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número: " + (i + 1));
        }
    }
}

