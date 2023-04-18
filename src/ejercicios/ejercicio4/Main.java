package ejercicios.ejercicio4;

public class Main {
    public static void main(String[] args) {
        // ^ Definimos un array de 10 posiciones de tipo Electrodomestico
        Electrodomestico aparatos[] = {
            new Electrodomestico(),
            new Electrodomestico(50, 80),
            new Electrodomestico(90, 40, "rojo", "A"),
            new Lavadora(),
            new Lavadora(100, 60),
            new Lavadora(150, 30, "azul", "B", 40),
            new Television(),
            new Television(200, 20),
            new Television(700, 25, "negro", "F", 75, true),
            new Television(150, 10, "blanco", "E", 35, false)
        };

        // ^ Definimos 4 variables para guardar los diferentes precios
        float precioElectrodomesticos = 0, precioLavadoras = 0, precioTelevisores = 0;

        // ! Recorremos el Array
        for (int pos = 0; pos < aparatos.length; pos++) {
            // ^ Definimos una variable precioActual con el precio del electrodoméstico actual
            float precioActual = aparatos[pos].precioFinal();

            // ! Imprimimos el precio base y final
            System.out.printf("Tipo de Producto: %s\n", aparatos[pos].getClass().getSimpleName());
            System.out.printf("El precio base es: %s\n", aparatos[pos].getPrecioBase());
            System.out.printf("El precio final es: %s\n", precioActual);

            if (aparatos[pos] instanceof Television) { // ? Si el objeto es de tipo Televisión
                precioTelevisores += precioActual;
            } else if (aparatos[pos] instanceof Lavadora) { // ? Si el objeto es de tipo Lavadora
                precioLavadoras += precioActual;
            } else if (aparatos[pos] instanceof Electrodomestico) { // ? Si el objeto es de tipo Electrodoméstico
                precioElectrodomesticos += precioActual;
            }
            
            // ? Salto de Línea Triple
            System.out.println("\n-------------------------------\n");

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // ! Imprimimos los precios totales
        System.out.printf("El precio total de los electrodomésticos es: %s\n", precioElectrodomesticos);
        System.out.printf("El precio total de las lavadoras es: %s\n", precioLavadoras);
        System.out.printf("El precio total de las televisores es: %s\n", precioTelevisores);
        System.out.printf("El precio total de todos los electrodomésticos es: %s\n", precioElectrodomesticos + precioLavadoras + precioTelevisores);
    }
}
