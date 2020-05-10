package wooliesx.challenge.stepDefinations;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wooliesx.challenge.models.Forecast;
import wooliesx.challenge.models.OpenWeatherMapData;
import wooliesx.challenge.services.OpenWeatherMapApi;

public class HappyHolidayMakerSteps {
	private OpenWeatherMapApi openWeatherMapApi;
	
	public HappyHolidayMakerSteps(OpenWeatherMapApi openWeatherMapApi)
	{
		this.openWeatherMapApi = openWeatherMapApi;
	}
	
	@Given("^I like to holiday in (.*)$")
	public void i_like_to_holiday_in(String city) {
		openWeatherMapApi.city = city;
	}

	@Given("^I only like to holiday on (.*)$")
	public void i_only_like_to_holiday_on(String day) {
		openWeatherMapApi.dayOfHoliday = DayOfWeek.valueOf(day.toUpperCase());
	}

	@When("^I look up the weather forecast$")
	public void i_look_up_the_weather_forecast() {
		openWeatherMapApi.lookup();
	}

	@Then("^I receive the weather forecast$")
	public void i_receive_the_weather_forecast() {
		OpenWeatherMapData responseData = openWeatherMapApi.receive();
		
		// Assert the response is valid json
		Assert.assertNotEquals(responseData, null);
		
		// Assert forecast data for the city should be Sydney
		Assert.assertEquals(responseData.getCity().getName(), openWeatherMapApi.city);
		
		// Assert forecast data should contain data for Thursday
		Boolean anyMatch = false;
		for (Forecast forecast : responseData.getList()) {
			DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			LocalDateTime dateTime = LocalDateTime.parse(forecast.getDt_txt(), format);
			if(dateTime.getDayOfWeek() == openWeatherMapApi.dayOfHoliday)
			{
				anyMatch = true;
				break;
			}
		}
		
		Assert.assertTrue(anyMatch);
	}

	@Then("^the temperature is warmer than (.*) degrees$")
	public void the_temperature_is_warmer_than_degrees(double temperature) {
		// Assert forecast weather should be greater than 10 degrees
		Boolean anyMatch = false;
		for (Forecast forecast : openWeatherMapApi.responseData.getList()) {
			DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			LocalDateTime dateTime = LocalDateTime.parse(forecast.getDt_txt(), format);
			if(dateTime.getDayOfWeek() == openWeatherMapApi.dayOfHoliday
					&& forecast.getMain().getTemp_min() > temperature)
			{
				anyMatch = true;
				break;
			}
		}
		
		Assert.assertTrue(anyMatch);
	}
}
