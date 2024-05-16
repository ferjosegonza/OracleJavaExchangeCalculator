import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcion = 0;
        double monto = 0;
        String monedas = null;
        Scanner lectura = new Scanner(System.in);
        do {
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
                if (opcion >= 1 && opcion <= 6){
                    switch (opcion) {
                        case 1:
                            monedas = "Dólar a Peso argentino";
                            break;
                        case 2:
                            monedas = "Peso argentino a Dólar";
                            break;
                        case 3:
                            monedas = "Dólar a Real brasileño";
                            break;
                        case 4:
                            monedas = "Real brasileño a Dólar";
                            break;
                        case 5:
                            monedas = "Dólar a Peso colombiano";
                            break;
                        case 6:
                            monedas = "Peso colombiano a Dólar";
                            break;
                        default:
                            break;
                    }

                    do {
                        System.out.println("Ingrese un monto para convertir de "+monedas);
                        try {
                            monto = Double.parseDouble(lectura.nextLine());
                            break;
                        } catch (NumberFormatException e){
                            System.out.println("Valor inválido. Ingrese un número.");
                        }
                    } while (true);
                    System.out.println("parece q funcó");
                    System.out.println("monto: "+ monto);
                    System.out.println("monedas: "+ monedas);
                }
            } catch (NumberFormatException e){
                System.out.println("Valor inválido. Ingrese un número entre 1 y 7.");
            }
        } while (opcion != 7);

        System.out.println("Gracias por utilizar el conversor de moneda!");
        System.out.println("Cerrando el programa...");

    }
}