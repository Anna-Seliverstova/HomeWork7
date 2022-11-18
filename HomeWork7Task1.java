import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork7Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str1 = in.nextLine();
        String str2 = "abc";
        Pattern pattern = Pattern.compile(str2);
        Matcher matcher = pattern.matcher(str1);
        int counter = 0;
        while (matcher.find()) {
            counter++;
        }
        str1 = str1.replaceAll("abc", "www");
        System.out.println(str1);
    }
}