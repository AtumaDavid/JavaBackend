package collections;

public class Vector {
    public static  void main(String[] args){
        java.util.Vector<String> vector = new java.util.Vector<String>();
//        System.out.println(vector.size());

        vector.add("Programming");
        vector.add("Working");
        vector.add("Database");
        vector.add("Deployment");
        vector.add("Cloud Services");

        System.out.println(vector);
        System.out.println(vector.size());
    }
}
