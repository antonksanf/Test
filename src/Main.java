import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String term = in.nextLine();
        in.close();
        int result;
        try {
            String test = calc(term);
            result = Integer.parseInt(test);
            String res = Integer.toString(result);
            System.out.println(res);
        } catch (Exception e) {
            System.out.println("throw Exception");
        }

    }
    public static String calc(String input) {
        String[] arr = input.split(" ");
        int a = Integer.parseInt(arr[0].trim());
        int b = Integer.parseInt(arr[2].trim());
        String op = arr[1];
        int res = -1;
        String ex = "Exception";

        if ((a >= 0 && a <= 10) && (b >= 0 && b <= 10)) {
            if (arr.length == 3) {
                switch (op) {
                    case "+" -> res = a + b;
                    case "-" -> res = a - b;
                    case "*" -> res = a * b;
                    case "/" -> res = a / b;
                }
            }
        }
        if (res == -1) {
            return ex;
        }
        else {
            return Integer.toString(res);
        }
    }
}
