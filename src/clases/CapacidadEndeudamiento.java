package clases;

public class CapacidadEndedudamiento {
    private int ingresosTotales;
    private int gastosFijos;
    private int gastosVariables;
    private final double POR_FIJO = 0.35;

    //Metodos getter and setter para la clase
    public int getIngresosTotales() {
        return ingresosTotales;
    }

    public void setIngresosTotales(int ingresosTotales) {
        this.ingresosTotales = ingresosTotales;
    }

    public int getGastosFijos() {
        return gastosFijos;
    }

    public void setGastosFijos(int gastosFijos) {
        this.gastosFijos = gastosFijos;
    }

    public int getGastosVariables() {
        return gastosVariables;
    }

    public void setGastosVariables(int gastosVariables) {
        this.gastosVariables = gastosVariables;
    }


    public String getCapacidadEndeudamiento(int ingresosTotales, int gastosFijos, int gastosVariables ){
        double capacidadDeEndeudamiento = (ingresosTotales - gastosFijos - gastosVariables) * POR_FIJO;
        return "La capacidad de endeudamiento es: "+ capacidadDeEndeudamiento;
    }
}
