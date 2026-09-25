package cl.dsy1102.fonda;
import java.util.List;
import java.util.ArrayList;

public class GestorFonda {
    private List<Bebida> listabebidas;

    public GestorFonda(){
        this.listabebidas = new ArrayList<>();
    }

    public void agregarBebida(Bebida bebida) {
        this.listabebidas.add(bebida);
    }
    public List<Bebida> getListabebidas(){
        return listabebidas;
    }

    public void registrarVenta(BebidaAlcoholica chichaAlc, int i) {
    }

    public void registrarVenta(BebidasSinAlcohol chichaSinAlc, int i) {
        
    }

    public void buscarPorNombre(String chicha) {
        
    }

    public void mostrarTodasLasBebidas() {
    }
}
