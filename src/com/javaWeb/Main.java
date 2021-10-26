package com.javaWeb;
import com.model.Catalog;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        File file = new File("Animals.xml");
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        Document document = null;
        try {
             document  = documentBuilderFactory.newDocumentBuilder().parse(file);
        } catch (SAXException | IOException | ParserConfigurationException e) {
            System.out.println(e.getMessage());
            return;
        }

        Catalog catalog  = null;
        System.out.println(catalog);
    }
}
