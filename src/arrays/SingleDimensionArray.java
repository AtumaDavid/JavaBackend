package arrays;

public class SingleDimensionArray {
    public static void main(String[] args){
////        Declaring an array
//        int[] marks;
//        marks = new int[5];
//
//        /* OR */
//        int[] marks = new int[5];

//        Initializing an array
//        int[] marks = new int[] {10, 20, 30, 40, 50};

//        Declare and Assign
        int[] marks = new int[5];
        marks[0] = 100;
        marks[1] = 60;
        marks[2] = 67;
        marks[3] = 80;
        marks[4] = 59;

        for (int mark : marks) {
            System.out.println(mark);
        }
        System.out.println("***********");

        for (int value : marks) {
            System.out.println(value);
        }
    }
}
