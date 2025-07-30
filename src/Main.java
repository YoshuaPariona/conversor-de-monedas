import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        System.out.print("""
            Bienvenido al Conversor de Monedas

            1) Sol peruano    ==> Dolar
            2) Dolar          ==> Sol peruano
            3) Peso argentino ==> Dolar
            4) Dolar          ==> Peso argentino
            5) Real brasileño ==> Dolar
            6) Dolar          ==> Real brasileño
            7) Boliviano      ==> Dolar
            8) Dolar          ==> Boliviano

            0) Salir

            Escoge una opción: """
            );
        Scanner userInput = new Scanner(System.in);
        
        Currency currency = new Currency(userInput.nextInt());

        System.out.print("Ingrese la cantidad de "+currency.nameActualCurrency+": ");
        Double targetCurrencyResult = (double)Math.round(userInput.nextDouble()*currency.getConversionRate() * 100d) / 100d;

        System.out.println("El tipo de cambio es: "+currency.getConversionRate());
        System.out.println("Esa cantidad equivale a "+targetCurrencyResult+" "+currency.nameTargetCurrency+".");
        
    }
}