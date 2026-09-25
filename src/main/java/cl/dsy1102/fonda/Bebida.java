package cl.dsy1102.fonda;
import java.util.Objects;
public abstract class Bebida {
    private String nombre;
    private int volumenMl;
    private int stock;

    public Bebida(String nombre, int volumenMl, int stock) {
        this.nombre = nombre;
        this.volumenML = volumenMl;
        this.stock = stock;
    }

    public String getNombre() {return nombre;}
    public int getStock() {return stock;}
    public int getVolumenMl() {return volumenMl;}

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre;
    }

    public void setVolumenMl(int volumenMl) {
        if (volumenMl < 100 || volumenMl > 3000);{
            throw new IllegalArgumentException("El volumen no puede ser menor que 100 o mayor a 3000");
        }
    }

    public void setStock(int stock) {
        if (stock<= 0){
            throw new IllegalArgumentException("No queda stock");
        }
        setStock(stock);
    }

    public abstract boolean tieneVentaRestringida();

    public abstract void restringirVenta();

    public abstract boolean superaLimite(int unidades);

    public abstract double calcularPrecio();

    public abstract String obtenerDetalle();

    @Override
    public String toString() {
        return nombre + "-" + volumenMl + "ml";
    }

}