
public class Main {

    public static void main(String[] args) {

        ApiClient apiClient = new ApiClient("PEN", "USD");


        Double conversionRate = apiClient.getConversionRate();

        System.out.println(conversionRate);    

        
    }
}