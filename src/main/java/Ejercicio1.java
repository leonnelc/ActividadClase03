import java.util.List;

public class Ejercicio1 {
    public static List<String> metodo(List<String> lista){
        /*
        EJERCICIO 1
        Implemente un método que reciba como parámetro una lista de strings y devuelva una nueva
        lista con los strings en mayúscula.
        */
        List<String> newLista = lista.stream()
                .map(palabra -> palabra.toUpperCase())
                .toList();
        return newLista;
    }
}
