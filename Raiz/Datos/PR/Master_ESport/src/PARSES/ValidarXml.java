package PARSES;

import java.io.FileReader;
import java.io.Reader;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Validar xml con xsd desde java
 */

public class ValidarXml { 

public static void validarXmlvsXsd(String sFichXml, String sFichXsd) 
{ 
String YES = "yes"; 
String NO = "no"; 
String CHAR_ENCODING = "UTF8"; 
boolean NAME_SPACE_AWARE = true; 
boolean VALIDATING = true; 
String SCHEMA_LANGUAGE ="http://java.sun.com/xml/jaxp/properties/schemaLanguage"; 
String SCHEMA_LANGUAGE_VAL = "http://www.w3.org/2001/XMLSchema"; 
String SCHEMA_SOURCE ="http://java.sun.com/xml/jaxp/properties/schemaSource"; 

try 
{ 
Reader xmlReader; 
Reader xsdReader; 

xmlReader = new FileReader(sFichXml); 
xsdReader = new FileReader(sFichXsd); 

SAXParserFactory factory = SAXParserFactory.newInstance(); 


factory.setNamespaceAware(NAME_SPACE_AWARE); 

factory.setValidating(VALIDATING); 

SAXParser parser = factory.newSAXParser(); 


parser.setProperty(SCHEMA_LANGUAGE, SCHEMA_LANGUAGE_VAL); 

parser.setProperty(SCHEMA_SOURCE, new InputSource(xsdReader));

DefaultHandler handler = new XmlDefaultHandler(); 
parser.parse(new InputSource(xmlReader), handler); 

}

catch (Exception ex){

    System.out.println(ex.getMessage());
}	

}

public static class XmlDefaultHandler extends DefaultHandler 
{ 

public void error(SAXParseException spe) throws SAXException 
{ 
throw spe; 
} 


public void fatalError(SAXParseException spe) throws SAXException 
{ 
throw spe; 
} 
} 


}