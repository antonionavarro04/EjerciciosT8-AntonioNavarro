package interfaces.ejercicio1;

// ? Imports
import funciones.Mathematics;
import funciones.PerArrays;

public class MainArray {
    // ? Se basa en el Bubble Sort
    private static void sortArray(Socio[] socios) {
        for (int i = 0; i < socios.length; i++) {
            for (int j = 0; j < socios.length - 1; j++) {
                if (socios[j].compareTo(socios[j + 1]) > 0) {
                    Socio aux = socios[j];
                    socios[j] = socios[j + 1];
                    socios[j + 1] = aux;
                }
            }
        }
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
        sortArray(socios);

        // ? Imprimimos el contenido del Array
        System.out.println("\n---------------------\n\n" + PerArrays.printArray(socios));
    }
}
