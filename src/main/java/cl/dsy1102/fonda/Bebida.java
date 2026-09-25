package cl.dsy1102.fonda;
import java.util.Objects;
public abstract class Bebida {
    private String nombre;
    private int volumenMl;
    private int stock;

    public Bebida(String nombre, int volumenMl, int stock){
        setNombre(nombre);
        setVolumenMl(volumenMl);
        setStock(stock);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        setNombre(nombre);
    }

    public int getVolumenMl() {
        return volumenMl;
    }

    public void setVolumenMl(int volumenMl) {
        setVolumenMl(volumenMl);
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        setStock(stock);
    }
}
