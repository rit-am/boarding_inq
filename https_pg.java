package http_test_pkg1;

import java.io.IOException;


public class https_pg {
	
	public static void main(String[] args) throws IOException {
	    //GetAndPost.MyGETRequest();
	    //GetAndPost.MyPOSTRequest();
		//System.out.print(Create_JSON.StringTestBoardingAPI);
		HTTP_Post.POST(Create_JSON.StringURL_MerchBoarding, Create_JSON.StringTestBoardingAPI);
		
		/*
	    HTTP_Post.POST
	    	(
	    			"https://www.fdmerchantservices.com/MerchantOnBoarding/inquiryService", 
	    			"{ \"urn\" " + ":" + "\"IMS99911\" }"
	    				);
	    */
	    
	}
	
	

}
