import java.util.Scanner;

public class App {
	
 public static void main(String args[]){

  Scanner entrada = new Scanner(System.in);

  System.out.print("Digite um numero ");
  double numero = entrada.nextDouble();

  System.out.println("O numero informado foi " + numero);

  entrada.close();

 }
}

 