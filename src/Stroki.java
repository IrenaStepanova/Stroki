import java.util.Scanner;

public class Stroki {
    public static void main(String[] args) {


        String stroki = new String();
        Scanner input = new Scanner(System.in);
        stroki = input.nextLine();
        String output = stroki.toLowerCase();
        System.out.println(output.replaceAll("[aeyiou]", "").replaceAll(".", ".$0"));
    }
}