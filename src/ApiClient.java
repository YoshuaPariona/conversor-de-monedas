import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Properties;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ApiClient {
    
    protected String actualCurrency;
    protected String targetCurrency;
    protected ApiResponse apiResponse;
    
    public ApiResponse getApiResponse() {
        Properties properties = null;
        try {
            FileInputStream inputStream = new FileInputStream("config.properties");
            properties = new Properties();
            properties.load(inputStream);
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo config.properties");
            e.printStackTrace();
        }
        String apiKey = properties.getProperty("API_KEY");

        Gson gson = new GsonBuilder()
            .create();

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://v6.exchangerate-api.com/v6/"+apiKey+"/pair/"+actualCurrency+"/"+targetCurrency))
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
        
}