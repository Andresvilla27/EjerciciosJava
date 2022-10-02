public class Tema4 {
    public static void main(String[] args) {

        //Ejercicio con IF
        int numeroIf = -2;

        if (numeroIf<0){
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es postivo");
        }

        //Ejercicio con WHILE
        int numeroWhile = 0;

        while (numeroWhile<3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        //Ejercicio con DO WHILE
        int numeroDoWhile = 0;
        do {
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        } while (numeroDoWhile<3);

        //Ejercicio con FOR
        int numeroFor = 0;
        for (; numeroFor<=3; numeroFor++){
            System.out.println(numeroFor);
        }

        //Ejercicio con SWITCH
        var estacion = "PRIMAVERA";

        switch (estacion) {
            case "PRIMAVERA":
                System.out.println("Es primavera");
                break;

            case "VERANO":
                System.out.println("Es verano");
                break;
            
            case "OTOÑO":
                System.out.println("Es otoño");
                break;

            case "INVIERNO":
                System.out.println("Es invierno");
                break;
        
            default:
                System.out.println("No es una estacion");
                break;
        
        }
    }
}
