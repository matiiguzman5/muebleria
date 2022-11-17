import java.util.Date;

public class Main {

    public static void main(String[] args) {
        objetoVender silla = new objetoVender("silla", 150,
                new Dimension( 20, 140, 4), false, 10, true);
        objetoVender mesa = new objetoVender("mesa", 200,
                new Dimension(100,200,40), false , 20, true);
        objetoVender televisor = new objetoVender("Televisor", 35,
                new Dimension(24, 100, 0.3), true, 500, false);

        Venta vendedor = new Venta("Pablo", new Date(2003,10,10)
                , 5, 3, false );
        Cliente comprador = new Cliente ("Lucho", 345341,
                1152210946, false);


    }
    
}
