import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Solution2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        List lst = Arrays.stream(s.split("[\\W_]")).filter(x -> x.length() >= 1).collect(Collectors.toList());
        System.out.println(lst.size());
        lst.stream().forEach(System.out::println);
        scan.close();
    }
}