package JavaArrayAssignments;
/*
    Q2. Convert the list of Strings {“ab”, “bc”, “cd”, “de”, “ef”, “fg”, “gh”} into an array of strings and print all
    strings stored on odd indices of the array.
    Output:
    bc
    de
    fg
*/
public class Question2 {
    public static void main(String[] args) {
        String words[]={"ab","bc","cd","de","ef","fg","gh"};

        System.out.println("List of String that are stored on odd indices of the array.");
        for(int i=0; i<words.length; i++){
            if(i%2!=0){
                System.out.println(words[i]);
            }
        }
    }
}
