import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pattern {

    public static void main(String[] args) {
        Pattern pat=Pattern.compile("e.+?d");
        Matcher mat=pat.matcher("extend the cup end table");
        
       // found=mat.matches();
       // if(mat.find())System.out.println("it machts");
       // else System.out.println("no match");
     /*  while(mat.find()){
           System.out.println("match at the index of:"+mat.start());
       }*/
       while(mat.find()){
        System.out.println("match :"+mat.group());
       }
    }
}