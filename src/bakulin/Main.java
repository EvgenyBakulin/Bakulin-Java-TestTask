package bakulin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 4, текстовая форма");
        System.out.println("Последовательность [((( ))()(( ))]] является неправильной. Правильной будет последовательность [((( ))()(( )))]");
        //Использую класс Scanner, чтобы иметь возможность вводить данные с клавиатуры в консоль
        Scanner input = new Scanner(System.in);
        boolean isTask = true;
        while (isTask) {
            System.out.println("Введите номер задания: 1 - первое (c числом 7), 2 - второе (Вячеслав), 3 - третье (массив),0 - выход");
            int task = input.nextInt();
            switch (task) {
                case 0:
                default: {
                    isTask = false;
                    break;
                }
                case 1: {
                    System.out.println("Введите число: ");
                    int number = input.nextInt();
                    if (number > 7) {
                        System.out.println("Привет!");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Введите имя: ");
                    String name = input.next();
                    if (name.equals("Вячеслав")) {
                        System.out.println("Привет, " + name + "!");
                    } else {
                        System.out.println("Нет такого имени!");
                    }
                    break;
                }
                case 3: {
                    int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
                    System.out.println("Исходный массив:");
                    for (int i = 0; i < array.length - 1; i++) {
                        System.out.print(array[i] + " ");
                    }
                    System.out.println(array[array.length - 1]);
                    System.out.println("Элементы массива, кратные 3:");
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] % 3 == 0) {
                            System.out.print(array[i] + " ");
                        }
                    }
                    System.out.println();
                    break;
                }
            }
        }
    }

}
