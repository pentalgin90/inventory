package by.htp.inventory.controller;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;

import java.net.URL;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping(value = "/weather")
public class Weather {

	@RequestMapping(method = RequestMethod.GET)
	public Object weather() {
		String url = "https://api.weather.yandex.ru/v1/forecast?lat=53.9000000&lon=27.5666700";
		HttpURLConnection connection = null;
		String responce = null;
		ObjectMapper mapper = new ObjectMapper();
		Object json = null;
		
		try {
			connection = (HttpURLConnection) new URL(url).openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("X-Yandex-API-Key", "313f8f9e-3b11-46da-b50c-2f8aad551233");
			connection.setConnectTimeout(250);
			connection.setReadTimeout(250);
			connection.connect();
			
			StringBuilder sb = new StringBuilder();
			if(HttpURLConnection.HTTP_OK == connection.getResponseCode()) {
				BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				String line;
				while((line = in.readLine()) != null) {
					sb.append(line);
				}
				json = mapper.readValue(sb.toString(), Object.class);
				in.close();
			}else {
				System.out.println("fail: "+connection.getResponseCode()+ ", " +connection.getResponseMessage());
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}finally {
			if(connection != null) {
				connection.disconnect();
			}
		}
		return json;
	}
}
