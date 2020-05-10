using Newtonsoft.Json;
using Newtonsoft.Json.Linq;
using System;
using System.Collections.Generic;
using System.Text;

namespace WooliesX.Challenge.Api.Tests.Utilities
{
    public static class JsonUtil
    {
		public static bool IsValidJson(string json)
		{
			if(string.IsNullOrWhiteSpace(json))
			{
				return false;
			}

			json = json.Trim();

			if (IsObject(json) || IsArray(json))
			{
				try
				{
					JToken.Parse(json);
					return true;
				}
				catch (JsonReaderException jex)
				{
					Console.WriteLine(jex.Message);
					return false;
				}
				catch (Exception ex)
				{
					Console.WriteLine(ex.ToString());
					return false;
				}
			}

			return false;
		}

		public static T Deserialize<T>(string json) => JsonConvert.DeserializeObject<T>(json);

		private static bool IsObject(string json) => json.StartsWith("{") && json.EndsWith("}");

		private static bool IsArray(string json) => json.StartsWith("[") && json.EndsWith("]");
	}
}
