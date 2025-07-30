import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ApiClient {
    private String actualCurrency;
    private String targetCurrency;
    private final String ApiKey = "1f20803e8746298072532a0c";
    private ApiResponse apiResponse;
    
    public ApiClient(String actualCurrency, String targetCurrency) {
        this.actualCurrency = actualCurrency;
        this.targetCurrency = targetCurrency;
    }

    public ApiResponse getApiResponse() {

        Gson gson = new GsonBuilder()
            .create();

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://v6.exchangerate-api.com/v6/"+this.ApiKey+"/pair/"+actualCurrency+"/"+targetCurrency))
            .build();
            
        try {
            HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

            apiResponse = gson.fromJson(response.body(), ApiResponse.class);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        return apiResponse;
    }
        
    public Double getConversionRate () {
        if (apiResponse ==null) {
            getApiResponse();
        }
        return apiResponse.conversion_rate();
    }
}
