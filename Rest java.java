import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class restClienteNodeExample {

	public static void main(String[] args) {
		try {	
			
			URL url;
			url = new URL("http://127.0.0.1:8081/listUsers");
			//url = new URL("http://127.0.0.1:8081/listUser/3");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");

			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			StringBuilder stringBuilder = new StringBuilder();

			reader.lines().forEach(a->stringBuilder.append(a));
			System.out.println(stringBuilder);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
