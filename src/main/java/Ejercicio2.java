import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {

    public static String metodo(List<String> lista, int n){
        /*
        EJERCICIO 2
        Implementar un método que reciba como parámetro una lista de strings y un entero "n". El
        método debe devolver un String que concatene separando por coma y espacio todas las
        palabras, en la lista, que tengan más de "n" caracteres.
        */
        String string = lista.stream()
                .filter(palabra -> palabra.length() > n)
                .collect(Collectors.joining(", "));
        return string;
    }
}
