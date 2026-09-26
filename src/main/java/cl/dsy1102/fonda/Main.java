package cl.dsy1102.fonda;

/**
 * Punto de entrada de la Tarea Fiestas Patrias - Fonda San Belarmino.
 *
 * Revisa el enunciado en README.md. Debes crear, en este mismo paquete,
 * las clases del diagrama: Bebida, BebidaAlcoholica, BebidaSinAlcohol,
 * la interfaz ConsumoResponsable y la clase GestorFonda.
 */
public class Main {

    Main() {

    }

    public static void main(String[] args) {
        // TODO 1: instanciar las cuatro bebidas con los datos del enunciado.
        // TODO 2: marcar la bebida alcoholica 'Chicha' con la venta restringida.
        // TODO 3: registrarlas todas en el gestor.
        // TODO 4: solicitar las cuatro ventas indicadas en el enunciado.
        // TODO 5: buscar por nombre "Chicha" y listar todas las bebidas.



        Bebida chichaAlc = new BebidaAlcoholica("Chicha", 1000, 40, 12, false, false);
        Bebida piscoSour = new BebidaAlcoholica("Pisco Sour", 500, 25.0, 18, true, false);
        Bebida chichaSinAlc = new BebidasSinAlcohol("Chicha", 1000, 60, 95.0);
        Bebida mote = new BebidasSinAlcohol("Mote con Huesillo", 400, 50, 70.0);

                chichaAlc.restringirVenta();

                GestorFonda gestor = new GestorFonda();
                gestor.agregarBebida(chichaAlc);
                gestor.agregarBebida(piscoSour);
                gestor.agregarBebida(chichaSinAlc);
                gestor.agregarBebida(mote);

                gestor.registrarVenta(chichaAlc, 2);
                gestor.registrarVenta(piscoSour, 1);
                gestor.registrarVenta(chichaSinAlc, 3);
                gestor.registrarVenta(mote, 2);

                System.out.println("--- BÚSQUEDA DE CHICHA ---");
                gestor.buscarPorNombre(nombre);

                System.out.println("\n--- LISTADO DE TODAS LAS BEBIDAS ---");
                gestor.mostrarTodasLasBebidas();
            }
    }



