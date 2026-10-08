package RegexProblems;
import java.util.regex.Pattern;
/*
Given a two strings find that the Second string starts with the first string or not.
    "geeks.*", "geeksforgeeks"
 */
public class Problem1 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("geeks..","geeksfo"));
    }
}
