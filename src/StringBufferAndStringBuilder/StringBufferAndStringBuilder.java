package StringBufferAndStringBuilder;

public class StringBufferAndStringBuilder {
    public static void main(String[] args){
        StringBuffer buffer = new StringBuffer("Hello ");
        System.out.println(buffer.capacity());
        buffer.append("world");
        System.out.println(buffer);

        StringBuilder builder = new StringBuilder("Hello ");
        System.out.println(builder.capacity());
        builder.append("world ");
        System.out.println(builder);
    }
}
