package functionalIinterface.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio17 {

    public static void main(String[] args) {
        // Desafio 17 - Filtrar os números primos da lista:
        // Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPrimos = numeros.stream()
                .distinct()
                .filter(Desafio17::seTemPrimo)
                .collect(Collectors.toList());

        if (!numerosPrimos.isEmpty()) {
            System.out.println("Números primos: " + numerosPrimos);
        } else {
            System.out.println("Não há números primos");
        }
    }

    private static boolean seTemPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
