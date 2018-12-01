import java.util.Scanner;
import java.util.regex.*;

public class Solution3
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while(testCases>0){
            try{
            String pattern = in.nextLine();
            Pattern p = Pattern.compile(pattern);
            System.out.println("Valid");
            testCases--;
        }catch (PatternSyntaxException e){
                System.out.println("Invalid");
                testCases--;
            }}

    }
}