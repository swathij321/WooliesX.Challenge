using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Text;

namespace WooliesX.Challenge.Api.Tests.Models
{
    public class Forecast
    {
        [JsonProperty("main")]
        public MainDetail MainDetail { get; set; }

        [JsonProperty("weather")]
        public List<Weather> Weather { get; set; }

        [JsonProperty("dt_txt")]
        public string DateTimeText { get; set; }
    }
}
