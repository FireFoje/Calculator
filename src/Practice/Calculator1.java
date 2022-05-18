package Practice;

import java.util.Scanner;

public class Calculator1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        System.out.println("Result is: " + Calc(num1, num2, operation));

    }

    public static int getInt(){
        System.out.print("Num: ");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        }else{
            System.out.println("Error");
            scanner.hasNext();
            num = getInt();
        }
        return num;
    }

    public static char getOperation(){
        System.out.print("Operaton: ");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        }else{
            System.out.println("Error");
            scanner.hasNext();
            operation = getOperation();
        }
        return operation;
    }

    public static int Calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            default:
                System.out.println("Error");
                result = Calc(num1, num2, operation);
        }
        return result;
    }
}
