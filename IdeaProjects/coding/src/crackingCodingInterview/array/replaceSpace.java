package crackingCodingInterview.array;

/**
 * Created by shishirbhargav on 12/28/15.
 */
public class replaceSpace {


    public static void main(String[] argv){

        String s = "Hello There";
        StringBuilder sb = new StringBuilder();
        int len = s.length();

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ')
                sb.append("%20");
            else
                sb.append(s.charAt(i));
        }
        System.out.println(sb.toString());
    }

}


