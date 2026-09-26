package cl.dsy1102.fonda;

public class BebidaAlcoholica extends Bebida {
    private double gradosAlcohol;
    private boolean certificada;
    private boolean ventaRestringida;
    public static final int LIMITE_UNIDADES_POR_CLIENTE = 3;

    public BebidaAlcoholica(String nombre, int volumenML, double gradosAlcohol, int stock, boolean certificada, boolean ventaRestringida) {
        super(nombre, volumenML, stock);
        this.gradosAlcohol = gradosAlcohol;
        this.certificada = certificada;
        this.ventaRestringida = ventaRestringida;

    }

    public double getGradosAlcohol() {
        return gradosAlcohol;
    }

    public boolean isCertificada() {
        return certificada;
    }

    //comportamientos de herencia
    @Override
    public boolean tieneVentaRestringida(){
        return ventaRestringida;
    }
    @Override
    public boolean tieneVentaRestringida(){
        return this.isVentaRestringida();
    }

    @Override //esta linea esta correcta
    public void restringirVenta(){
        this.ventaRestringida  = true;
    }

    @Override
    public boolean superaLimite(int unidades){
        return unidades > LIMITE_UNIDADES_POR_CLIENTE;
    }

    @Override
    public double calcularPrecio(){
        double precioBase = 3500;
        if (!certificada){
            precioBase = precioBase *1.2;
        }
        return precioBase;
    }//
    @Override
    public String obtenerDetalle(){
        String esCertificada = this.isCertificada()?"Si":"";
        String respuesta= "";
        respuesta = "Tipo: Bebida Sin Alcohol | ";
        respuesta = "Nombre: " + this.getNombre() + " | ";


    }
}