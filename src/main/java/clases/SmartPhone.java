package clases;


public class SmartPhone extends SmartDevice {
    
    private int numero;
    private String empresa_telefonica;

    public SmartPhone() {
    }

    public SmartPhone(int numero, String empresa_telefonica, String Bluetooh, String marca, String modelo, int precio, int horas_bateria) {
        super(Bluetooh, marca, modelo, precio, horas_bateria);
        this.numero = numero;
        this.empresa_telefonica = empresa_telefonica;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEmpresa_telefonica() {
        return empresa_telefonica;
    }

    public void setEmpresa_telefonica(String empresa_telefonica) {
        this.empresa_telefonica = empresa_telefonica;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SmartPhone{");
        sb.append(super.toString());
        sb.append("numero=").append(numero);
        sb.append(", empresa_telefonica=").append(empresa_telefonica);
        sb.append('}');
        return sb.toString();
    }

    
    
    
    
    
    
    
}
