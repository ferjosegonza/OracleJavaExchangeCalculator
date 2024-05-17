import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversion {
    public Double conversion(String moneda_base, String moneda_objetivo, double monto) {
        // Construir la URL de la API
        String apiKey = "YOUR-API-KEY";  // Reemplaza con tu clave de API real
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + moneda_base + "/" + moneda_objetivo + "/" + monto);

        // Crear el cliente y la solicitud HTTP
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            // Enviar la solicitud y obtener la respuesta
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            // Deserializar la respuesta JSON en un objeto CambioMoneda
            CambioMoneda resultado = new Gson().fromJson(response.body(), CambioMoneda.class);

            // Devolver el resultado de la conversión
            return resultado.getConversion_result();
        } catch (Exception e) {
            throw new RuntimeException("No se pudo obtener el tipo de cambio.", e);
        }
    }

    // Clase para mapear la respuesta de la API
    class CambioMoneda {
        private String result;
        private String documentation;
        private String terms_of_use;
        private long time_last_update_unix;
        private String time_last_update_utc;
        private long time_next_update_unix;
        private String time_next_update_utc;
        private String base_code;
        private String target_code;
        private double conversion_rate;
        private double conversion_result;

        // Getters y Setters

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }

        public String getDocumentation() {
            return documentation;
        }

        public void setDocumentation(String documentation) {
            this.documentation = documentation;
        }

        public String getTerms_of_use() {
            return terms_of_use;
        }

        public void setTerms_of_use(String terms_of_use) {
            this.terms_of_use = terms_of_use;
        }

        public long getTime_last_update_unix() {
            return time_last_update_unix;
        }

        public void setTime_last_update_unix(long time_last_update_unix) {
            this.time_last_update_unix = time_last_update_unix;
        }

        public String getTime_last_update_utc() {
            return time_last_update_utc;
        }

        public void setTime_last_update_utc(String time_last_update_utc) {
            this.time_last_update_utc = time_last_update_utc;
        }

        public long getTime_next_update_unix() {
            return time_next_update_unix;
        }

        public void setTime_next_update_unix(long time_next_update_unix) {
            this.time_next_update_unix = time_next_update_unix;
        }

        public String getTime_next_update_utc() {
            return time_next_update_utc;
        }

        public void setTime_next_update_utc(String time_next_update_utc) {
            this.time_next_update_utc = time_next_update_utc;
        }

        public String getBase_code() {
            return base_code;
        }

        public void setBase_code(String base_code) {
            this.base_code = base_code;
        }

        public String getTarget_code() {
            return target_code;
        }

        public void setTarget_code(String target_code) {
            this.target_code = target_code;
        }

        public double getConversion_rate() {
            return conversion_rate;
        }

        public void setConversion_rate(double conversion_rate) {
            this.conversion_rate = conversion_rate;
        }

        public double getConversion_result() {
            return conversion_result;
        }

        public void setConversion_result(double conversion_result) {
            this.conversion_result = conversion_result;
        }
    }
}
