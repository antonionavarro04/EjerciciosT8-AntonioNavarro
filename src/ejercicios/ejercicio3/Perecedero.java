package ejercicios.ejercicio3;

/**
 * Clase que representa un producto perecedero, extiende la clase Producto
 * @author Antonio Navarro
 * @version 1.0 Release
 * @see Producto
 */
public class Perecedero extends Producto {
    /**
     * Dias que quedan hasta que el producto caduque
     */
    private int diasParaCaducar;

    /**
     * Constructor por Defecto
     */
    public Perecedero () {
        super();
        this.diasParaCaducar = 0;
    }

    /**
     * Constructor con Parámetros
     * @param nombre Nombre del Producto
     * @param precio Precio del Producto
     * @param diasParaCaducar Dias que quedan hasta que el producto caduque
     */
    public Perecedero (String nombre, float precio, int diasParaCaducar) {
        super(nombre, precio);

        if (diasParaCaducar < 0) {
            diasParaCaducar = 0;
        } this.diasParaCaducar = diasParaCaducar;
    }

    /**
     * @return Devuelve los dias que quedan hasta que el producto caduque
     */
    public int getDiasParaCaducar() {
        return diasParaCaducar;
    }

    /**
     * @param diasParaCaducar Establece los dias que quedan hasta que el producto caduque
     */
    public void setDiasParaCaducar(int diasParaCaducar) {
        if (diasParaCaducar < 0) {
            diasParaCaducar = 0;
        } this.diasParaCaducar = diasParaCaducar;
    }

    /**
     * @return Devuelve el precio del producto, se ve afectado según los dias que queden para que caduque
     */
    @ Override
    public float getPrecio() {
        float precioActual = super.getPrecio();
        float precioFinal;

        switch (diasParaCaducar) {
            case 3:
                precioFinal = precioActual / 2.0f;
                break;

            case 2:
                precioFinal = precioActual / 3.0f;
                break;

            case 1:
                precioFinal = precioActual / 4.0f;
                break;
        
            default:
                precioFinal = precioActual;
                break;
        } return precioFinal;
    }
    
    /**
     * Devuelve la información del producto perecedero
     * @return String con la información del producto perecedero
     */
    @ Override
    public String toString() {
        float precioActual = super.getPrecio();
        float precioFinal;

        switch (diasParaCaducar) {
            case 3:
                precioFinal = precioActual / 2.0f;
                break;

            case 2:
                precioFinal = precioActual / 3.0f;
                break;

            case 1:
                precioFinal = precioActual / 4.0f;
                break;
        
            default:
                precioFinal = precioActual;
                break;
        }

        return "Nombre: \"" + super.getNombre() + "\"" +
        "\nPrecio: " + precioFinal + "€" +
        "\nDias para Caducar: " + diasParaCaducar;
    }
}
