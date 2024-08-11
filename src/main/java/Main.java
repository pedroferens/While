import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

 System.out.println("Por favor insira sua senha:");

    int senha =  sc.nextInt();

  while( senha!= 2022) {
    System.out.println("Senha incorreta");
    System.out.println("Digite novamente:");
    senha = sc.nextInt();
  }
if (senha == 2022) {
      System.out.println("Acesso Permitido");
}

     sc.close();
  }
}