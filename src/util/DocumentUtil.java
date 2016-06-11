package util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DocumentUtil {
	/**
	 * Kreira DOM od XML dokumenta
	 */
	
	public static Document buildDocument(String fileName) {
		Document document = null;
		try {
			// Kreira se DocumentBuilderFactory klasa, metoda je staticka
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			// Kreira DocumentBuilder
			DocumentBuilder builder = factory.newDocumentBuilder();

			// Parsiramo ulaz, tj. XML file
			File file = new File(fileName);
			document = builder.parse(file);
			System.out.println("filename:" + file.getAbsolutePath());

			if (document != null)
				System.out.println("File parsed with no errors \n\n\n");
			else
				System.out.println("Document is null");
			
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
		return document;

	}
	
	
	 /**
   	 * Kreira DOM od XML dokumenta
   	 */
	 public static DocumentBuilder getDocumentBuilder() {
	        try {
	            // Setup document builder
	            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
	            docBuilderFactory.setNamespaceAware(true);
	           

	            DocumentBuilder builder = docBuilderFactory.newDocumentBuilder();
	            return builder;
	        } catch (ParserConfigurationException e) {
	            e.printStackTrace();
	            return null;
	        }
	    }
	 
		public static Document convertToDocument(DOMSource request) {
			Document r = null;
			try {
				DocumentBuilder db = getDocumentBuilder();
				Transformer transformer = TransformerFactory.newInstance()
						.newTransformer();
				transformer.setOutputProperty(OutputKeys.INDENT, "no");
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				StreamResult result = new StreamResult(baos);
				transformer.transform(request, result);
				ByteArrayInputStream bais = new ByteArrayInputStream(
						baos.toByteArray());
				r = db.parse(bais);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return r;
		}
		
		//ZA BSEP
		public static Document reserialize(Node request) {
			Document r = null;
			try {
				DocumentBuilder db = getDocumentBuilder();
				Transformer transformer = TransformerFactory.newInstance()
						.newTransformer();
				transformer.setOutputProperty(OutputKeys.INDENT, "no");
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				StreamResult result = new StreamResult(baos);
				DOMSource src = new DOMSource(request);
				transformer.transform(src, result);
				ByteArrayInputStream bais = new ByteArrayInputStream(
						baos.toByteArray());
				r = db.parse(bais);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return r;
		}
		
		  public static Document removeSignature(Document doc) {
		        Document result = null;
		        try {
		            TransformerFactory tfactory = TransformerFactory.newInstance();
		            Transformer tx = tfactory.newTransformer();
		            tx.setOutputProperty(OutputKeys.INDENT, "yes");
		            DOMSource source = new DOMSource(doc);
		            DOMResult res = new DOMResult();
		            tx.transform(source,res);
		            result = (Document)res.getNode();
		        } catch (TransformerException e) {
		            e.printStackTrace();
		        }
		        NodeList signatures =
		result.getElementsByTagNameNS("http://www.w3.org/2000/09/xmldsig#",
		"Signature");

		        while(signatures.getLength() > 0) {

		signatures.item(0).getParentNode().removeChild(signatures.item(0));
		        }

		        return result;
		    }
		  //Magija
		    public static String getXMLString(Document xmlDoc) throws Exception {
		        StringWriter writer = null;
		        DOMSource source = new DOMSource(xmlDoc.getDocumentElement());
		        writer = new StringWriter();
		        StreamResult result = new StreamResult(writer);
		        TransformerFactory tFactory = TransformerFactory.newInstance();
		        Transformer transformer = tFactory.newTransformer();
		        transformer.transform(source, result);
		        StringBuffer strBuf = writer.getBuffer();
		        return strBuf.toString();
		      }
		    
		
}
