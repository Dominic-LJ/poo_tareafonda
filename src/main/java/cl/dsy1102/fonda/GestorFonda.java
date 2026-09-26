package cl.dsy1102.fonda;
import com.sun.nio.sctp.IllegalReceiveException;

import java.util.List;
import java.util.ArrayList;

public class GestorFonda {
    private List<Bebida> listabebidas;

    public GestorFonda(){
        this.listabebidas = new ArrayList<>();
    }


    public List<Bebida> getListabebidas(){
        return listabebidas;
    }

    public List<Bebida> buscarPorNormbre(String nombre){
        ArrayList<Bebida> bebidasEncontradas = new ArrayList<>();
        for(Bebida bebida: this.getListabebidas()){
            if (bebida.getNombre().equalsIgnoreCase(nombre)){
                bebidasEncontradas.add(bebida);
            }
        }
        return  bebidasEncontradas;
    }

    public void vender(String nombre, int unidades){
        List<Bebida> bebidadsRespectivas = this.buscarPorNormbre(nombre);
        for (Bebida bebida: bebidadsRespectivas){
            if(bebida.getStock()>= unidades){
                if (bebida instanceof ConsumoResponsable){
                    boolean checked;
                    checked = ((ConsumoResponsable)bebida).superaLimite(unidades);
                    if(checked){
                        IllegalArgumentException excepcion = new IllegalArgumentException(("Se suepra el limite de venta"));
                        throw excepcion;
                    }
                }
            }
        }
    }

    public void mostrarTodasLasBebidas() {
    }
}
