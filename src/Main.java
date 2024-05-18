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
                String moneda_base = null;
                String moneda_objetivo = null;
                opcion = Integer.parseInt(lectura.nextLine());
                if (opcion >= 1 && opcion <= 6){
                    switch (opcion) {
                        case 1:
                            monedas = "Dólar a Peso argentino";
                            moneda_base = "USD";
                            moneda_objetivo = "ARS";
                            break;
                        case 2:
                            monedas = "Peso argentino a Dólar";
                            moneda_base = "ARS";
                            moneda_objetivo = "USD";
                            break;
                        case 3:
                            monedas = "Dólar a Real brasileño";
                            moneda_base = "USD";
                            moneda_objetivo = "BRL";
                            break;
                        case 4:
                            monedas = "Real brasileño a Dólar";
                            moneda_base = "BRL";
                            moneda_objetivo = "USD";
                            break;
                        case 5:
                            monedas = "Dólar a Peso colombiano";
                            moneda_base = "USD";
                            moneda_objetivo = "COP";
                            break;
                        case 6:
                            monedas = "Peso colombiano a Dólar";
                            moneda_base = "COP";
                            moneda_objetivo = "USD";
                            break;
                        default:
                            break;
                    }

                    do {
                        System.out.println("Ingrese un monto para convertir de "+monedas);
                        try {
                            monto = Double.parseDouble(lectura.nextLine());
                            ConsultaConversion consulta = new ConsultaConversion();
                            Conversion conversion = consulta.conversion(moneda_base, moneda_objetivo, monto);
                            System.out.println(moneda_base+" "+monto+ " corresponden a : " +moneda_objetivo+" " + conversion.conversion_result());
                            break;
                        } catch (NumberFormatException e){
                            System.out.println("Valor inválido. Ingrese el monto a convertir, puede ser un entero o decimal (con punto).");
                        } catch (RuntimeException e){
                            System.out.println("No se pudo realizar la conversión: "+e.getMessage());
                        }
                    } while (true);
                }
            } catch (NumberFormatException e){
                System.out.println("Valor inválido. Ingrese un número entre 1 y 7.");
            }
        } while (opcion != 7);

        System.out.println("Gracias por utilizar el conversor de moneda!");
        System.out.println("Cerrando el programa...");

    }
}