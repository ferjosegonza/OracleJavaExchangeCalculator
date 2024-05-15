import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcion = 0;
        do {
            Scanner lectura = new Scanner(System.in);

            System.out.println("""
                    *************************************
                    Sea bienvenido/a al Conversor de Moneda =)
                                        
                    Elija una opción válida:
                                        
                    1) Dólar -> Peso argentino
                    2) Peso argentino -> Dólar
                    3) Dólar -> Real brasileño
                    4) Real brasileño -> Dólar
                    5) Dólar -> Peso colombiano
                    6) Peso colombiano -> Dólar
                    7) Salir
                                        
                    *************************************
                    """);
            try {
                opcion = Integer.parseInt(lectura.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Valor inválido. Ingrese un número entre 1 y 7.");
            }

        } while (opcion != 7);

        if (opcion == 7){
            System.out.println("Gracias por utilizar el conversor de moneda!");
            System.out.println("Cerrando el programa...");
        }

    }
}