package collectionMap.model;

import java.util.*;

public class LivroMain {

    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");

        Map<String,Livro> meusLivros = new HashMap<>(){{
            put("Frei Romano Zago", new Livro("Babosa não é remédio... mas cura!",125));
            put("Caíque Cardoso", new Livro("OO na Prática",175));
            put("Mayra, Gustavo", new Livro("O Reizinho Autista",108));

        }};
        for (Map.Entry<String,Livro> livros : meusLivros.entrySet())
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome());

        System.out.println("--\tOrdem Inserção\t--");
        Map<String,Livro> meusLivros1 = new LinkedHashMap<>(){{
            put("Frei Romano Zago", new Livro("Babosa não é remédio... mas cura!",125));
            put("Caíque Cardoso", new Livro("OO na Prática",175));
            put("Mayra, Gustavo", new Livro(" Reizinho Autista",108));

        }};
        for (Map.Entry<String,Livro> livros : meusLivros.entrySet())
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome());

        System.out.println("--\tOrdem alfabética autores\t--");
        Map<String,Livro>meusLivrosI = new TreeMap<>(meusLivros1);
        for (Map.Entry<String,Livro> livros : meusLivrosI.entrySet())
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome());

        System.out.println("\tOrdem alfabética nomes dos livros\t");
        Set<Map.Entry<String, Livro>> meusLivrosII = new TreeSet<>( new ComparatorNome());
        meusLivrosII.addAll(meusLivros.entrySet());
        for (Map.Entry<String,Livro> livros : meusLivrosII)
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome());
    }
}
