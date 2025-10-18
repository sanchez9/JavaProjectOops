package octProjectSteph;

public class ReverseString {

    public static void main(String[] args) {
        String text="HelloWorld";
        String reversed=new StringBuilder(text).reverse().toString();
        System.out.println("Reversed String: "+reversed);
    }
}

// submitted by Srikanth