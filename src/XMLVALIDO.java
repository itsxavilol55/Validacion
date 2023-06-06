
import org.w3c.dom.Document;
import org.w3c.dom.NameList;
import org.w3c.dom.Node;
import org.xml.sax.helpers.DefaultHandler;
import java.io.*;
import javax.lang.model.element.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.w3c.dom.*;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class XMLVALIDO implements ErrorHandler {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("error, debe de proporcionar el nombre del archivo");
            return;
        }
        String arch = args[0];
        System.out.println("*****VALIDADNDO, SI ES VALIDO EL ARCHIVO " + arch);
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            dbFactory.setValidating(true);
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            dBuilder.setErrorHandler(new XMLVALIDO());
            Document doc = dBuilder.parse(arch);

            System.out.println("********fin del analisis todo bien************");
        } catch (Exception e) {
            System.out.println("_______________________________________");
            System.out.println(e);
            return;
        }
    }

    @Override
    public void warning(SAXParseException exception) throws SAXException {
        throw exception;
    }

    @Override
    public void error(SAXParseException exception) throws SAXException {
        throw exception;
    }

    @Override
    public void fatalError(SAXParseException exception) throws SAXException {
        throw exception;
    }
}
