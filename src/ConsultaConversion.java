import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversion {
    public Conversion conversion(String moneda_base, String moneda_objetivo, long monto) {
        // Construir la URL de la API
        // GET https://v6.exchangerate-api.com/v6/YOUR-API-KEY/pair/EUR/GBP/AMOUNT
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/7a7bfea1b05815039e055cff/pair/"
                                    + moneda_base + "/" + moneda_objetivo + "/" + monto);

        // Crear el cliente y la solicitud HTTP
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            // Enviar la solicitud y obtener la respuesta
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            // Devolver el resultado de la conversión
            return new Gson().fromJson(response.body(), Conversion.class);
        } catch (Exception e) {
            throw new RuntimeException("No se pudo obtener el tipo de cambio.", e);
        }
    }
}
