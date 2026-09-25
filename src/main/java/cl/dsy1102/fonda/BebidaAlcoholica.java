package cl.dsy1102.fonda;

public class BebidaAlcoholica {
    private double gradosAlcohol;
    private  boolean certificada;
    private  boolean ventaRestringida;
    public static final int LIMITE_UNIDADES_POR_CLIENTE = 3;

    public BebidaAlcoholica(double gradosAlcohol, boolean certificada, boolean ventaRestringida){
        this.gradosAlcohol = gradosAlcohol;
        this.certificada = certificada;
        this.ventaRestringida = ventaRestringida;

    }

    public double getGradosAlcohol() {
        return gradosAlcohol;
    }

    public void setGradosAlcohol(double gradosAlcohol) {
        this.gradosAlcohol = gradosAlcohol;
    }

    public boolean isCertificada() {
        return certificada;
    }

    public void setCertificada(boolean certificada) {
        this.certificada = certificada;
    }

    public boolean isVentaRestringida() {
        return ventaRestringida;
    }

    public void setVentaRestringida(boolean ventaRestringida) {
        this.ventaRestringida = ventaRestringida;
    }
}
