package octProjectSteph;

public class NumberOfWords {

    public static void main(String[] args) {


        // 7. Count the Number of Words in a String: Write a function to count the number of words n a given string.
        // Words are separated by spaces or punctuation. For example, the input, "Hello, world!" should return 2.


        String sentence = "Hi, I'm name is Stephanie";

        int numOfWords = sentence.split("\\s").length;

        System.out.println(numOfWords);

    }

}

//submitted by Stephanie Sanchez
