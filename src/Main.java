import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Integer option = 0;
        String menu ="""
        
            Bienvenido al Conversor de Monedas

            1) Sol peruano    ==> Dolar
            2) Dolar          ==> Sol peruano
            3) Peso argentino ==> Dolar
            4) Dolar          ==> Peso argentino
            5) Real brasileño ==> Dolar
            6) Dolar          ==> Real brasileño
            7) Boliviano      ==> Dolar
            8) Dolar          ==> Boliviano
            9) Salir

            Escoge una opción:  """;
        Scanner userInput = new Scanner(System.in);

        while (option != 9) {
            System.out.print(menu);
            option = userInput.nextInt();
            
            if(option < 1 || option > 9) {
                System.out.println("opción inválida");
                break;
            } else if (option == 9) {
                System.out.println("Saliendo del programa.");
                break;
            }
            System.out.println("aver");

            Currency currency = new Currency(option);

            System.out.print("Ingrese la cantidad de "+currency.nameActualCurrency+": ");
            Double targetCurrencyResult = (double)Math.round(userInput.nextDouble()*currency.getConversionRate() * 100d) / 100d;

            System.out.println("El tipo de cambio es: "+currency.getConversionRate());
            System.out.println("Esa cantidad equivale a "+targetCurrencyResult+" "+currency.nameTargetCurrency+".");

        }

        userInput.close();
        
        
    }
}