package javaU;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List<String> words = List.of("Apple", "Bat", "Cat");
        System.out.println(words);
        System.out.println(words.size());
        System.out.println(words.isEmpty());
        System.out.println(words.get(0));
        System.out.println(words.contains("Dog"));
        System.out.println(words.contains("Cat"));
        System.out.println(words.indexOf("Cat"));
        System.out.println(words.indexOf("Dog"));

        List<String> wordsArrayList = new ArrayList<String>(words);
        List<String> wordsLinkedList = new ArrayList<String>(words);
        List<String> wordsVector = new ArrayList<String>(words);
        wordsArrayList.add("Dog");
        wordsLinkedList.add("Pig");
        wordsVector.add("Cow");

        System.out.println(wordsArrayList.toString());
        System.out.println(wordsLinkedList.toString());
        System.out.println(wordsVector);
    }
}
