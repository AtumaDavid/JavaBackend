package collections;

public class LinkedList {
    public static  void main(String[] args){
        java.util.LinkedList<String> linkedList = new java.util.LinkedList<String>();
//        System.out.println(linkedList.size());

        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("JavaScript");
        linkedList.add("C#");

        System.out.println(linkedList);
    }
}
