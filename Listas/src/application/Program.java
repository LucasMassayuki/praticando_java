package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2, "Marco");// Na posição 2 adiciona o "Marco"

		System.out.println(list.size());// Consegue ver o tamanho da lista

		// list.remove("Ana");//Remove da lista tanto na posição list.remove(1);

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("--------------");
		list.removeIf(x -> x.charAt(0) == 'M');// Predicado removendo nomes com 'M'
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("--------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));// mostra a posição da lista
		System.out.println("Index of Marco: " + list.indexOf("Marco"));// quando não encontra retorna -1

		System.out.println("--------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		// Filtrando a lista pegando os nomes que tem 'A'
		for (String x : result) {
			System.out.println(x);
		}

		System.out.println("--------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		// pega o primeiro que achar da lista com a letra 'A', se não tem volta null
		System.out.println(name);

	}

}
