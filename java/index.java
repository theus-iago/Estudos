import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class Index {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> lista = new ArrayList<String>();
    
    lista.add("Matheus");
    lista.add("Julio");
    lista.add("Pedro");
    lista.add("Joao");
    
    Iterator<String> iterator = lista.iterator();
    while(iterator.hasNext()) {
      String elemento = iterator.next();
      System.out.println(elemento);
    }
  }
}