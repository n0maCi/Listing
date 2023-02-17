package ru.vshp.listing7;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import java.io.File;
class Transform {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java Transform имя_файла_xsl имя_файла_xml");
            System.exit(0);
        }
        File xslFile = new File(args[0]);
        File xmlFile = new File(args[1]);

        StreamSource xslSourse = new StreamSource(xslFile);
        StreamSource xmlSourse = new StreamSource(xmlFile);
        StreamResult outResult = new StreamResult(System.out);

        try {
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer(xslSourse);

            transformer.transform(xmlSourse, outResult);
        } catch(Exception ex) {
            System.out.println(ex);
        }
    }
}