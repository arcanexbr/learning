import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList notebook = new ArrayList();
        Scanner input = new Scanner(System.in);
        String vvod;
        NotebookFunction notebookFunction = new NotebookFunction(notebook);
        System.out.println("Сначала вводите номер команды, а затем отдельно данные. \n \n \n 1. Добавить строчку \n 2. Удалить строчку по индексу \n 3. Вывести строчку по индексу");
        while ((vvod = input.next()) != "0") {
            if (vvod.equals("1")) {
                notebookFunction.addString(input.next());
            }
            if (vvod.equals("2")) {
                notebookFunction.deleteString(Integer.parseInt(input.next()));
            }
            if (vvod.equals("3")) {
                System.out.println(notebookFunction.getString(Integer.parseInt(input.next())));
            }

        }

    }
}