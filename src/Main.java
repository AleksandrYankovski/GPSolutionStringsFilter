
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Параметры программы:");
        // String argsString = sc.nextLine();
        List<String> argsString = new ArrayList<>();

        for (int index = 0; index < args.length; index++) {
            argsString.add(args[index]);
            System.out.print(args[index]+" ");
        }
        System.out.println();

        System.out.println("Строки:");
        List<String> inputStrings = new ArrayList<>();

        while (true) {
            String tempString = sc.nextLine();

            if ("".equals(tempString))
                break;
            else {
                inputStrings.add(tempString);
            }
        }
        System.out.println("Вывод:");
        DataFilter filter = new DataFilter(argsString, inputStrings);
        List<String> filtredList = filter.filtrate();
        for (String tempString : filtredList) {
            System.out.println(tempString);
        }

    }
}
