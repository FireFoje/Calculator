package Practice;
import java.util.Scanner;
import java.lang.String;
public class Calculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = (char) getOperation();
        int result = calc(num1, num2, operation);
        System.out.println("Результат: " + result);

    }
    public static int getInt(){
        System.out.println("Введите число: ");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        }else{
            System.out.println("Не число.");
            scanner.nextInt();
            num = getInt();
        }
        return num;
    }
    public static int getOperation(){
        System.out.println("Введите операцию: ");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        }else{
            System.out.println("Не операция.");
            scanner.next();
            operation = (char) getOperation();
        }
        return operation;
    }
    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Неверная операция.");
                result = calc(num1, num2, operation);
        }
        return  result;
    }
}
