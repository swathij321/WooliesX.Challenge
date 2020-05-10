using System;
using System.Collections.Generic;
using System.Net;
using System.Text;

namespace WooliesX.Challenge.Api.Tests.Utilities
{
    public static class RestApiUtil
    {
        public static string Get(Uri uri)
        {
            using (var client = new WebClient())
            {
                return client.DownloadString(uri);
            }
        }
    }
}
