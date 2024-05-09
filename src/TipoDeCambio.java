import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class TipoDeCambio {
    private double tasaCambio;

    public TipoDeCambio(double tasaCambio) {
        this.tasaCambio = tasaCambio;
    }

    public double getTasaCambio() {
        return tasaCambio;
    }

    public static TipoDeCambio obtenerTipoCambio(String tipoMonedaActual, String tipoMonedaHaCambiar) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/83120ee748c1255c8aa7078a/latest/" + tipoMonedaActual))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();

        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(json, JsonObject.class);
        JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
        double tasa = conversionRates.get(tipoMonedaHaCambiar).getAsDouble();

        return new TipoDeCambio(tasa);
    }
}
