package interoperability;

public class App {
    public static void main(String[]args){

        VentanaT vt;
        Ventana v = new Ventana();
        vt = (VentanaT) v;
    }
}
