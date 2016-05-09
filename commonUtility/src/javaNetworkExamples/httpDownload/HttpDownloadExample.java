package javaNetworkExamples.httpDownload;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;



public class HttpDownloadExample {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet("http://data.treasury.gov/feed.svc/DailyTreasuryYieldCurveRateData?$filter=month(NEW_DATE)%20eq%205%20and%20year(NEW_DATE)%20eq%202016");
		CloseableHttpResponse response = httpclient.execute(httpget);
		
		System.out.println(response.getProtocolVersion());
		System.out.println(response.getStatusLine().getStatusCode());
		System.out.println(response.getStatusLine().getReasonPhrase());
		System.out.println(response.getStatusLine().toString());
		
		HttpEntity entity = response.getEntity();
		/*
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(entity.getContent()));
		
		System.out.println(entity.getContent());
		BufferedWriter out = new BufferedWriter(
        		new FileWriter("C:\\workspaces\\data\\httpGet3.txt"));
		String inputLine =null;
		while((inputLine = in.readLine()) != null ) {
			System.out.println(inputLine);
			out.write(inputLine + "\n");
		}
		
		in.close();
		out.close();
		*/
		System.out.println(entity.getContentType());
		System.out.println(entity.getContentLength());
		System.out.println(EntityUtils.toString(entity));
		System.out.println(EntityUtils.toByteArray(entity).length);
		
		response.close();
		httpget.releaseConnection();


	}

}
