public class Main {

    /*
    Escribe un programa que convierta una temperatura en grados Celsius a Fahrenheit.
    Utiliza variables para representar los valores de las temperaturas e imprime en la consola el valor convertido de
    Celsius a Fahrenheit.

Consejo: La fórmula para convertir temperaturas de grados Celsius a Fahrenheit es: (temperatura * 1.8) + 32.
Después de terminar, probar y verificar que tu programa se haya ejecutado correctamente, crea una variable entera para
mostrar la temperatura en Fahrenheit sin decimales. Recuerda que probablemente necesitarás realizar un casting de valores.

     */

    public static void main(String[] args) {
         float gradosCelsius = 25.8f;
         float gradosFahrenheit = (float) ((gradosCelsius * 1.8f) + 32);
         int gradosFahrenheitEntero = (int)gradosFahrenheit;
         String mensaje = """
                %.4f °C son %.4f °F
                """.formatted(gradosCelsius, gradosFahrenheit);

        System.out.println(mensaje);
        System.out.println("Los grados Fahrenhet en entero son "+gradosFahrenheitEntero+" °F");
    }
}