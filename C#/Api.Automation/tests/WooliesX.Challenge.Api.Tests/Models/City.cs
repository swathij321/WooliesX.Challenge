﻿using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Text;

namespace WooliesX.Challenge.Api.Tests.Models
{
    public class City
    {
        [JsonProperty("id")]
        public int Id { get; set; }

        [JsonProperty("name")]
        public string Name { get; set; }

        [JsonProperty("country")]
        public string Country { get; set; }
    }
}
