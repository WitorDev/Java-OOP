import java.util.*;

public class ArrayLista {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> nomes = new ArrayList<>(5);

    while(true) {
      System.out.print("Nome: ");
      String entrada = sc.nextLine().trim();
      if(entrada.equalsIgnoreCase("FIM")) break;
      if(!entrada.isEmpty()) nomes.add(entrada);
    }

    for (int i = nomes.size() - 1; i > 0 ; i--) {
      System.out.println(nomes.get(i));
    }

    System.out.println("\n");

    // lambda
    nomes.forEach(n -> System.out.println(n));

    System.out.print("Informe um nome a ser removido: "); // pedir nome, remover, solicitar e inserir um nome, procurar um nome qualquer, retornar o indice dele, inserir na segunda posição outro nome.
    String nomeRemovido = sc.nextLine();
    nomes.remove(nomeRemovido);

    System.out.println(nomes);

    System.out.print("Informe um nome a ser inserido: ");
    String nomeInserido = sc.nextLine();
    nomes.add(nomeInserido);

    System.out.println(nomes);

    System.out.print("Informe um nome a ser procurado: ");
    String nomeProcurado = sc.nextLine();
    int indiceNome = nomes.indexOf(nomeProcurado);
    System.out.println("O indice do item que procura é: " + indiceNome);

    System.out.println(nomes);

    System.out.print("Informe um nome a ser inserido depois dele: ");
    String nomeSegundaPos = sc.nextLine();
    nomes.add(indiceNome + 1, nomeSegundaPos);

    System.out.println(nomes);
  }
}