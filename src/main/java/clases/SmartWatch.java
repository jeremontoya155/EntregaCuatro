
package clases;


public class SmartWatch extends SmartDevice{
    
    private int numeroSerie;
    private String resistenciaAlAgua;

    public SmartWatch() {
    }

    public SmartWatch(int numeroSerie, String resistenciaAlAgua, String Bluetooh, String marca, String modelo, int precio, int horas_bateria) {
        super(Bluetooh, marca, modelo, precio, horas_bateria);
        this.numeroSerie = numeroSerie;
        this.resistenciaAlAgua = resistenciaAlAgua;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getResistenciaAlAgua() {
        return resistenciaAlAgua;
    }

    public void setResistenciaAlAgua(String resistenciaAlAgua) {
        this.resistenciaAlAgua = resistenciaAlAgua;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SmartWatch{");
        sb.append(super.toString());
        sb.append("numeroSerie=").append(numeroSerie);
        sb.append(", resistenciaAlAgua=").append(resistenciaAlAgua);
        sb.append('}');
        return sb.toString();
    }
    
    


}
