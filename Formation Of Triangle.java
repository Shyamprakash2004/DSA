import java.util.Scanner;

public class Formation_Of_Triangle {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        int b = in.nextInt();

        int c = in.nextInt();

        int sum = a+b+c;

        if(sum == 180){
            System.out.println("Triangle will be form");
        }

        else{
            System.out.println("Triangle will not be form");
        }
    }
}
