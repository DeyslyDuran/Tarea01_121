import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        Punto punto = new Punto(3, 4);
        System.out.println(Arrays.toString(punto.coordCartesianas()));
        System.out.println(Arrays.toString(punto.coordPolares()));
        System.out.println(punto.toString());
    }
}
