import java.util.Scanner;

public class Football {
    public static void main(String[] args) {


        String igroki = new String();
        Scanner input = new Scanner(System.in);
        igroki = input.nextLine();


        System.out.println((igroki.contains("0000000")||igroki.contains("1111111")?"YES":"NO"));

    }
}
