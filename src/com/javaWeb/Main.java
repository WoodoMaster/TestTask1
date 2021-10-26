package com.javaWeb;

import com.model.Fish;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String documentName = "Animals.xml";
        Document document = Parsing.getDocument(documentName);
        Node root = document.getFirstChild();
        NodeList rootChild = root.getChildNodes();
        Node animalNode = null;

        for (int i = 0; i < rootChild.getLength(); i++) {
            if ("ANIMAL".equals(rootChild.item(i).getNodeName())) {
                animalNode = rootChild.item(i);
            }
        }
        Parsing.printNodes(animalNode.getChildNodes());
        NodeList animalNodeChild = animalNode.getChildNodes();
        NodeList fishNodeList = null;
        ArrayList<Node> reptileNodes = new ArrayList<>();
        ArrayList<Fish> fishArrayList = new ArrayList<>();
        for (int i = 0; i < animalNodeChild.getLength(); i++) {
            if ("FISH".equals(animalNodeChild.item(i))) {
                fishNodeList = animalNodeChild.item(i).getChildNodes();
                fishArrayList.add(new Fish(fishNodeList.item(0).getTextContent(),
                        Integer.parseInt(fishNodeList.item(1).getTextContent()),
                        Integer.parseInt(fishNodeList.item(2).getTextContent()),
                        Integer.parseInt(fishNodeList.item(3).getTextContent()),
                        Integer.parseInt(fishNodeList.item(4).getTextContent()),
                        Integer.parseInt(fishNodeList.item(5).getTextContent()),
                        Integer.parseInt(fishNodeList.item(6).getTextContent())
                ));
            } else if ("REPTILE".equals(animalNodeChild.item(i))) {
                reptileNodes.add(animalNodeChild.item(i));
            }
        }

        fishArrayList.forEach(System.out::println);

    }
}

