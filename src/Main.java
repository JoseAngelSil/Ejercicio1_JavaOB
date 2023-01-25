/**
 * Para este primer ejercicio tendréis que realizar lo siguiente:
 * Crea un proyecto de Java desde 0
 * Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que generar una clase.
 * Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto
 * en las sesiones
 */
public class Main {
    public static void main(String[] args) {
        /*
        Tipos de datos primitivos
         */
        // Datos primitivo numerico enteros
        byte noByte = 0;
        System.out.println("noByte = " + noByte);
        short noShort = 440;
        System.out.println("noShort = " + noShort);
        int noInt = 5;
        System.out.println("noInt = " + noInt);
        long noLong = 10000l;
        System.out.println("noLong = " + noLong);

        // Datos primitivos numerico reales
        float noFloat = 0.5f;
        System.out.println("noFloat = " + noFloat);
        double noDouble = 0.5d;
        System.out.println("noDouble = " + noDouble);

        // Datos primitivos booleanos
        boolean isTrue = false;
        System.out.println("isTrue = " + isTrue);
        boolean isFalse = true;
        System.out.println("isFalse = " + isFalse);

        // Dato primitivo caracter
        char charUnicode = 'a';
        System.out.println("charUnicode = " + charUnicode);

        /*
        Datos envoltorios como objetos
         */
        // Cadena de caracteres
        String noString = "test";
        System.out.println("noString = " + noString);

        // Envoltoro de datos numericos
        Byte noByte1 = null;
        System.out.println("noByte1 = " + noByte1);
        Short noShort1 = 25;
        System.out.println("noShort1 = " + noShort1);
        Integer noInt1 = 4526;
        System.out.println("noInt1 = " + noInt1);
        Long noLong1 = 4444l;
        System.out.println("noLong1 = " + noLong1);

        // Envoltoro de datos numericos reales
        Float noFloat1 = null;
        System.out.println("noFloat1 = " + noFloat1);
        Double noDouble1 = null;
        System.out.println("noDouble1 = " + noDouble1);

        // Envoltoro de datos booleanos
        Boolean isToday = true;
        System.out.println("isToday = " + isToday);
        Boolean isYesterday = false;
        System.out.println("isYesterday = " + isYesterday);

        // Envoltoro de dato de caracter
        Character isUppercase = 'a';
        System.out.println("isUppercase = " + isUppercase);
    }
}