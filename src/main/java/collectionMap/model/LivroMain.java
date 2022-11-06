package collectionMap.model;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

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
            put("Mayra, Gustavo", new Livro("O Reizinho Autista",108));

        }};
        for (Map.Entry<String,Livro> livros : meusLivros.entrySet())
            System.out.println(livros.getKey() + " - " + livros.getValue().getNome());




    }
}
