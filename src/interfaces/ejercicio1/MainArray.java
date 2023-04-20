package interfaces.ejercicio1;

import java.util.Arrays;

// ? Imports
import funciones.Mathematics;
import funciones.PerArrays;

public class MainArray {
    // ? Se basa en el Bubble Sort
    private static Socio[] sortArray(Socio[] a) {
        // ^ Hacemos una copia del array
        Socio[] b = Arrays.copyOf(a, a.length);

        // ? Ordenamos b
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length - 1; j++) {
                if (b[j].compareTo(b[j + 1]) > 0) {
                    Socio aux = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = aux;
                }
            }
        } return b;
    }

    public static void main(String[] args) {
        // ^ Definimos un array de tipo Socio
        Socio socios[] = {
            new Socio(Mathematics.rng(100, 0), "Pepe", Mathematics.rng(110, 0)),
            new Socio(Mathematics.rng(100, 0), "Antonio", Mathematics.rng(110, 0)),
            new Socio(Mathematics.rng(100, 0), "Juan", Mathematics.rng(110, 0)),
            new Socio(Mathematics.rng(100, 0), "Pedro", Mathematics.rng(110, 0)),
            new Socio(Mathematics.rng(100, 0), "Anael", Mathematics.rng(110, 0))
        };

        // ? Imprimimos el contenido del Array
        System.out.println(PerArrays.printArray(socios));

        // ! Ordenamos el Contenido del Array usando el metodo compareTo() de la clase Socio
        socios = sortArray(socios);

        // ? Imprimimos el contenido del Array
        System.out.println("\n---------------------\n\n" + PerArrays.printArray(socios));
    }
}
