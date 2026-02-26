public class StringDemo{
    public static void main(String[]  args){
        String s1="PwSkills";
        String s2="PwSkills";
        String s3=new String("PwSkills");

        System.out.println("Comparing String with == ");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s2==s3);

        System.out.println("Comparing string with .equals() method");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
}