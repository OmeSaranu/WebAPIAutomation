import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Get200 {
	
private static final String BASEURI_ENDPOINT = "https://api.github.com";
HttpClient client =  HttpClientBuilder.create().build();
	
@Test
public void baseURIreturns200StatusCode() throws ClientProtocolException, IOException
{
	HttpGet get = new HttpGet(BASEURI_ENDPOINT);
	
	HttpResponse response = client.execute(get);
    
	int statusCode = response.getStatusLine().getStatusCode();
	
	Assert.assertEquals(statusCode, 200);
	
 
}
}
