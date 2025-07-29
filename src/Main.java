
public class Main {

    public static void main(String[] args) {

        ApiClient apiClient = new ApiClient();

        Double conversionRate = apiClient.ObtainConversionRate("PEN", "USD");

        System.out.println(conversionRate);    

        
    }
}