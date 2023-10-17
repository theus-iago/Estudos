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
      System.out.println("|===================================");
      System.out.println("|\tBanco");
      System.out.println("|===================================");
      System.out.println("|  Menu");
      System.out.println("|===================================");
      System.out.println("|1-Cadastrar");
      System.out.println("|===================================");
      System.out.println("|2-Visualizar");
      System.out.println("|===================================");
      System.out.println("|3-Sair");
      System.out.println("|===================================");
      System.out.print("|Digite a sua opcao:");
      op = sc.nextInt();
      System.out.println("|===================================");
      switch(op) {
        case 1:
          System.out.println("|\tCadastro");
      System.out.println("|===================================");
          System.out.print("|Digite o seu nome:");
          nome = sc.next();
      System.out.println("|===================================");
          System.out.print("|Digite a sua idade:");
          idade = sc.nextInt();
      System.out.println("|===================================");
          lista.add(nome);
          break;
        case 2:
          break;
        default:
        System.out.println("|Esta opcao nao existe!");
      System.out.println("|===================================");
          break;
        case 3:
          System.out.println("|Deseja mesmo sair?");
      System.out.println("|===================================");
          System.out.println("|1-Sim");
      System.out.println("|===================================");
          System.out.println("|2-Nao");
      System.out.println("|===================================");
          System.out.print("|Digite a opcao:");
          op = sc.nextInt();
      System.out.println("|===================================");
          if(op == 1) {
            System.out.println("|Good Bye!");
      System.out.println("|===================================");
            op = 3;
          }else {
           break;
          }
      }
    }while(op!=3);
  }
}
