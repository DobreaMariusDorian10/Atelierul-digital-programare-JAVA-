import java.util.Scanner;
public class Main {

    public static String compute(int x)
    {
        String three = "Foo";
        String five = "Bar";
        String seven = "Qix";
        String s = new String("");
        if(x%3 == 0){
            s = "-"+s+three;
        }
        if(x%5==0){
            s = "-"+s+five;
        }
        if(x%5==0 && x%3==0){
            s = "-"+s+seven;
        }

        while (x > 0)
        {
            if (x % 10 == 3){
                 s = three+s;
                 x = x / 10;
            }
            if (x % 10 == 5){
                 s = five+s;
                x = x / 10;
            }
            if (x % 10 == 7){
                 s = seven+s;
                x = x / 10;
            }
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println (compute(number));
    }
}
