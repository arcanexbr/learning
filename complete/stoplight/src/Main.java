import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String vvod;
        Scanner input = new Scanner(System.in);
        while ((vvod = input.next()) != "0") {
            if (Integer.parseInt(vvod) >= 0) {
                if (((Integer.parseInt(vvod) % 6) == 0) | (Integer.parseInt(vvod) % 6) > 3) {
                    System.out.println("Сейчас горит зеленый");
                } else if ((Integer.parseInt(vvod) % 6) == 3) {
                    System.out.println("Сейчас горит желтый");
                } else {
                    System.out.println("Сейчас горит красный");
                }

            } else {
                System.out.println("Ошибка. Нельзя вводить отрицательные значения! lalalalalalla (github test));

            }


        }
    }
}


