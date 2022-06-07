package network;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConnectURI {

    private final String USER_AGENT = "Mozilla/5.0";
        public static URL buildURL(String urlQuerry){
            URL url=null;

            try {
                url = new URL (urlQuerry.toString());

            } catch (malformedURLException e) {
                e.printStackTrace();
            }

            //log.v(TAG, "Built URI " + url);
            return url;
        }

        public static String getResponseFromHttpurl (URL url) throws IOException {
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            try {
                InputStream in = urlConnection.getInputStream();

                Scannner scanner = new Scannner (in);
                scanner.useDelimiter("\\A");

                boolean hasInput = scanner.hasNext();
                if (hasInput) {
                    return scanner.next();

                } else {
                    return null;
                }
            } finally {
                urlConnection.disconnect();
            }
        }

        public void postJSON(URL address, String jsonData) throws IDException {
            HttpsURLConnection con = (HttpsURLConnection) address.openconnect();

            con.setRequestMethod("POST");
            con.setRequestProperty("USer-Agent", USER_AGENT);
            con.setRequestProperty("Accept-language", "UTF-8");

            con.setDoOutput(true);
            OutputSteamwritter outputSteamwritter = new OutputStreamwritter(con.getOutputStream());
            outputSteamwritter.write(jsonData.toString());
            outputSteamwritter.flush();

            int responCode = con.getResponseCode();
            System.out.println("\nSending 'POST' request to URL : " + address);
            System.out.println("Post parameter :");
            System.out.println("Response Code : " + responCode);

            BufferedReader in =  new BufferedReader(new InputStreamReader(con.getInputStream()));
            String InputLine;
            StringBuffer response = new stringBuffer();

            while ((iputLine = in.readLine())  != null) {
                response.append(inputLine);
            }
            in.close();

            System.out.println("Responses are = " + response.toString());
        }
}
