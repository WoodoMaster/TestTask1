package com.javaWeb;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Parsing {

    public static Document getDocument(String fileName){
    File file = new File(fileName);
    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
    Document document = null;
        try {
        document = documentBuilderFactory.newDocumentBuilder().parse(file);
    } catch (SAXException | IOException | ParserConfigurationException e) {
        System.out.println(e.getMessage());
    }
    return document;
    }

    public static void printNodes(NodeList nodeList){
        if(nodeList==null){
            System.out.println("Empty nodeList");
            return;
        }
        for (int i = 0; i < nodeList.getLength(); i++) {
            if(nodeList.item(i).getNodeType()!= Node.ELEMENT_NODE){
                continue;
            }
            System.out.println(nodeList.item(i).getNodeName());
        }
    }


}
