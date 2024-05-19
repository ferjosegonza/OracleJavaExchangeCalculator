import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversion {
    public Conversion conversion(String moneda_base, String moneda_objetivo, double monto) {
        // Construir la URL de la API
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

            // imprimir el response
            System.out.println("API Response: " + response.body());

            // chequear si el response body es un objeto json válido
            if (response.body().startsWith("{")){
                // Devolver el resultado de la conversión
                return new Gson().fromJson(response.body(), Conversion.class);
            } else {
                throw new RuntimeException("Respuesta de la API no es un JSON válido" + response.body());
            }
        } catch (JsonSyntaxException e) {
            throw new RuntimeException("Error al parsear la respuesta JSON.", e);
        } catch (Exception e) {
            throw new RuntimeException("No se pudo obtener el tipo de cambio.", e);
        }
    }
}
