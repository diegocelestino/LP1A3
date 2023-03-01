import java.net.InetSocketAddress;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;

public class HttpClientDemo {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newBuilder()
        .proxy(ProxySelector.of(new InetSocketAddress("10.100.1.253", 3128)))
        .build();
        
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://weatherapi-com.p.rapidapi.com/timezone.json?q=Paris"))
                .GET()
                .header("X-RapidAPI-Key", "645b21d60amshe96ccb7114120dbp1fba7fjsnffe122273172")
                .header("X-RapidAPI-Host", "weatherapi-com.p.rapidapi.com")
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        
        System.out.println(response.body());
    }
}
