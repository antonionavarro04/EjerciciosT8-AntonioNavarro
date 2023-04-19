package ejercicios.ejercicio5;

import funciones.PerArrays;

public class Methods {
    public static Poligono poligonos[] = new Poligono[0];

    public static String menu() {
        return
        "Creador de Polígonos:"
        + "\n1. Introducir triángulo."
        + "\n2. Introducir rectángulo."
        + "\n3. Mostrar contenido del array."
        + "\n" + Main.SALIR + ". Salir."
        + "\n>>> "
        ;
    }

    public static void insert(double lado1, double lado2, double lado3) {
        poligonos = (Poligono[]) PerArrays.insertData(poligonos, new Triangulo(lado1, lado2, lado3));
    }

    public static void insert(double lado1, double lado2) {
        poligonos = (Poligono[]) PerArrays.insertData(poligonos, new Rectangulo(lado1, lado2));
    }

    public static String print() {
        String s = "";
        final int LAST = poligonos.length - 1;

        for (int pos = 0; pos < poligonos.length; pos++) {
            s += pos + 1 + ":\n";
            s += poligonos[pos].toString() + "\n";

            if (pos != LAST) {
                s += "\n\n";
            }
        } return s;
    }
}
