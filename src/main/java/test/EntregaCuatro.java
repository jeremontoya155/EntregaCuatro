

package test;

import clases.SmartPhone;
import clases.SmartWatch;

public class EntregaCuatro {

    public static void main(String[] args) {
        
        SmartPhone sp=new SmartPhone(3516136,"Claro","Disponible","Samsumg","A32",15000,7);
        
        System.out.println("--------------------------");
        System.out.println("Telefono");
        System.out.println(sp.toString());
        System.out.println("--------------------------");
        
        
        
        SmartWatch sw=new SmartWatch(55,"Disponible","Disponible","Xiaomi","xt13",150,12);
        System.out.println("--------------------------");
        System.out.println("SmartWatch");
        System.out.println(sw.toString());
        System.out.println("--------------------------");
        
        
    } 
}
