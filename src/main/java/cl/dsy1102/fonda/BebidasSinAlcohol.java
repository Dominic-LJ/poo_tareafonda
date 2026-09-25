package cl.dsy1102.fonda;

public class BebidasSinAlcohol extends Bebida {
    private int azucarPorLitro;
    private int unidades;

    public BebidasSinAlcohol(String nombre, int volumenML, int stock, double azucarPorLitro){
        super(nombre, volumenML, stock);
        this.azucarPorLitro = (int) azucarPorLitro;
    }

    public void setAzucarPorLitro(int azucarPorLitro) {
        this.azucarPorLitro = azucarPorLitro;
    }

    @Override
    public boolean tieneVentaRestringida() {
        return false;
    }

    @Override
    public void restringirVenta() {

    }

    @Override
    public boolean superaLimite(int unidades) {
        return false;
    }

    @Override
    public double calcularPrecio(){

        return unidades *  3500;
    }

    @Override
    public String obtenerDetalle() {
        return "";
    }

    public int getAzucarPorLitro() {
        return azucarPorLitro;
    }
}
