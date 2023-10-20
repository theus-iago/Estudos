import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import Usuarios.Clientes;

public class Index {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList lista = new ArrayList();
    Clientes cl = new Clientes();
    
    int op = 0;
    int cont = 0;
    float valor;
    
    do {
      System.out.println("|=========================================================");
      System.out.println("|\tBanco");
      System.out.println("|=========================================================");
      System.out.println("|  Menu");
      System.out.println("|=========================================================");
      System.out.println("|1-Cadastrar");
      System.out.println("|=========================================================");
      System.out.println("|2-Visualizar");
      System.out.println("|=========================================================");
      System.out.println("|3-Depositos");
      System.out.println("|=========================================================");
      System.out.println("|4-Saques");
      System.out.println("|=========================================================");
      System.out.println("|5-Visualizar Saldo");
      System.out.println("|=========================================================");
      System.out.println("|6-Sair");
      System.out.println("|=========================================================");
      System.out.print("|Digite a sua opcao:");
      op = sc.nextInt();
      System.out.println("|=========================================================");
      switch(op) {
        case 1:
          cl = new Clientes();
          System.out.println("|\tCadastro");
          System.out.println("|=========================================================");
          System.out.print("|Digite o seu nome:");
          cl.setNome(sc.next());
          System.out.println("|=========================================================");
          System.out.print("|Digite a sua idade:");
          cl.setIdade(sc.nextInt());
          System.out.println("|=========================================================");
          lista.add(cl);
          break;
        case 2:
          Iterator i = lista.iterator();
          System.out.println("|Clientes Cadastrados");
          System.out.println("|=========================================================");
          while(i.hasNext()) {
            cl = (Clientes) i.next();
            System.out.println("| •"+ cl.getNome());
          }
          System.out.println("|=========================================================");
          break;
          case 3 :
            System.out.println("|Setor de Depositos");
          System.out.println("|=========================================================");
            System.out.print("|Digite o valor que voce deseja depositar:");
            valor = sc.nextFloat();
            cl.depositar(valor);
          System.out.println("|=========================================================");
            break;
          case 4:
            System.out.println("|Setor de Saques");
          System.out.println("|=========================================================");
            System.out.print("|Digite o valor que voce deseja sacar:");
            valor = sc.nextFloat();
          System.out.println("|=========================================================");
            if(cl.getSaldo() < valor) {
              System.out.println("|Saldo Insuficiente!");
            }else {
              cl.sacar(valor);
              System.out.println("|Saque realizado com sucrsso!");
            }
          System.out.println("|=========================================================");
            break;
          case 5:
            System.out.println("|Saldo: "+cl.getSaldo());
          System.out.println("|=========================================================");
            break;
        default:
        System.out.println("|Esta opcao nao existe!");
      System.out.println("|=========================================================");
          break;
        case 6:
          System.out.println("|Deseja mesmo sair?");
      System.out.println("|=========================================================");
          System.out.println("|1-Sim");
      System.out.println("|=========================================================");
          System.out.println("|2-Nao");
      System.out.println("|=========================================================");
          System.out.print("|Digite a opcao:");
          op = sc.nextInt();
      System.out.println("|=========================================================");
          if(op == 1) {
            System.out.println("|Good Bye!");
      System.out.println("|=========================================================");
            op = 6;
          }else {
           break;
          }
      }
    }while(op!=6);
  }
}
