import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern2 {
    public static void main(String[] args) {
        
        String str="devo & maghan of devo sister was there";
       /* Pattern pat=Pattern.compile("[a-z]+");
        Matcher mat=pat.matcher("whats up its ur devo ");
        while(mat.find()){
            System.out.println("matchs :"+mat.group());
        }

        */
        Pattern pat=Pattern.compile("devo.*?");
        Matcher mat=pat.matcher(str);

        System.out.println("standard string form: "+str);

        str=mat.replaceAll("eyuel");
             
        System.out.println("modified string form: "+str);

         pat = Pattern.compile("[ ,.!]");
String strs[] = pat.split("one two,alpha9 12!done.");
for(int i=0; i < strs.length; i++)
System.out.println("Next token: " + strs[i]);
    }
    
}