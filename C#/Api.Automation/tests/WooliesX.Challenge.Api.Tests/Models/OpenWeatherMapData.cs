using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Text;

namespace WooliesX.Challenge.Api.Tests.Models
{
    public class OpenWeatherMapData
    {
        [JsonProperty("list")]
        public List<Forecast> ForecastList { get; set; }

        [JsonProperty("city")]
        public City City { get; set; }
    }
}
