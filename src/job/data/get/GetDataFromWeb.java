package job.data.get;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.params.ConnRoutePNames;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

	
public class GetDataFromWeb 
{
	public GetDataFromWeb() 
	{
		
	}
	public void getURLContent(String url)
	{
		HttpClient httpclient = new DefaultHttpClient();
		HttpGet httpGet=null;
		try
		{
			httpGet = new HttpGet(url);
			HttpResponse response = httpclient.execute(httpGet);
			HttpEntity entity = response.getEntity();
			if (entity != null) 
			{
				System.out.println("Response content: " + EntityUtils.toString(entity));
			}
		}catch (Exception e){
			
		}
		finally 
		{
			httpGet.abort();
		}
	}
	
}



