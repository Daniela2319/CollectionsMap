package collectionMap;

import javax.swing.*;
import java.util.*;

public class ExemplaMap {

    public static void main(String[] args) {

        System.out.println("Crie um dicionário que relacione os modelos e seus consumos:");
        Map<String,Double>carrosPopulares = new HashMap<>(){{
            put("Uno",14.2);
            put("Gol",15.6);
            put("Mobi",16.1);
            put("Fusca",14.5);
            put("Chevette",15.6);
        }};
        System.out.println(carrosPopulares);

        System.out.println("Substitua o consumo do Fusca por 15,2 km/l: ");
        carrosPopulares.put("Fusca",15.2); // chave ja existe só substituir
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo BMW está no dicionário: " + carrosPopulares.containsKey("BMW"));

        System.out.println("Exiba o consumo do Chevette: " + carrosPopulares.get("Chevette") + " km/l");

 //       System.out.println("Exiba o terceiro modelo adicionado:"); map não tem indice por isso não tem como exibir a posição.

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumo: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String,Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = " ";
        for (Map.Entry<String,Double> entry : entries){
            if (entry.getValue().equals(consumoMaisEficiente))
                modeloMaisEficiente = entry.getKey();
        }
        System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);

        System.out.println("Exiba o modelo menos econômico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = " ";
        for (Map.Entry<String,Double> entry : carrosPopulares.entrySet()){
            if (entry.getValue().equals(consumoMenosEficiente))
                modeloMenosEficiente = entry.getKey();

        }
        System.out.println("Modelo menos Eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);


        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos consumos: " + soma + " km/l");

        System.out.println("Exiba a média de consumos deste dicionário de carros: " + (soma/carrosPopulares.size()));

        System.out.println("Remova os modelos com o consumo igual a 16,1 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next().equals(16.1)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String,Double> carrosPopularesI = new LinkedHashMap<>(){{
            put("Chevette",14.5);
            put("Fusca",12.5);
            put("Brasilia",10.8);
            put("Gol", 18.1);
            put("Corse", 12.4);
        }};
        System.out.println(carrosPopularesI.toString());

        System.out.println("Exiba o dicionario ordenado pelo modelo");
        Map<String,Double>carrosAntigos = new TreeMap<>(carrosPopularesI);
        System.out.println(carrosAntigos);

        System.out.println("Apague o dicionario de carros: ");
        carrosAntigos.clear();

        System.out.println("Confira se o dicionario de carro está vazio: " + carrosAntigos.isEmpty());



    }
}
