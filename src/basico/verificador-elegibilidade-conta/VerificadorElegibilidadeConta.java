import java.util.Scanner;

public class VerificadorElegibilidadeConta {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Digite sua idade para cria a conta : ");
int idade = scanner.nextInt();

if(idade >= 18){
        System.out.println("Você esta elegivel para criar uma conta bancaria");
    }else{
        System.out.println("Você não esta elegivel para criar uma conta bancaria");
    }
    scanner.close();    
} 
}
