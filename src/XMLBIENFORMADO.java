import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;

public class XMLBIENFORMADO {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("error, debe de proporcionar el nombre del archivo");
            return;
        }
        String arch = args[0];
        System.out.println("*****VALIDADNDO SI EST� BIEN FORMADOS EL ARCHIVO " + arch);
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(arch);

            System.out.println("********fin del analisis todo bien************");
        } catch (Exception e) {
            System.out.println(e);
            return;
        }
    }
}
