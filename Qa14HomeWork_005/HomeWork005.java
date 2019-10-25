package Qa14HomeWork_005;

import java.util.Scanner;

public class HomeWork005 {

    public static void main(String[] args) {
// Первое задание
//1. Ввести число, и определить – чётное оно, или нет.
        System.out.println("\nПервое задание");
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
//        if (number % 2 > 0) {
//            System.out.println(number + "- нечетное число.");
//        }
//        if (number % 2 == 0) {
//            System.out.println(number + "- четное число.");
//        }
        if (number % 2 == 0) {
            System.out.println(number + "- четное число.");
        }
        else {
            System.out.println(number + "- нечетное число.");
        }

//Второе задание
//2. Ввести три числа и найти наименьшее среди них.
        System.out.println("");
        System.out.println("\nВторое задание");
        System.out.println("Введите первое число: ");
        double number01 = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double number02 = scanner.nextDouble();
        System.out.println("Введите третье число: ");
        double number03 = scanner.nextDouble();
        double maxNumber;
        if (number01 > number02) {
            maxNumber = number01;
        }
        else {
            maxNumber = number02;
        }
        if (maxNumber < number03) {
            maxNumber = number03;
        }
        System.out.println(maxNumber + "- максимальное число.");

//Третье задание
//3. Ввести число, и выяснить - положительное оно, отрицательное, или равно нулю?
        System.out.println("");
        System.out.println("\nТретье задание");
        System.out.println("Введите число: ");
        double numberSmolBig = scanner.nextDouble();
        if (numberSmolBig < 0) {
            System.out.println("Введенное число меньше нуля.");
        }
        else if (0 < numberSmolBig) {
            System.out.println("Введенное число больше нуля.");
        }
        else if (numberSmolBig == 0) {
            System.out.println("Введенное число равно нулю.");
        }

//Четвертое задание
//4. Реализовать калькулятор. Вводятся 2 любых вещественных числа в переменные a и b. Необходимо вывести на экран меню с пунктами:
//1) a + b
//2) a – b
//3) a * b
//4) a / b
//5) a % b
//При выборе соответствующего пункта меню происходит вывод результата вычисления (должна быть проверка деления на 0!)
        System.out.println("");
        System.out.println("\nЧетвертое задание");
        System.out.println("Введите первое число (a): ");
        int numberA = scanner.nextInt();
        System.out.println("Введите второе число (b): ");
        int numberB = scanner.nextInt();
        System.out.println("1) " + numberA + " + " + numberB + "\n" +
                "2) " + numberA + " – " + numberB + "\n" +
                "3) " + numberA + " * " + numberB + "\n" +
                "4) " + numberA + " / " + numberB + "\n" +
                "5) " + numberA + " % " + numberB + "");
        System.out.println("Введите число от одного до пяти, которому соответсвует действие, котрое Вы хотите совершить с ранее введенными Вами числами " + numberA + " и " + numberB + ": ");
        int numberFrom1To5 = scanner.nextInt();
        while (numberFrom1To5 < 1 || numberFrom1To5 >5) {
           if (numberFrom1To5 < 1) {
                System.out.println("Введенное Вами число меньше 1.");
            }
            if (numberFrom1To5 > 1) {
                System.out.println("Введенное Вами число больше 5.");
            }
            numberFrom1To5 = scanner.nextInt();
        }
        if (numberFrom1To5 == 1) {
            System.out.println("Значение выбранной Вами операции - " + (numberA + numberB));
        }
        else if (numberFrom1To5 == 2) {
            System.out.println("Значение выбранной Вами операции: " + (numberA - numberB));
        }
        else if (numberFrom1To5 == 3) {
            System.out.println("Значение выбранной Вами операции: " + (numberA * numberB));
        }
        else if (numberFrom1To5 == 4) {
            System.out.println("Значение выбранной Вами операции: " + (numberA / numberB));
        }
        else if (numberFrom1To5 == 5) {
            System.out.println("Значение выбранной Вами операции: " + (numberA % numberB));
        }

//Пятое задание
//5. Ввести с клавиатуры символ. Определить, чем он является: цифрой, буквой или знаком пунктуации.
        System.out.println("");
        System.out.println("\nПятое задание");
        System.out.println("Введите с клавиатуры один символ: ");
        char symbol = scanner.next().charAt(0);
        if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("Это большая строчная буква.");
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("Это малая строчная буква.");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println("Это цифра");
        } else if (symbol == ',' || symbol == '.' || symbol == ':' || symbol == ';' || symbol == '!' || symbol == '?' || symbol == '"' || symbol == '-' || symbol == '(' || symbol == ')' ) {
                System.out.println("Это знак пунктуации.");
            }

//Шестое задание
//6. Ввести с клавиатуры число и проверить, принадлежит ли это число диапазону от N до M (включительно).
        System.out.println("");
        System.out.println("\nШестое задание");
        System.out.println("Введите первое, самое меньшее число из диапозона чисел (M): ");
        int numberM = scanner.nextInt();
        System.out.println("Введите второе, самое большее число из диапозона чисел (N): ");
        int numberN = scanner.nextInt();
        while (numberN < numberM) {
            System.out.println("Второе число (N) не может быть меньше первого (M). Введите второе, большее число из диапозона чисел (N): ");
            numberN = scanner.nextInt();
        }
        System.out.println("Введите третье число, прианадлежность которого к введенному диапазану чисел должна быть проверена: ");
        int numberDiapazon = scanner.nextInt();
        if (numberDiapazon >= numberM && numberDiapazon <= numberN) {
            System.out.println("Введенное Вами число находится в указанном диапазоне чисел (M-N).");
        }
        else {
            System.out.println("Введенное Вами число находится за пределами указанного диапазона чисел (M-N).");
        }

//Седьмое задание
//7. Написать программу для проверки кратности числа X числу Y (оба числа вводятся с клавиатуры).
        System.out.println("");
        System.out.println("\nСедьмое задание");
        System.out.println("Введите Х, число кратность которого числу Y будет проверяться: ");
        int numberX = scanner.nextInt();
        System.out.println("Введите число Y: ");
        int numberY = scanner.nextInt();
        while (numberY == 0) {
            System.out.println("Делить на ноль нельязя. Введите число Y: ");
            numberY = scanner.nextInt();
        }
        if ((numberX % numberY) > 0) {
            System.out.println("Число " + numberX + " не кратно числу " + numberY + ".");
            }
        else if ((numberX % numberY) == 0) {
            System.out.println("Число " + numberX + " кратно числу " + numberY + ".");
        }

//Восьмое задание
//8. Ввести число и определить кратно ли оно 3, 5, и 7 одновременно.
        System.out.println("");
        System.out.println("\nВосьмое задание");
        System.out.println("Введите число, одновременная кратность которого числу 3,5,7 будет проверяться: ");
        int number357 = scanner.nextInt();
        if ((number357 % 3) == 0 && (number357 % 5) == 0 && (number357 % 7) == 0) {
            System.out.println("Число " + number357 + " одновременно кратно числам 3,5,7.");
        }
        else {
            System.out.println("Число " + number357 + " одновременно не кратно числам 3,5,7.");
        }

//Девятое задание
//9. Показать модуль введённого числа.
        System.out.println("");
        System.out.println("\nДевятое задание");
        System.out.println("Введите число, модуль которого нужно показать: ");
        double numberModul = scanner.nextDouble();
        if (numberModul >= 0) {
            System.out.println("Модуль числа " + numberModul + " равен " + numberModul + ".");
        }
        else if (numberModul < 0) {
            System.out.println("Модуль числа "  + numberModul + " равен " + (0 - numberModul) + ".");
        }

//Десятое задание
//10. Вводится целое число (не более 4 разрядов!). Определить количество цифр в нём.
        System.out.println("");
        System.out.println("\nДесятое задание");
        System.out.println("Введите число в котором не более чем 4 разряда: ");
        int number4Digits = scanner.nextInt();
        int isNumber4Digits = (int) Math.ceil(Math.log10(number4Digits));
        while (isNumber4Digits > 4) {
            System.out.println("Введенное число содержит больше чем 4 разряда. Введите число в котором не более чем 4 разряда: ");
            number4Digits = scanner.nextInt();
            isNumber4Digits = (int) Math.ceil(Math.log10(number4Digits));
        }
        System.out.println("В числе " + number4Digits + " - " + isNumber4Digits + " цифры."); // При введении единицы - баг в виде колличества цифр 0.
        if ((number4Digits / 1000) > 0) {
            System.out.println ("В числе " + number4Digits + "- 4 цифры.");
        }
        else if ((number4Digits / 100 % 10) > 0) {
            System.out.println ("В числе " + number4Digits + "- 3 цифры.");
        }
        else if ((number4Digits / 10 % 10) > 0) {
            System.out.println ("В числе " + number4Digits + " - 2 цифры.");
        }
        else {
            System.out.println ("В числе " + number4Digits + " - 1 цифра.");
        }

//Одинадцатое задание
//11. Ввести с клавиатуры пятизначное число и определить, является ли оно палиндромом (т.е. одинаково читается в обоих направлениях - например, 12321 будет палиндромом, а 12345 – не палиндром).
        System.out.println("");
        System.out.println("\nОдинадцатое задание");
        System.out.println("Введите пятизначное число: ");
        int number5Digits = scanner.nextInt();
        int isNumber5Digits = (int) Math.ceil(Math.log10(number5Digits));
        while (isNumber5Digits != 5) {
            System.out.println("Введенное число не является пятизначным. Число " + number5Digits + "- " + isNumber5Digits + " значное. Введите число в котором не более чем 4 разряда: ");
            number5Digits = scanner.nextInt();
            isNumber5Digits = (int) Math.ceil(Math.log10(number5Digits));
        }
        int D1number5Digits = number5Digits / 10000;
        int D2number5Digits = number5Digits / 1000 % 10;
        int D4number5Digits = number5Digits / 10 % 10;
        int D5number5Digits = number5Digits % 10;
        if (D1number5Digits == D5number5Digits && D2number5Digits == D4number5Digits) {
           System.out.println ("Число " + number5Digits + "- палиандром.");
        }
        else {
            System.out.println ("Число " + number5Digits + "- не палиандром.");
        }

//Двенадцатое задание
//12. Пользователь задаёт координаты верхнего левого, и нижнего правого угла прямоугольника, а также координаты точки (X,Y) в декартовой системе координат. Принадлежит ли точка этому прямоугольнику?
        System.out.println("");
        System.out.println("\nДвенадцатое задание");
        System.out.println("Введите число Х1, - координату верхнего левого угла прямоугольника по вертикальной оси Х: ");
        int numberX1 = scanner.nextInt();
        System.out.println("Введите число Y1, - координату верхнего левого угла прямоугольника по горизонтальной оси Y: ");
        int numberY1 = scanner.nextInt();
        System.out.println("Введите число Х2, - координату нижнего правого угла прямоугольника по вертикальной оси Х: ");
        int numberX2 = scanner.nextInt();
        while (numberX1 <= numberX2) {
            System.out.println("Координата правого нижнего угла прямоугольника (Х2) не может быть выше по вертикальной оси Х от координаты левого верхнего угла прямоугольника (Х1).\nВведите число Х2, - координату нижнего правого угла прямоугльника по вертикальной оси Х: ");
            numberX2 = scanner.nextInt();
        }
        System.out.println("Введите число Y2, - координату нижнего правого угла прямоугольника по горизонтальной оси Y: ");
        int numberY2 = scanner.nextInt();
        while (numberY1 >= numberY2) {
            System.out.println("Координата правого нижнего угла прямоугольника (Y2) не может быть с лева по горизонтальной оси Y от координаты левого верхнего угла прямоугольника (Y1).\nВведите число Y2, - координату нижнего правого угла прямоугльника по горизонтальной оси Y: ");
            numberY2 = scanner.nextInt();
        }
        System.out.println("Введите число Х, - координату точки по вертикальной оси Х: ");
        int numberXcheck = scanner.nextInt();
        System.out.println("Введите число Y, - координату точки по горизонтальной оси Y: ");
        int numberYcheck = scanner.nextInt();
        if (numberXcheck >= numberX2 && numberXcheck <= numberX1 &&  numberYcheck >= numberY1 && numberYcheck <= numberY2) {
            System.out.println("Введенная точка с координатами " + numberXcheck + " по оси Х и координатами " + numberYcheck + " по оси Y принадлежит прямоугольнику.");
        }
        else {
            System.out.println("Введенная точка с координатами " + numberXcheck + " по оси Х и координатами " + numberYcheck + " по оси Y не принадлежит прямоугольнику.");
        }

//Тринадцатое задание
//13. Найти максимальное значение среди 4 переменных, используя тернарный оператор.
        System.out.println("");
        System.out.println("\nТринадцатое задание");
        System.out.println("Введите число А: ");
        int aNumber = scanner.nextInt();
        System.out.println("Введите число B: ");
        int bNumber = scanner.nextInt();
        System.out.println("Введите число C: ");
        int cNumber = scanner.nextInt();
        System.out.println("Введите число D: ");
        int dNumber = scanner.nextInt();
        int maxABCD = aNumber > bNumber ? (aNumber > cNumber ? aNumber : cNumber): (bNumber > cNumber ? bNumber : cNumber);
        maxABCD = (maxABCD > dNumber ? maxABCD : dNumber);
        System.out.println("Максимальное число: " + maxABCD);


    }


}
