import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int x,y;

        Scanner sc = new Scanner(System.in);

        x=sc.nextInt();
        y=sc.nextInt();

        System.out.println(x*(y%10));
        System.out.println(x*(y%100/10));
        System.out.println(x*(y/100));
        System.out.println(x*y);
    }
}
