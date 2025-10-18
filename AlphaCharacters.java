package octProjectSteph;

public class AlphaCharacters {
    public static void main(String[] args) {
        String text="Iphone17promax";
        int alphaCount=0;
        for (int i = 0; i <text.length(); i++) {
            char ch=text.charAt(i);
            if (Character.isLetter(ch)){
                alphaCount++;

            }
        }
        System.out.println("Number of alpha characters: "+alphaCount);
    }
}

//submitted by Srikanth
