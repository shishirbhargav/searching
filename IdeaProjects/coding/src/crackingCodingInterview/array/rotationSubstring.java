package crackingCodingInterview.array;

/**
 * Created by shishirbhargav on 12/28/15.
 */
public class rotationSubstring {

    public static void main(String[] argv){
        String s1 = "major";
        String s2 = "jorma";
        String s3 = "laser";

        if (findrotationSubstring(s1,s2))
            System.out.print("Rotation Substring");
        else
            System.out.print("Not a Rotation Substring");

    }

    static boolean findrotationSubstring(String s1, String s2){
        if (s1.length() != s2.length())
            return false;

        StringBuilder sb = new StringBuilder();
        if (sb.append(s1).append(s1).toString().contains(s2))
            return true;
        else
            return false;
    }
}
