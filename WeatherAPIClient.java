
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class WeatherAPIClient {

    // Replace with your desired public API key or use a free endpoint without API key
    static final String API_URL = "https://api.weatherapi.com/v1/current.json?key=demo&q=London";

    public static void main(String[] args) {
        try {
            // Setup connection
            URL url = new URL(API_URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Read response
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(connection.getInputStream())
            );
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Parse JSON response
            JSONObject json = new JSONObject(response.toString());

            System.out.println("📡 Weather Data Fetched Successfully!");
            System.out.println("🌍 Location: " + json.getJSONObject("location").getString("name"));
            System.out.println("🌤️ Condition: " + json.getJSONObject("current").getJSONObject("condition").getString("text"));
            System.out.println("🌡️ Temperature (Celsius): " + json.getJSONObject("current").getDouble("temp_c"));
            System.out.println("💨 Wind (kph): " + json.getJSONObject("current").getDouble("wind_kph"));

        } catch (Exception e) {
            System.out.println("❌ Error fetching data: " + e.getMessage());
        }
    }
}
