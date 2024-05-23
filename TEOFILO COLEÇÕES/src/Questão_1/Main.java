package Questão_1;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		
		 nomes.add("Alice");
		 nomes.add("Bob");
		 nomes.add("Carlos");
		
		 System.out.println("Nomes na lista: " + nomes);
		 
		 nomes.remove("Bob");
		 System.out.println("Após remover 'Bob': " + nomes);
		 
		 boolean containsAlice = nomes.contains("Alice");
		 System.out.println("A lista contém 'Alice'? " + containsAlice);
		 
		 int size = nomes.size();
		 System.out.println("Quantidade de nomes na lista: " + size);

	}

}
