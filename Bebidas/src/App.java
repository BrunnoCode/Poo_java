import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Bebida> bar = new ArrayList<>();

        Bebida b1 = new Bebida("Coca-cola", 330, true, 2.30);
        Bebida b2 = new Bebida("Agua Viladrau", 220, false, 1.20);
        Bebida b3 = new Bebida("Fanta naranja", 330, true, 2.15);
        Bebida b4 = new Bebida("Tónica", 230, true, 2.40);

        Bebida b5 = new Bebida("Bitter Kas", true);
        System.out.println(b5.toString2());

        bar.add(b1);
        bar.add(b2);
        bar.add(b3);
        bar.add(b4);


        System.out.println(bar);

        for(Bebida x: bar){
            System.out.println(x.getNombre() + " vale " + x.getPrecio() + " euros");
        }

        for(int i=0; i<bar.size(); i++){
            System.out.println(bar.get(i).getNombre());
        }

        // llamada a metodo extra:  b1.esSaludable(true);

        
    }
}
