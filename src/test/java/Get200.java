import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Get200 extends BaseClass {

	
	@Test
	public void baseURIReturns200StatusCode() throws ClientProtocolException, IOException {
		HttpGet get = new HttpGet(BASEURI_ENDPOINT);

		response = client.execute(get);

		int statusCode = response.getStatusLine().getStatusCode();

		Assert.assertEquals(statusCode, 200);
	}

	@Test
	public void rateLimitReturns200StatusCode() throws ClientProtocolException, IOException {
		HttpGet get = new HttpGet(BASEURI_ENDPOINT + "/rate_limit");

		HttpResponse response = client.execute(get);

		int statusCode = response.getStatusLine().getStatusCode();

		Assert.assertEquals(statusCode, 200);
	}

	@Test
	public void searchReposReturns200StatusCode() throws ClientProtocolException, IOException {
		HttpGet get = new HttpGet(BASEURI_ENDPOINT + "/search/repositories?q=java");

		HttpResponse response = client.execute(get);

		int statusCode = response.getStatusLine().getStatusCode();

		Assert.assertEquals(statusCode, 200);
	}
	

	@Test
	public void emojisReturns200StatusCode() throws ClientProtocolException, IOException {
		HttpGet get = new HttpGet(BASEURI_ENDPOINT + "/emojis");

		HttpResponse response = client.execute(get);

		int statusCode = response.getStatusLine().getStatusCode();

		Assert.assertEquals(statusCode, 200);
	}
	@Test
	public void eventsReturns200StatusCode() throws ClientProtocolException, IOException {
		HttpGet get = new HttpGet(BASEURI_ENDPOINT + "/events");

		HttpResponse response = client.execute(get);

		int statusCode = response.getStatusLine().getStatusCode();

		Assert.assertEquals(statusCode, 200);
	}

	
	}


