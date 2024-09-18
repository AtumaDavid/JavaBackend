package collections;

import java.util.List;

public class ArrayList {
    public static  void main(String[] args){
        List<String> list = new java.util.ArrayList<String>();
        list.add("King");
        list.add("Sarah");
        list.add("Queen");

        System.out.println(list);
        for(String value: list){
            System.out.println(value);
        }
    }
}
