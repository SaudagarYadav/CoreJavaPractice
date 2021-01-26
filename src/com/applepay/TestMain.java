package com.applepay;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.KeyStore;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

public class TestMain {

	public static void main(String[] args) throws Exception {

		KeyStore clientKeyStore = KeyStore.getInstance("pkcs12");
		clientKeyStore.load(new FileInputStream("/Users/verchaska/Desktop/Setup/WS/Test/src/com/applepay/Certificates.p12"), "verchaska@123".toCharArray());

		// We build the KeyManager (SSL client credentials we can send)
		KeyManagerFactory keyFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
		keyFactory.init(clientKeyStore, "verchaska@123".toCharArray());
		KeyManager[] km = keyFactory.getKeyManagers();

		// We build the TrustManager (Server certificates we trust)
		TrustManagerFactory trustFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
		trustFactory.init(clientKeyStore);
		TrustManager[] tm = trustFactory.getTrustManagers();

		// We build a SSLContext with both our trust/key managers
		SSLContext sslContext = SSLContext.getInstance("TLS");
		sslContext.init(km, tm, null);
		SSLSocketFactory sslSf = sslContext.getSocketFactory();

		// We prepare a URLConnection
		URL url = new URL("https://apple-pay-gateway.apple.com/paymentservices/paymentSession");
		// Before actually opening the sockets, we affect the SSLSocketFactory

		// Ready to go !

		final HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
		con.setDoOutput(true);
		DataOutputStream wr = null;
		BufferedReader in = null;
		StringWriter writer = null;
		con.setSSLSocketFactory(sslSf);

		try {
			wr = new DataOutputStream(con.getOutputStream());
			// inal String urlParameters = urlParameter + URLEncoder.encode(xml,
			// StandardCharsets.UTF_8.displayName());
			// wr.write(urlParameters.getBytes(StandardCharsets.UTF_8.displayName()));
			wr.flush();

			in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			writer = new StringWriter();

			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				writer.append(inputLine);
			}
			
			System.out.println("test apple pay :" + writer.toString());
		} finally {
			if (wr != null) {
				wr.close();
			}
			if (in != null) {
				in.close();
			}
			if (writer != null) {
				writer.close();
			}
		}
	}
}
