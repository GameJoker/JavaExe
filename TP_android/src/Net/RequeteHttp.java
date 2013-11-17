package Net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.os.AsyncTask;
import android.widget.TextView;

public class RequeteHttp extends AsyncTask<TextView, Void, String>{
	TextView tw;
	@Override
	protected String doInBackground(TextView... params) {
		// TODO Auto-generated method stub
		this.tw = params[0];
		return executeRequeteHttp();
	}
	@Override
	protected void onPostExecute(String result) {
		// TODO Auto-generated method stub
		tw.setText(result);
	}

	public String executeRequeteHttp(){
		URI uri = null;
		HttpResponse res = null;
		String webcontent = null;
		try{
			uri = new URI("http://cabani.free.fr/gsi/index.php");
			HttpGet httpGet = new HttpGet(uri);
			res = new DefaultHttpClient().execute(httpGet);
			InputStream data = res.getEntity().getContent();
			webcontent = generateString(data);
		}catch (URISyntaxException e){
			e.printStackTrace();
		}catch (ClientProtocolException e){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
		return webcontent;
	}
	private String generateString(InputStream stream) {
		// TODO Auto-generated method stub
		InputStreamReader reader = new InputStreamReader(stream);
		BufferedReader buffer = new BufferedReader(reader);
		StringBuilder sb = new StringBuilder();
		try{
			String cur;
			while((cur = buffer.readLine()) != null){
				sb.append(cur+System.getProperty("line.separator"));
			}
			stream.close();
		}catch (IOException e)
		{
			e.printStackTrace();
		}
		return sb.toString();
	}
	
	
}
