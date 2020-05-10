using Microsoft.Extensions.Configuration;
using System;
using WooliesX.Challenge.Api.Tests.Models;
using WooliesX.Challenge.Api.Tests.Utilities;

namespace WooliesX.Challenge.Api.Tests.Services
{
    public class OpenWeatherMapApi
    {
        private readonly IConfigurationRoot _configuration;
        private readonly string _url;
        private readonly string _apiKey;

        public OpenWeatherMapApi()
        {
            _configuration = TestConfiguration.GetConfiguration();
            _url = _configuration["apiUrl"];
            _apiKey = _configuration["apiKey"];
        }

        public DayOfWeek DayOfHoliday { get; set; }
        public string City { get; set; }
        public string ResponseText { get; set; }
        public OpenWeatherMapData ResponseData { get; set; }

        public void Lookup()
        {
            var uriBuilder = new UriBuilder(_url);
            uriBuilder.Query = $"q={City}&units=metric&appid={_apiKey}";

            ResponseText = RestApiUtil.Get(uriBuilder.Uri);

            if (JsonUtil.IsValidJson(ResponseText))
            {
                ResponseData = JsonUtil.Deserialize<OpenWeatherMapData>(ResponseText);
            }
        }
    }
}
