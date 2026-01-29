import java.util.Scanner;

public class Getting_Inputs {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input");

        int num = in.nextInt();

        char c = in.next().charAt(0);

        String str = in.nextLine();

        System.out.println(num);

        System.out.println(str);

        System.out.println(c);
    }
}
