import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {
    static void main() {
        while(true){
            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("Divisao de dois valores inteiros");
                int a, b, result;
                System.out.println("Digite o valor de a: ");
                a = Integer.parseInt(sc.nextLine());
                System.out.println("Digite o valor de b: ");
                b = sc.nextInt();
                result = a / b;
                System.out.println("Resultado: " + result);
                break;
            }catch (ArithmeticException e){
                System.out.println("Impossível dividir por zero");
            }catch (NumberFormatException e){
                System.out.println("Valor inválido na entrada de dados");
            }catch(InputMismatchException e){
                System.out.println("Valor deve ser inteiro");
            }catch(Exception e){
                System.out.println("Aconteceu um erro inexperado: ");
                System.out.println("Mensagem do erro: " + e.getMessage());
            }finally {
                System.out.println("Obrigado por usar o sistema");
            }

        }

    }
}
