using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Text;

namespace WooliesX.Challenge.Api.Tests.Models
{
    public class MainDetail
    {
        [JsonProperty("temp")]
        public double Temperature { get; set; }

        [JsonProperty("temp_min")]
        public double MinimumTemperature { get; set; }

        [JsonProperty("temp_max")]
        public double MaximumTemperature { get; set; }
    }
}
