import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("""
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

            Escoge una opción: 
            """);
        Scanner userInput = new Scanner(System.in);
        SetCurrency currency = new SetCurrency(userInput.nextInt());

        System.out.println("Ingrese la cantidad de "+currency.nameActualCurrency+": ");
        Double amountCurrency = userInput.nextDouble();

        ApiClient apiClient = new ApiClient(currency.codeActualCurrency, currency.codeTargetCurrency);
        System.out.println("El tipo de cambio es: "+apiClient.getConversionRate());
        System.out.println("Esa cantidad equivale a "+amountCurrency*apiClient.getConversionRate()+" "+currency.nameTargetCurrency);
        
    }
}