import java.util.Scanner;
public class Main {
   static  String three = "Foo";
   static String five = "Bar";
    static String seven = "Qix";
    public static String isDigitPresent(int x,String s)
    {
        while (x > 0)
        {
            if (x % 10 == 7){
                 s = s+seven;
                 x = x / 10;
            }
            if (x % 10 == 5){
                 s = s+five;
                x = x / 10;
            }
            if (x % 10 == 3){
                 s = s+three;
                x = x / 10;
            }
        }
        return s;
    }
    public static String isDivizible(int x){
         String s = new String("");
        if(x%3 == 0){
            s = s+three+"-";
        }
        if(x%5==0){
            s = s+five+"-";
        }
        if(x%5==0 && x%3==0){
            s = s+seven+"-";
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        String isDivizibleResult = isDivizible(number);
        System.out.println (isDigitPresent(number,isDivizibleResult));
    }
}
