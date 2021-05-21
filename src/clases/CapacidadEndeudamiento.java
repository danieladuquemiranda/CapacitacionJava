package clases;

public class CapacidadEndeudamiento {
    private int ingresosTotales;
    private int gastosFijos;
    private int gastosVariables;
    private final double POR_FIJO = 0.35;

    public CapacidadEndeudamiento(int ingresosTotales, int gastosFijos, int gastosVariables){
        this.ingresosTotales = ingresosTotales;
        this.gastosFijos = gastosFijos;
        this.gastosVariables = gastosVariables;
    }

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


    public double getCapacidadEndeudamiento(){
        return  (ingresosTotales - gastosFijos - gastosVariables) * POR_FIJO;
    }
}
