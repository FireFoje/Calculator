package Practice;
import java.util.Scanner;
public class Zagadka {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(getZagadka());
        String ans = getAnswer();

    }

    public static String getAnswer(){
        String ans;
        if(scanner.hasNext()){
            ans = scanner.nextLine();
        }else{
            System.out.println("Error");
            scanner.nextLine();
            ans = String.valueOf(getAnswer());
        }
        return ans;
    }

    public static String getZagadka() {
        System.out.println("Не лает, не кусает, а в дом не пускает. Кто это?: ");
        String zag;
        switch (getAnswer()){
            case "Замок":
                System.out.println("Correct");
                break;
            case "замок":
                System.out.println("Correct");
                break;
            default:
                System.out.println("Non correct.");
                zag = getZagadka();
                break;
        }
        return getZagadka();
    }
}
