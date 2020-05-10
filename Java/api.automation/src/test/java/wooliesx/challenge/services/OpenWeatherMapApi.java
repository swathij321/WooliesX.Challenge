package wooliesx.challenge.services;

import java.time.DayOfWeek;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import wooliesx.challenge.models.OpenWeatherMapData;

public class OpenWeatherMapApi {
	private String url; 
	private String apiKey;
	private WebTarget target;
	
	public OpenWeatherMapApi()
	{
		url = "http://api.openweathermap.org/data/2.5/forecast";
		apiKey = "38136f8cfada3e01bd71c6424c53f4be";
	}
	
	public DayOfWeek dayOfHoliday;
	
	public String city;
	
	public OpenWeatherMapData responseData;
	
	public void lookup()
	{
		Client client = ClientBuilder.newClient();
		target = client.target(url).queryParam("q", city)
                .queryParam("units", "metric")
                .queryParam("appid", apiKey);
	}
		
	public OpenWeatherMapData receive()
	{
		responseData = target.request(MediaType.APPLICATION_JSON)
        	.get(OpenWeatherMapData.class);
		
		return responseData;
	}

}
