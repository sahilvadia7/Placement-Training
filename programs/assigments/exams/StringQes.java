package programs.assigments.exams;

public class StringQes {
    public static void main(String[] args) {
        String str1= "java is follow the oops concepts";
        String str2 = "hello java";
        String str3 = "hello JAVA";


        //it concat other string 
        System.out.println(str1.concat(" "+str2));

        //give Char of index
        System.out.println(str1.charAt(3));

        //get string using substring for both str1,str2 and compair both are same or not
        System.out.println(str1.substring(0,3).equals(str2.substring(6,9)));

        //getting length of string
        System.out.println(str1.length());

        //copairing string ignoring Case
        System.out.println(str3.compareToIgnoreCase(str2));
    }
}
