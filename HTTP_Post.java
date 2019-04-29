package http_test_pkg1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HTTP_Post {

	public static void POST(String stringURL, String stringJSONparams) throws IOException {
	    final String POST_PARAMS = stringJSONparams;
	    System.out.println(POST_PARAMS);
	    URL obj = new URL(stringURL);
	    HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();
	    postConnection.setRequestMethod("POST");
	    postConnection.setRequestProperty("Content-Type", "application/json");
	    postConnection.setDoOutput(true);
	    OutputStream outstream = postConnection.getOutputStream();
	    outstream.write(POST_PARAMS.getBytes());
	    outstream.flush();outstream.close();
	    int responseCode = postConnection.getResponseCode();
	    System.out.println("POST Response Code :  " + responseCode);
        BufferedReader instream = new BufferedReader(new InputStreamReader(
        	postConnection.getInputStream()));
	        String inputLine;
	        StringBuffer response = new StringBuffer();
	        while ((inputLine = instream .readLine()) != null) {
	            response.append(inputLine + "\n");
	        } instream .close();
	        // print result
	        System.out.println(response.toString());
	}

}
