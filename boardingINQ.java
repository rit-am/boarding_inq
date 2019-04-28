package boardinginq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class boardingINQ {
	public static void MyPOSTRequest() throws IOException {
	    final String POST_PARAMS = "{\"urn\" " + ":" + " \"RIT99911\" }";
	    System.out.println(POST_PARAMS);
	    URL obj = new URL("https://www.rit.am.merchantservices.com/MerchantOnBoarding/inquiryService");
	    HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();
	    postConnection.setRequestMethod("POST");
	    postConnection.setRequestProperty("Content-Type", "application/json");
	    postConnection.setDoOutput(true);
	    OutputStream os = postConnection.getOutputStream();
	    os.write(POST_PARAMS.getBytes());
	    os.flush();os.close();
	    int responseCode = postConnection.getResponseCode();
	    System.out.println("POST Response Code :  " + responseCode);
        BufferedReader in = new BufferedReader(new InputStreamReader(
        		postConnection.getInputStream()));
	        	String inputLine;
	        	StringBuffer response = new StringBuffer();
	        	while ((inputLine = in .readLine()) != null) {
	        		response.append(inputLine + "\n");
	        	} in .close();
	      System.out.println(response.toString());
	}
	
	public static void main(String[] args) throws IOException {
	    MyPOSTRequest();
	}
	

}
