
package clases;


public class SmartDevice {
   
    protected String Bluetooh,marca,modelo;
    protected int precio,horas_bateria;

    public SmartDevice() {
    }

    public SmartDevice(String Bluetooh, String marca, String modelo, int precio, int horas_bateria) {
        this.Bluetooh = Bluetooh;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.horas_bateria = horas_bateria;
    }

    public String getBluetooh() {
        return Bluetooh;
    }

    public void setBluetooh(String Bluetooh) {
        this.Bluetooh = Bluetooh;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getHoras_bateria() {
        return horas_bateria;
    }

    public void setHoras_bateria(int horas_bateria) {
        this.horas_bateria = horas_bateria;
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SmartDevice{");
        sb.append("Bluetooh=").append(Bluetooh);
        sb.append(", marca=").append(marca);
        sb.append(", modelo=").append(modelo);
        sb.append(", precio=").append(precio);
        sb.append(", horas_bateria=").append(horas_bateria);
        sb.append('}');
        return sb.toString();
    }
    
    
}
