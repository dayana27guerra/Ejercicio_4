public class Main {
    public static void main(String[] args) {
        //declaración de variables
        int numeroIf=-1;
        int numeroWhile=0;
        int numeroFor=0;
        var estacion = "Verano";

        //Punto 1
        System.out.println("para el if: ");
        if (numeroIf<0){
            System.out.println("El numero es: Negativo");
        } else if (numeroIf>0) {
            System.out.println("El numero es: Positivo");
        }
        else {
            System.out.println("El numero es: Cero");
        }

        //Punto 2
        System.out.println("para el while");
        while (numeroWhile<3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        //punto 3
        System.out.println("para el do while");
        do{
            numeroWhile++;
            System.out.println(numeroWhile);
        }while(numeroWhile<3);

        //punto 4
        System.out.println("para el for");
        for (;numeroFor<=3;numeroFor++){
            System.out.println(numeroFor);
        }

        //punto 5
        System.out.println("para el switch: ");
        switch (estacion){
            case "Primavera":
                System.out.println("Estamos en: Primavera");break;
            case "Verano":
                System.out.println("Estamos en: Verano");break;
            case "Otoño":
                System.out.println("Estamos en: Otoño");break;
            case "Invierno":
                System.out.println("Estamos en: Invierno");break;
            default:
                System.out.println("no es una estacion");
        }

    }
}