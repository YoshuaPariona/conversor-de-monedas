import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ApiClient {

    Double conversionRate = 0.0;
    String ApiKey = "1f20803e8746298072532a0c";
    
    public Double ObtainConversionRate (String actualCurrency, String targetCurrency) {
    
        Gson gson = new GsonBuilder()
            .create();

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://v6.exchangerate-api.com/v6/"+this.ApiKey+"/pair/"+actualCurrency+"/"+targetCurrency))
            .build();
            
        try {
            HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

            ApiResponse apiResponse = gson.fromJson(response.body(), ApiResponse.class);

            conversionRate = apiResponse.conversion_rate();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return conversionRate;
    }
        
}
