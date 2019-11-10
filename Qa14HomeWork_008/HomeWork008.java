package Qa14HomeWork_008;

import java.util.Random;
import java.util.Scanner;

public class HomeWork008 {



    public static void main(String[] args) {

// Первое задание
//1. Загадать случайно 100 целых чисел в диапазоне от -100 до 100. Вычислить процент положительных чисел, процент отрицательных чисел и процент нулей. Вычислить процент чётных чисел и процент нечётных.
        System.out.println("\nПервое задание");
        Scanner scanner = new Scanner(System.in);
/*
        Random random = new Random();
        byte countNegativeNumber = 0;
        byte countPositiveNumber = 0;
        byte countZeroNumber = 0;
        byte countAllNumber = 0;

        for (byte iVar = 0; iVar < 100; iVar++) {
            byte rendNumber = (byte) (random.nextInt(200) - 100);
            System.out.print(rendNumber + ", ");
            if (rendNumber < 0) {
                countNegativeNumber++;
            } else if (rendNumber > 0) {
                countPositiveNumber++;
            }else if (rendNumber == 0){
                countZeroNumber++;
            }
            countAllNumber++;
        }

        byte percentNegativeNumber = (byte) (countAllNumber / 100 * countNegativeNumber);
        byte percentPositiveNumber = (byte) (countAllNumber / 100 * countPositiveNumber);
        byte percentZeroNumber = (byte) (countAllNumber / 100 * countZeroNumber);

        System.out.println("\nAll numbers quantity: " + countAllNumber);
        System.out.println("Negative numbers quantity: " + countNegativeNumber);
        System.out.println("Positive numbers quantity: " + countPositiveNumber);
        System.out.println("Zero numbers quantity: " + countZeroNumber);

        System.out.println("\nPercent all numbers quantity: " + countAllNumber);
        System.out.println("Percent negative numbers quantity: " + percentNegativeNumber);
        System.out.println("Percent positive numbers quantity: " + percentPositiveNumber);
        System.out.println("Percent zero numbers quantity: " + percentZeroNumber);

//Второе задание
//2. Вывести на экран таблицу умножения (таблицу Пифагора).
        System.out.println("\nВторое задание");
        byte iPif;
        byte iPif0;
        for (iPif = 1; iPif < 11; iPif++) {
            for (iPif0 = 1; iPif0 < 11; iPif0++) {
                byte iPifTemp = (byte) (iPif * iPif0);
                System.out.println(iPif + " * " + iPif0 + " = " + iPifTemp);
                if (iPif0 == 10) {
                    System.out.println("..............");
                }
            }
        }

//Третье задание
//3. Ежемесячная стипендия студента составляет N гривен, а расходы на проживание превышают стипендию и составляют M гривен в месяц. Рост цен ежемесячно увеличивает расходы на 3%. Составьте программу расчёта суммы денег, которую необходимо единовременно попросить у родителей, чтобы можно было прожить учебный год (10 месяцев), используя только эти деньги и стипендию.
        System.out.println("\nТретье задание");
        System.out.println("Enter grants sum (month): ");
        short grantsSum = scanner.nextShort();
        while (grantsSum <= 0 || grantsSum >= 2150) {
            System.out.println("Grants sum should be bigger then 0, but less then 2150. Enter again:  ");
            grantsSum = scanner.nextShort();
        }
        System.out.println("Enter expenses sum (month): ");
        int expensesSum = scanner.nextShort();
        while (expensesSum <= grantsSum || expensesSum > 3100) {
            System.out.println("Expenses Sum should be more then grant sum, but less then 3100. Enter again: ");
            expensesSum = scanner.nextShort();
        }
        short iExcessExpensesSum;
        int totalExpensesSum = expensesSum;
        for (iExcessExpensesSum = 0; iExcessExpensesSum < 10; iExcessExpensesSum++) {
            expensesSum += + (expensesSum / 100 * 3);
            totalExpensesSum += expensesSum;
        }
        System.out.println("Total expenses sum for 10 monts: " + totalExpensesSum + ".");
        short totalGrantsSum = (short) (grantsSum * 10);
        System.out.println("Total grants sum for 10 monts: " + totalGrantsSum + ".");
        int lacksSum = totalExpensesSum - totalGrantsSum;
        System.out.println("Still need: " + lacksSum + ".");

//Четвертое задание
//4. Показать на экране равнобедренный треугольник (пользователь вводит высоту). Затем сделать то же самое, но чтоб фигура внутри была пустая (остаётся только контур).
        System.out.println("\nЧетвертое задание");
        System.out.println("Specify the height of an isosceles rectangle: ");
        int rectangleHeight = scanner.nextInt();
        while (rectangleHeight <= 0) {
            System.out.println("Height of an isosceles rectangle should be more then 0: ");
            rectangleHeight = scanner.nextInt();
        }
        int rectangleHeightCount = 0;
        while (rectangleHeight != 0) {
            if (rectangleHeight % 2 > 0) {
                for (int iRectangleHeight = rectangleHeight; iRectangleHeight > 0; iRectangleHeight--) {
                    System.out.print("*");
                }
                System.out.print("\n");
                rectangleHeightCount++;
                for (int bRectangleHeight = rectangleHeightCount; bRectangleHeight > 0; bRectangleHeight--) {
                    System.out.print(" ");
                }
            }
            rectangleHeight--;
        }

//Пятое задание
//5. Написать программу, которая выводят на экран ромб (длины диагоналей ромба одинаковы по значению, но могут быть равны любому числу). Затем сделать то же самое, но чтоб фигура внутри была пустая (остаётся только контур).
        System.out.println("\nПятое задание");
        int emptySpace = 25;
        int iRombe = 1;

        while (iRombe < 50) {
            if (iRombe % 2 > 0) {
                for (int iemptySpace = emptySpace; iemptySpace > 0; iemptySpace--) {
                    System.out.print(" ");
                }
                emptySpace--;

                for (int iRombeFor = 0; iRombeFor < iRombe; iRombeFor++) {

                        System.out.print("*");
                }
                System.out.print("\n");

            }

            iRombe++;
        }

        emptySpace = 2;
        iRombe = 48;

        while (iRombe > 0) {
            if (iRombe % 2 > 0) {
                for (int iemptySpace = emptySpace; iemptySpace > 0; iemptySpace--) {
                    System.out.print(" ");
                }
                emptySpace++;

                for (int iRombeFor = iRombe; iRombeFor > 0; iRombeFor--) {
                    System.out.print("*");
                }
                System.out.print("\n");

            }

            iRombe--;
        }



        emptySpace = 25;
        iRombe = 1;

        while (iRombe < 50) {
            if (iRombe % 2 > 0) {
                for (int iemptySpace = emptySpace; iemptySpace > 0; iemptySpace--) {
                    System.out.print(" ");
                }
                emptySpace--;

                for (int iRombeFor = 0; iRombeFor < iRombe; iRombeFor++) {
                    if (iRombeFor == 0 || iRombeFor == (iRombe - 1)) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.print("\n");

            }

            iRombe++;
        }

        emptySpace = 2;
        iRombe = 48;

        while (iRombe > 0) {
            if (iRombe % 2 > 0) {
                for (int iemptySpace = emptySpace; iemptySpace > 0; iemptySpace--) {
                    System.out.print(" ");
                }
                emptySpace++;

                for (int iRombeFor = iRombe; iRombeFor > 0; iRombeFor--) {

                    if (iRombeFor == iRombe || iRombeFor == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("\n");

            }

            iRombe--;
        }

//Шестое задание
//6. Определить, является ли введённое число любой разрядности палиндромом (например, 1234321 – палиндром, 12345 – не палиндром).
        System.out.println("\nШестое задание");
        System.out.println("Enter eny number who consist more than two digits: ");
        int enyNumberMore2Dig = scanner.nextInt();
        while (enyNumberMore2Dig <= 10) {
            System.out.println("Number who consist more than two digits should be more then 10: ");
            enyNumberMore2Dig = scanner.nextInt();
        }
        int numberDigsEnyNumberMore2Dig = (int) Math.ceil(Math.log10(enyNumberMore2Dig));


//Седьмое задание
//7. Осуществить циклический сдвиг влево введённого числа на N разрядов (например, при сдвиге числа 12345 влево на 3 разряда получится число 45123).
        System.out.println("\nСедьмое задание");
        System.out.println("Enter eny number who consist more than two digits: ");
        int eNumM2Dig = scanner.nextInt();
        while (eNumM2Dig <= 9) {
            System.out.println("Number who consist more than two digits should be more then 9: ");
            eNumM2Dig = scanner.nextInt();
        }
        int numberDigseNumM2Dig = (int) Math.ceil(Math.log10(eNumM2Dig));

        System.out.println("Enter the number of digits by which you want to shift the number: ");
        int eNumM2DigShift = scanner.nextInt();
        while (eNumM2DigShift >= numberDigseNumM2Dig) {
            System.out.println("The number of digits by which you want to shift the number cannot be greater than or equal to the number of digits of this number. \nEnter the number of digits by which you want to shift the number:");
            eNumM2DigShift = scanner.nextInt();
        }
//Вариант с права на лево по одному
// int eNumM2DigShiftCount = eNumM2DigShift;
//        int eNumM2DigLastDig;
//        while (eNumM2DigShiftCount > 0) {
//            eNumM2DigLastDig = eNumM2Dig % 10;
//            eNumM2Dig/=10;
//            System.out.print(eNumM2DigLastDig);
//
//            eNumM2DigShiftCount--;
//        }
//        System.out.print(eNumM2Dig);

        int eNumM2DigLeft = (int) (eNumM2Dig / Math.pow(10, numberDigseNumM2Dig - eNumM2DigShift));
        int eNumM2DigRight = (int) (eNumM2Dig % Math.pow(10, numberDigseNumM2Dig - eNumM2DigShift));
        System.out.print(eNumM2DigRight);
        System.out.print(eNumM2DigLeft);


*/
//Восьмое задание
//8. Вывести на экран каркас параллелепипеда размерностью AxBxC.
        System.out.println("\nВосьмое задание");


/*
//Девятое задание
//9. Написать программу, которая выводит на экран все простые числа в диапазоне от 2 до 10.000.000.
        System.out.println("\nДевятое задание");
        int iSimply = 2;
        int iSimplyQantytyCount = 0;
        while (iSimply != 10000000) {
            int iSimplyCount = 0;
            for (int i = 1; i <= iSimply; i++) {
                if (iSimply % i == 0) {
                iSimplyCount++;
                }

            }
        if (iSimplyCount == 2) {
                System.out.print(iSimply + ", ");
                iSimplyQantytyCount++;
            }
            iSimply++;
        }

//Десятое задание
//10. Показать на экране все числа Армстронга в диапазоне от 0 до 10.000.000.
        System.out.println("\nДесятое задание");
        int iPerfect = 0;

        while (iPerfect < 10000000) {
            int iPerfectLastDig = 0;
            int iPerfectDigSum = 0;
            int iPerfectDigCount = 0;
            int iPerfectTemp = iPerfect;

            while (iPerfectTemp !=0) {
                iPerfectLastDig = iPerfectTemp % 10;
                iPerfectDigSum += iPerfectLastDig;
                iPerfectTemp /= 10;
                iPerfectDigCount++;
            }

        if (iPerfect == Math.pow(iPerfectDigSum, iPerfectDigCount))
            System.out.println(iPerfect);

            iPerfect++;
        }

//Одинадцатое задание
//11. Показать на экране все совершенные числа в диапазоне от 0 до 10.000.000.
        System.out.println("\nОдинадцатое задание");
//        int iPerfectA = 0;
//        while (iPerfectA < 10000000) {
//
//            int iPerfectADivSum = 0;
//            int iPerfectADiv = 0;
//            int iPerfectATemp = (iPerfectA - 1);
//
//            while (iPerfectATemp != 0) {
//
//                if (iPerfectA % iPerfectATemp == 0) {
//                iPerfectADiv = iPerfectA / iPerfectATemp;
//                iPerfectADivSum += iPerfectADiv;
//                }
//
//             iPerfectATemp--;
//            }
//
//            if (iPerfectADivSum == iPerfectA) {
//             System.out.println(iPerfectA);
//            }
//
//            iPerfectA++;
//        }

//Двенадцатое задание
//12. Показать на экране все числа Фибоначчи в диапазоне от 0 до 10.000.000.
        System.out.println("\nДвенадцатое задание");
        int iFibo1 = 1;
        int iFibo2 = 1;
        System.out.println(iFibo2);
        int countIfibo = 0;
        for (int iFibo = 1; iFibo < 10000000; iFibo = iFibo1 + iFibo2) {
            System.out.println(iFibo);
            iFibo1 = iFibo2;
            iFibo2 = iFibo;
            countIfibo++;
        }
        System.out.println("Total Fibonacci number in this diapason: " + countIfibo + ".");

//Тринадцатое задание
//13. Написать программу, которая генерирует календарь на любой год, указанный с клавиатуры.
        System.out.println("\nТринадцатое задание");


//Четырнадцатое задание
//14. Вывести лестницу из отрезков определённой длины. Длина (например, 14) и количество ступенек (например, 4) указывается с клавиатуры.
        System.out.println("\nЧетырнадцатое задание");

//Пятнадцатое задание
//15. Показать на экране лесенку. Количество ступенек (например, 5) указывает пользователь.
        System.out.println("\nПятнадцатое задание");


//Шестнадцатое задание
//16. Пользователь указывает с клавиатуры нечётное число. Рисуется фигура с заданной стороной:
        System.out.println("\nШестнадцатое задание");


//Семнадцатое задание
//17. арисовать двойным циклом for - домик, с крышей, окном и трубой. Высота домика указывается с клавиатуры.
        System.out.println("\nСемнадцатое задание");



//Восемнадцатое задание
//18. Скоро ведь Новый год! Необходимо срочно нарисовать ёлочку. С клавиатуры вводится количество ярусов, и высота каждого яруса ёлочки. Например, на картинке 4 яруса, высота каждого яруса – 5 символов.
        System.out.println("\nВосемнадцатое задание");



//Девятнадцатое задание
//19. Пользователь вводит дату (по отдельности день, месяц, год). Определить день недели, соответствующий введенной дате. При написании программы следует исходить из того, что 01.01.01 – это понедельник.
        System.out.println("\nДевятнадцатое задание");


//Двадцатое задание
//20. В американской армии считается несчастливым число 13, а в китайской — 4. Перед совместными  учениями с американской и китайской армией,  штаб украинской армии решил исключить номера боевой техники, содержащие числа 4 или 13 (например, 40123, 13373, 12345 или 61342), чтобы не смущать иностранных коллег. Написать программу, которая определит, сколько номеров придется исключить, если в распоряжении армии имеется 100 тыс. единиц боевой техники и каждая боевая машина имеет номер от 00001 до 99999. Дополнительно вывести на экран все номера, которые необходимо исключить.
        System.out.println("\nДвадцатое задание");


//Двадцать первое задание
//21. Напишите программу, которая будет считывать с консоли любое число (от 0 до 99999999) и выводить его в таком виде (см.  рисунок ниже):
//Дополнительно: сделайте так, чтобы "большая цифра" состояла не из звёздочек, а из соответствующих маленьких (обычных) цифр.
        System.out.println("\nДвадцатое задание");

*/
    }



}


