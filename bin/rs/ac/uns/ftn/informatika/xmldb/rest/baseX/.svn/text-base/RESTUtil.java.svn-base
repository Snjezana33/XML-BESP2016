package rs.ac.uns.ftn.informatika.xmldb.rest.baseX;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.commons.io.IOUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
//import org.apache.commons.io.IOUtils;

/**
 * Klasa demonstrira upotrebu REST API-a BaseX XML baze podataka. Sadrzi set reusable CRUD operacija, sa primerom njihove upotrebe.
 */
public class RESTUtil {

	public static int createSchema(String restUrl, String schemaName) throws Exception {
		System.out.println("Created new schema: " + schemaName);
		URL url = new URL(restUrl + schemaName);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setDoOutput(true);
		conn.setRequestMethod(RequestMethod.PUT.toString());
		// int responseCode = printResponse(conn);
		int responseCode = conn.getResponseCode();
		conn.disconnect();
		return responseCode;
	}

	public static int createResource(String restUrl, String schemaName, String resourceId, InputStream resource) throws Exception {
		System.out.println("Created new resource: " + schemaName + "/" + resourceId);
		URL url = new URL(restUrl + schemaName + "/" + resourceId);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setDoOutput(true);
		conn.setRequestMethod(RequestMethod.PUT.toString());
		OutputStream out = new BufferedOutputStream(conn.getOutputStream());
		IOUtils.copy(resource, out);
		IOUtils.closeQuietly(resource);
		IOUtils.closeQuietly(out);
		// int responseCode = printResponse(conn);
		int responseCode = conn.getResponseCode();

		conn.disconnect();
		return responseCode;
	}

	public static HttpURLConnection getConnection(String restUrl, String schemaName, String resourceId) throws Exception {
		URL url = new URL(restUrl + schemaName + "/" + resourceId);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setDoOutput(true);
		conn.setRequestMethod(RequestMethod.PUT.toString());
		return conn;
	}

	public static InputStream retrieveResource(String restUrl, String query, String schemaName, RequestMethod method) throws Exception {
		if (method == RequestMethod.GET)
			return retrieveResource(restUrl, query, schemaName, "UTF-8", false);
		else if (method == RequestMethod.POST)
			return retrieveResourcePost(restUrl, query, schemaName);
		return null;
	}

	public static InputStream retrieveResourcePost(String restUrl, String xquery, String schemaName) throws Exception {
		System.out.println("Executed a post query");
		URL url = new URL(restUrl + schemaName);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setDoOutput(true);
		conn.setRequestMethod(RequestMethod.POST.toString());
		conn.setRequestProperty("Content-Type", "application/query+xml");
		OutputStream out = conn.getOutputStream();
		out.write(xquery.getBytes("UTF-8"));
		out.close();
		// int responseCode = printResponse(conn);
		int responseCode = conn.getResponseCode();
		if (responseCode == HttpURLConnection.HTTP_OK)
			return conn.getInputStream();
		conn.disconnect();
		return null;
	}

	public static InputStream retrieveResource(String restUrl, String query, String schemaName, String encoding, boolean wrap) throws Exception {
		StringBuilder builder = new StringBuilder(restUrl);
		builder.append(schemaName);
		builder.append("?query=");
		builder.append(query.replace(" ", "+"));
		builder.append("&encoding=");
		builder.append(encoding);
		if (wrap)
			builder.append("&wrap=yes");

		URL url = new URL(builder.substring(0));
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();

		// int responseCode = printResponse(conn);
		int responseCode = conn.getResponseCode();

		if (responseCode == HttpURLConnection.HTTP_OK)
			return conn.getInputStream();

		conn.disconnect();
		return null;
	}

	public static int deleteResource(String restUrl, String schemaName, String resourceId) throws Exception {
		if (resourceId != null && !resourceId.equals(""))
			System.out.println("Deleted resource: " + schemaName + "/" + resourceId);
		else
			System.out.println("Deleted schema: " + schemaName);

		URL url = new URL(restUrl + schemaName + "/" + resourceId);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod(RequestMethod.DELETE.toString());
		// int responseCode = printResponse(conn);
		int responseCode = conn.getResponseCode();
		conn.disconnect();
		return responseCode;
	}

	public static int dropSchema(String restUrl, String schemaName) throws Exception {
		return deleteResource(restUrl, schemaName, "");
	}

	public static int printResponse(HttpURLConnection conn) throws Exception {
		int responseCode = conn.getResponseCode();
		String message = conn.getResponseMessage();
		System.out.println("\n* HTTP response: " + responseCode + " (" + message + ')');
		return responseCode;
	}

	public static void printStream(InputStream input) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(input));
		for (String line; (line = br.readLine()) != null;) {
			System.out.println(line);
		}
	}
	
	public static boolean isRunning(String REST_URL) throws Exception {
		try {
			((HttpURLConnection) new URL(REST_URL).openConnection()).getResponseCode();
		} catch (ConnectException e) {
			return false;
		}
		return true;
	}

}
