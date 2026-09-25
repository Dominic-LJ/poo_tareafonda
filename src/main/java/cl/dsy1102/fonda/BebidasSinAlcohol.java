package cl.dsy1102.fonda;

public class BebidasSinAlcohol {
    private int azucarPorLitro;

    public BebidasSinAlcohol(int azucarPorLitro){
        this.azucarPorLitro = azucarPorLitro;

    }

    public int getAzucarPorLitro() {
        return azucarPorLitro;
    }

    public void setAzucarPorLitro(int azucarPorLitro) {
        this.azucarPorLitro = azucarPorLitro;
    }
    @Override
    public double calcularPrecio(){
        return unidades *  3500
    }


}
