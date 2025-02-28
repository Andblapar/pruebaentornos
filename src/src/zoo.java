import clasesAnimales.*;

import javax.swing.*;

public class zoo {
    public static void main(String[] args) {
        Animal[] array = new Animal[4];
        
        Leon l = new Leon();
        Pato p = new Pato();
        Loro loro = new Loro();
        Elefante e = new Elefante();
        
        array[0]=l;
        array[1]=p;
        array[2]=loro;
        array[3]=e;
        
        for(int i=0; i<array.length; i++){
            array[i].mostrar();
            if (array[i] instanceof Leon){
                System.out.println("Leon");
            }
        }
    }
}