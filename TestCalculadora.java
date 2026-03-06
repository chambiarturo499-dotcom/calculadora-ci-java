
/**
 * Write a description of class TestCalculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Pruebas usando aserciones
        assert calc.sumar(2, 3) == 5 : "Error en suma";
        assert calc.restar(5, 2) == 3 : "Error en resta";
        assert calc.multiplicar(3, 4) == 12 : "Error en multiplicación";
        assert calc.dividir(10, 2) == 5 : "Error en división";

        System.out.println("Todas las pruebas pasaron correctamente");
    }
}