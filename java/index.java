import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class Index {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList lista = new ArrayList();
    String nome;
    int idade;
    int op = 0;
    int cont = 0;
    do {
      System.out.println("\n\tBanco\n");
      System.out.println("Menu\n");
      System.out.println("1-Cadastrar\n");
      System.out.println("2-Visualizar\n");
      System.out.println("3-Sair\n");
      System.out.println("Digite a sua opcao:");
      op = sc.nextInt();
      switch(op) {
        case 1:
          System.out.println("\n\tCadastro\n");
          System.out.println("Digite o seu nome:");
          nome = sc.next();
          System.out.println("Digite a sua idade:");
          idade = sc.nextInt();
          lista.add(nome);
          break;
        case 2:
          break;
        default:
        System.out.println("Esta opcao nao existe!");
          break;
        case 3:
          System.out.println("Deseja mesmo sair?");
          System.out.println("1-Sim\n");
          System.out.println("2-Nao\n");
          System.out.println("Digite a opcao:");
          op = sc.nextInt();
          if(op == 1) {
            System.out.println("Good Bye!");
            op = 3;
          }else {
           break;
          }
      }
    }while(op!=3);
  }
}