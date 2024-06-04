package functionalIinterface.streamApi;

import java.util.Arrays;
import java.util.List;

public class Desafio16 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPares = numeros.stream()
                .distinct()
                .filter(num -> num % 2 == 0)
                .toList();

        List<Integer> numerosImpares = numeros.stream()
                .distinct()
                .filter(num -> num % 2 != 0)
                .toList();

        System.out.println("Os números pares são: " + numerosPares);
        System.out.println("Os números ímprares são: " + numerosImpares);
    }
}
