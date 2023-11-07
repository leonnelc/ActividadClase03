import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Desarrollador Java intermedio
        Lambdas y aplanación en colecciones
        */
        List<String> lista1 = Arrays.asList("hola", "me", "llamo", "juancito");
        System.out.println(Ejercicio1.metodo(lista1));
        System.out.println(Ejercicio2.metodo(lista1, 4));
    }
}
