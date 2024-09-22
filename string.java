public class string{
    public static void main(String[] args) {

        /* 

        String name = "Khushi";
        int value = name.length();
        System.out.println("The length of the string is " + value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nonTrimendString = "   She is Khushi   ";
        System.out.println(nonTrimendString);
        String trimedString = nonTrimendString.trim();
        System.out.println(trimedString);

        System.out.println(name.substring(3));
        System.out.println(name.replace("Kh","aa"));

        */

        String letter =" Dear <|name|>, Thanks a lot !";
        letter = letter.replace("<|name|>", "Khushi");
        System.out.println(letter);

    
        //detect double and triple spaces
        String myString = "This string conatins  double     and triple space";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));
    }
}