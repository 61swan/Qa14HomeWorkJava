package Qa14HomeWork_004;

import java.math.BigDecimal;
import java.util.Scanner;

public class HomeWork004 {

    public static void main(String[] args) {
// Первое задание
//1. Ввести с клавиатуры два 3-значных числа и поменять у них средние цифры (например, ввести 357  и 702 – получить и вывести числа  307 и 752).
        System.out.println("\nПервое задание");
        System.out.println("Введите первое положительное трехзначное целое число (состоящее из трех цифр): ");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n1DigitsQantyty = (int) Math.ceil(Math.log10(n1)); // Определение колличество знаков из которых состоит число
        while (n1 <= 0) { //Проверка на то что введенное число не является отрицатьельным или нулем
            System.out.println("Введенное число не может быть отрицательным или нулем.\nВведите первое положительное трехзначное целое число (состоящее из трех цифр): ");
            n1 = scanner.nextInt();
        }
        while (n1DigitsQantyty != 3) { //Проверка на то что число составляет 3 знака
            System.out.println("Число не может состоять меньше или больше чем из трех знаков.\nВведите первое положительное трехзначное целое число (состоящее из трех цифр): ");
            n1 = scanner.nextInt();
            n1DigitsQantyty = (int) Math.ceil(Math.log10(n1));
        }
        System.out.println("Введите второе положительное трехзначное целое число (состоящее из трех цифр): ");
        int n2 = scanner.nextInt();
        int n2DigitsQantyty = (int) Math.ceil(Math.log10(n2));
        while (n2 <= 0) {
            System.out.println("Введенное число не может быть отрицательным и нулем.\nВведите второе положительное трехзначное целое число (состоящее из трех цифр): ");
            n2 = scanner.nextInt();
        }
        while (n2DigitsQantyty != 3) {
            System.out.println("Число не может состоять меньше или больше чем из трех знаков.\nВведите второе положительное трехзначное целое число (состоящее из трех цифр): ");
            n2 = scanner.nextInt();
            n2DigitsQantyty = (int) Math.ceil(Math.log10(n2));
        }
        int n1dig1 = n1 / 100; // Сокращаем число до первого знака делением на стою
        int n2dig1 = n2 / 100;
        int n1dig2 = n1 /10 % 10; // Сокращаем число до двух знаков и делением по модулю на 10 получаем второй знак
        int n2dig2 = n2 / 10 % 10;
        int n1dig3 = n1 % 10; // Получаем третье число делением на 10 по модулю
        int n2dig3 = n2 % 10;
        System.out.println("Первое число с измененным вторым знаком: " + n1dig1 + n2dig2 + n1dig3 + "\nВторое число с измененны вторым знаком: " + n2dig1 + n1dig2 + n2dig3 + "(реализовано методом канкатеннации строк)");
        n1 = n1dig1 * 100 + n2dig2 * 10 + n1dig3;
        n2 = n2dig1 * 100 + n1dig2 * 10 + n2dig3;
        System.out.println("Первое число с измененным вторым знаком: " + n1 + "\nВторое число с измененны вторым знаком: " + n2);

//Второе задание
//2. Ввести 4-значное число и подсчитать сумму первой и третьей цифры и разность второй и четвертой цифры.
        System.out.println("");
        System.out.println("\nВторое задание");
        System.out.println("Введите положительное четырехзначное целое число (состоящее из четырех цифр): ");
        int n4digits = scanner.nextInt();
        int n4digitsDigitsQantyty = (int) Math.ceil(Math.log10(n4digits)); // Определение колличества знаков из которых состоит число
        while (n4digits <= 0 || n4digitsDigitsQantyty != 4) {
            if (n4digits <= 0) {
                //Проверка на то что введенное число не является отрицатьельным или нулем
                System.out.println("Введенное число не может быть отрицательным или нулем.\nВведите положительное четырехзначное целое число (состоящее из четырех цифр): ");
                n4digits = scanner.nextInt();
            }
            if (n4digitsDigitsQantyty != 4) { //Проверка на то что число составляет 4 знака
                System.out.println("Число не может состоять меньше или больше чем из четырех знаков.\nВведите положительное четырехзначное целое число (состоящее из четырех цифр): ");
                n4digits = scanner.nextInt();
                n4digitsDigitsQantyty = (int) Math.ceil(Math.log10(n4digits));
            }
        }
        int n4digitsDig1 = n4digits / 1000; // Сокращаем число до первого знака делением на 1000
        int n4digitsDig2 = n4digits /100 % 10; // Сокращаем число до двух знаков и делением по модулю на 10 получаем второй знак
        int n4digitsDig3 = n4digits / 10 % 10; // Сокращаем число до трех знаков с последующим деление по модулю на 10 по модулю
        int n4digitsDig4 = n4digits % 10;
        int sum1And3 = n4digitsDig1 + n4digitsDig3;
        int sub2And4 = n4digitsDig2 - n4digitsDig4;
        System.out.println("Сумма первой и третьей цифры введенного числа: " + sum1And3 + "\nРазница второй и четвертой цифры введенного числа: " + sub2And4);

//Третье задание
//3. Ввести с клавиатуры 3-значное число и удалить из него среднюю цифру (например, ввести 3, 5, 7 – получить и вывести число 37).
        System.out.println("");
        System.out.println("\nТретье задание первый вариант");
        System.out.println("Введите положительное трехзначное целое число (состоящее из трех цифр): ");
        int n3digits = scanner.nextInt();
        int n3digitsDigitsQantyty = (int) Math.ceil(Math.log10(n3digits)); // Определение колличества знаков из которых состоит число
        while (n3digits <= 0 || n3digitsDigitsQantyty != 3) {
            if (n3digits <= 0) {
                //Проверка на то что введенное число не является отрицатьельным или нулем
                System.out.println("Введенное число не может быть отрицательным или нулем.\nВведите положительное трехзначное целое число (состоящее из трех цифр): ");
                n3digits = scanner.nextInt();
            }
            if (n3digitsDigitsQantyty != 4) { //Проверка на то что число составляет 4 знака
                System.out.println("Число не может состоять меньше или больше чем из трех знаков.\nВведите положительное трехзначное целое число (состоящее из трех цифр): ");
                n3digits = scanner.nextInt();
                n3digitsDigitsQantyty = (int) Math.ceil(Math.log10(n3digits));
            }
        }
        int n3digitsdig1 = n3digits / 100; // Сокращаем число до первого знака делением на стою
        int n3digitsdig2 = n3digits /10 % 10; // Сокращаем число до двух знаков и делением по модулю на 10 получаем второй знак
        int n3digitsdig3 = n3digits % 10; // Получаем третий знак делением на 10 по модулю
        System.out.println("Введенное число без удаленного второго (среднего) знака: " + n3digitsdig1 + n3digitsdig3 + " (реализовано методом канкатеннации строк)");
        n3digits = n3digitsdig1 * 10 + n3digitsdig3;
        System.out.println("Введенное число без удаленного второго (среднего) знака: " + n3digits);

        System.out.println("\nТретье задание второй вариант"); // Возникает баг: при введении числа 1.
        System.out.println("Введите первое положительное однозначное целое число (состоящее из одной цифры): ");
        int n3digitsV2D1 = scanner.nextInt();
        int n3digitsV2D1Qantyty = (int) Math.ceil(Math.log10(n3digitsV2D1)); // Определение колличества знаков из которых состоит число
        while (n3digitsV2D1 <= 0 || n3digitsV2D1Qantyty != 1) {
            if (n3digitsV2D1 <= 0) {
                //Проверка на то что введенное число не является отрицатьельным или нулем
                System.out.println("Введенное число не может быть отрицательным или нулем.\nВведите положительное однозначное целое число (состоящее из одной цифры): ");
                n3digitsV2D1 = scanner.nextInt();
            }
            if (n3digitsV2D1Qantyty != 1) { //Проверка на то что число составляет 1 знака
                System.out.println("Число не может состоять меньше или больше чем из одного знака.\nВведите положительное однозначное целое число (состоящее из одной цифры): ");
                n3digitsV2D1 = scanner.nextInt();
                n3digitsV2D1Qantyty = (int) Math.ceil(Math.log10(n3digitsV2D1));
            }
        }
        System.out.println("Введите второе положительное однозначное целое число (состоящее из одной цифры): ");
        int n3digitsV2D2 = scanner.nextInt();
        int n3digitsV2D2Qantyty = (int) Math.ceil(Math.log10(n3digitsV2D2)); // Определение колличества знаков из которых состоит число
        while (n3digitsV2D2 <= 0 || n3digitsV2D2Qantyty != 1) {
            if (n3digitsV2D2 <= 0) {
                //Проверка на то что введенное число не является отрицатьельным или нулем
                System.out.println("Введенное число не может быть отрицательным или нулем.\nВведите положительное однозначное целое число (состоящее из одной цифры): ");
                n3digitsV2D2 = scanner.nextInt();
            }
            if (n3digitsV2D2Qantyty != 1) { //Проверка на то что число составляет 1 знака
                System.out.println("Число не может состоять меньше или больше чем из одного знака.\nВведите положительное однозначное целое число (состоящее из одной цифры): ");
                n3digitsV2D2 = scanner.nextInt();
                n3digitsV2D2Qantyty = (int) Math.ceil(Math.log10(n3digitsV2D2));
            }
        }
        System.out.println("Введите третье положительное однозначное целое число (состоящее из одной цифры): ");
        int n3digitsV2D3 = scanner.nextInt();
        int n3digitsV2D3Qantyty = (int) Math.ceil(Math.log10(n3digitsV2D3)); // Определение колличества знаков из которых состоит число
        while (n3digitsV2D3 <= 0 || n3digitsV2D3Qantyty != 1) {
            if (n3digitsV2D3 <= 0) {
                //Проверка на то что введенное число не является отрицатьельным или нулем
                System.out.println("Введенное число не может быть отрицательным или нулем.\nВведите положительное однозначное целое число (состоящее из одной цифры): ");
                n3digitsV2D3 = scanner.nextInt();
            }
            if (n3digitsV2D3Qantyty != 1) { //Проверка на то что число составляет 1 знака
                System.out.println("Число не может состоять меньше или больше чем из четырех знаков.\nВведите положительное однозначное целое число (состоящее из одной цифры): ");
                n3digitsV2D3 = scanner.nextInt();
                n3digitsV2D3Qantyty = (int) Math.ceil(Math.log10(n3digitsV2D3));
            }
        }
        System.out.println("Введенное число без удаленного второго (среднего) знака: " + n3digitsV2D1 + n3digitsV2D3 + " (реализовано методом канкатеннации строк)");
        System.out.println("Введенное число без удаленного второго (среднего) знака: " + (n3digitsV2D1 * 10 + n3digitsV2D3));

//Четвертое задание
//4. Написать программу, которая предлагает пользователю ввести сумму денежного вклада в гривнах, а также процент годовых, которые выплачивает банк. Определить сумму денег, выплачиваемых банком вкладчику каждый месяц.
        System.out.println("");
        System.out.println("\nЧетвертое задание");
        System.out.println("Введите сумму вклада: ");
        double deposit = scanner.nextDouble();
        while (deposit <= 0) {//Проверка на то что введенное число не является отрицатьельным или нулем
            System.out.println("Сумма вклада не может быть отрицательным числом или нулем.\nВведите сумму вклада: ");
            deposit = scanner.nextDouble();
            }
        System.out.println("Введите процентную ставку (% годовых): ");
        double percent = scanner.nextDouble();
        while (percent <= 0) {//Проверка на то что введенное число не является отрицатьельным или нулем
            System.out.println("Процентная ставка не может быть отрицательным числом или нулем.\nВведите процентную ставку (% годовых): ");
            percent = scanner.nextDouble();
        }
        double percentForMonts = percent / 12;
        double peyForMonts = deposit / 100 * percentForMonts;
        System.out.println("К выплате ежемесячно при вкладе " + deposit + " и " + percent + " процентах годовых подлежит: " + peyForMonts);

//Пятое задание
//5. Сколько товара ценой Y можно купить на Х гривен и сколько получить сдачи?
        System.out.println("");
        System.out.println("\nПятое задание");
        System.out.println("Введите стоимость единицы товара: ");
        double goodPrice = scanner.nextDouble();
        while (goodPrice <= 0) {//Проверка на то что введенное число не является отрицатьельным или нулем
            System.out.println("Cтоимость единицы товара не может быть отрицательным числом или нулем.\nВведите стоимость единицы товара: ");
            goodPrice = scanner.nextDouble();
        }
        System.out.println("Введите имеющуюся сумму денег: ");
        double totalSum = scanner.nextDouble();
        while (totalSum <= 0) {//Проверка на то что введенное число не является отрицатьельным или нулем
            System.out.println("Имеющаяся сумма денег не может быть отрицательным числом или нулем.\nВведите имеющуюся сумму денег: ");
            totalSum = scanner.nextDouble();
        }
        int totalGoodQantyty = (int) (totalSum / goodPrice);
        double sdacha =  totalSum % goodPrice;
        System.out.println("Общее колличество товаров, которые можно купить на указанную сумму составляет:" + totalGoodQantyty);
        System.out.println("Сдача составляет: " + sdacha);

//Шестое задание
//6. Написать программу, которая переводит фунты в килограммы. Один фунт – 405.9 грамма задается в программе как константа. Затем, реализовать обратный перевод – из килограммов в фунты.
        System.out.println("");
        System.out.println("\nШестое задание");
        System.out.println("Введите вес в фунтах: ");
        double wigchInPounds = scanner.nextDouble();
        while (wigchInPounds <= 0) {//Проверка на то что введенное число не является отрицатьельным или нулем
            System.out.println("Вес не может быть отрицательным числом или нулем.\nВведите вес в фунтах: ");
            wigchInPounds = scanner.nextDouble();
        }
        double PundPerGrm = 405.9;
        double wigchInKg = wigchInPounds * (PundPerGrm / 1000);
        System.out.println("Вес в киллограмах составляет: " + wigchInKg);

        System.out.println("Введите вес в киллограмах: ");
        double wigchInKg2 = scanner.nextDouble();
        while (wigchInKg2 <= 0) {//Проверка на то что введенное число не является отрицатьельным или нулем
            System.out.println("Вес не может быть отрицательным числом или нулем.\nВведите вес в киллограмах: ");
            wigchInKg2 = scanner.nextDouble();
        }
        double wigchInPounds2 = wigchInKg2 / (PundPerGrm / 1000);
        System.out.println("Вес в Фунтах составляет: " + wigchInPounds2);

//Седьмое задание
//7. Ввести длину, ширину и высоту комнаты. Подсчитать, сколько краски уйдет на покраску стен этой комнаты, если на 1м2 стены приходится N литров краски и M% поверхности стен занимают окна и двери. Также, рассчитать общую стоимость краски, с учётом того, что один литр краски стоит R гривен.
        System.out.println("");
        System.out.println("\nСедьмое задание");
        System.out.println("Введите длину комнаты: ");
        double roomL = scanner.nextDouble();
        while (roomL <= 0) {//Проверка на то что введенное число не является отрицатьельным или нулем
            System.out.println("Длина не может быть отрицательным числом или нулем.\nВведите длину комнаты: ");
            roomL = scanner.nextDouble();
        }
        System.out.println("Введите ширину комнаты: ");
        double roomW = scanner.nextDouble();
        while (roomW <= 0) {//Проверка на то что введенное число не является отрицатьельным или нулем
            System.out.println("Ширина не может быть отрицательным числом или нулем.\nВведите ширину комнаты: ");
            roomW = scanner.nextDouble();
        }
        System.out.println("Введите высоту комнаты: ");
        double roomH = scanner.nextDouble();
        while (roomH <= 0) {//Проверка на то что введенное число не является отрицатьельным или нулем
            System.out.println("Высота не может быть отрицательным числом или нулем.\nВведите высоту комнаты: ");
            roomH = scanner.nextDouble();
        }
        double roomS = ((roomL + roomW) * 2) * roomH; //Вычисляем площадь комнаты без учета стен
        System.out.println("Введите сколько процентов составляет площадь дверей и окон: ");
        double doorsAndWindowsSPercent = scanner.nextDouble();
        while (doorsAndWindowsSPercent <= 0 ||  doorsAndWindowsSPercent >= 100) {
            if (doorsAndWindowsSPercent <= 0) {//Проверка на то что введенное число не является отрицатьельным или нулем
                System.out.println("Процент площади окон и дверей не может быть отрицательным числом или нулем.\nВведите процент площади окон и дверей: ");
                doorsAndWindowsSPercent = scanner.nextDouble();
            }
            if (doorsAndWindowsSPercent >= 100) {//Проверка на то что введенное число меньше 100
                System.out.println("Процент площади окон и дверей не может быть равен или больше 100%.\nВведите процент площади окон и дверей: ");
                doorsAndWindowsSPercent = scanner.nextDouble();
            }
        }
        double doorsAndWindowsS = roomS / 100 * doorsAndWindowsSPercent;
        double roomSforPainting = roomS - doorsAndWindowsS;
        System.out.println("Введите расход краски в литрах на один метр квадратный: ");
        double literPerMeter = scanner.nextDouble();
        while (literPerMeter <= 0) {//Проверка на то что введенное число не является отрицатьельным или нулем
            System.out.println("Расход краски не может быть отрицательным числом или нулем.\nВведите расход краски в литрах на один метр квадратный: ");
            literPerMeter = scanner.nextDouble();
        }
        double paintQantity = literPerMeter * roomSforPainting;
        System.out.println("Введите стоимость краски в гривнах за один литр: ");
        double paintPraiceForLiter = scanner.nextDouble();
        while (paintPraiceForLiter <= 0) {//Проверка на то что введенное число не является отрицатьельным или нулем
            System.out.println("Стоимость краски не может быть отрицательным числом или нулем.\nВведите стоимость краски в гривнах за один литр: ");
            paintPraiceForLiter = scanner.nextDouble();
        }
        double paintTotalPrice = paintQantity * paintPraiceForLiter;
        System.out.println("На покраску комнаты уйдет: " + paintQantity + "литров краски.");
        System.out.println("Стоимость покраски комнаты составляет: " + paintTotalPrice + "гривен.");

//Восьмое задание
//8. Ввести с клавиатуры 3-значное число и «перевернуть» его (например, ввести 357 – получить и вывести 753).
        System.out.println("");
        System.out.println("\nВосьмое задание");
        System.out.println("Введите положительное трехзначное целое число (состоящее из трех цифр): ");
        int nn1 = scanner.nextInt();
        int nn1DigitsQantyty = (int) Math.ceil(Math.log10(nn1)); // Определение колличество знаков из которых состоит число
        while (nn1 <= 0 || nn1DigitsQantyty != 3) {

            if (nn1 <= 0) {//Проверка на то что введенное число не является отрицатьельным или нулем
                System.out.println("Введенное число не может быть отрицательным или нулем.\nВведите положительное трехзначное целое число (состоящее из трех цифр): ");
                nn1 = scanner.nextInt();
            }
            if (nn1DigitsQantyty != 3) { //Проверка на то что число составляет 3 знака
                System.out.println("Число не может состоять меньше или больше чем из трех знаков.\nВведите положительное трехзначное целое число (состоящее из трех цифр): ");
                nn1 = scanner.nextInt();
                nn1DigitsQantyty = (int) Math.ceil(Math.log10(nn1));
            }
        }
        int nn1dig1 = nn1 / 100; // Сокращаем число до первого знака делением на стою
        int nn1dig2 = nn1 /10 % 10; // Сокращаем число до двух знаков и делением по модулю на 10 получаем второй знак
        int nn1dig3 = nn1 % 10; // Получаем третье число делением на 10 по модулю
        System.out.println("Введенное число с зеркально измененным порядком цифр: " + nn1dig3 + nn1dig2 + nn1dig1 + " (Реализовано методом канкатенации строк).");
        nn1 = nn1dig3 * 100 + nn1dig2 * 10 + nn1dig1;
        System.out.println("Введенное число с зеркально измененным порядком цифр: " + nn1);

//Девятое задание
//9. Ввести пятизначное число и сдвинуть его циклически вправо на 2 разряда (например, если число равно 12345 – вывести на экран 45123).
        System.out.println("");
        System.out.println("\nДевятое задание");
        System.out.println("Введите положительное пятизначно целое число (состоящее из пяти цифр): ");

        int n5Dig = scanner.nextInt(); //Баг при вводе единицы
//        int n5DigDigitsQantyty = (int) Math.ceil(Math.log10(n5Dig)); // Определение колличество знаков из которых состоит число
//        while (n5Dig <= 0 || n5Dig != 3) {
//
//            if (n5Dig <= 0) {//Проверка на то что введенное число не является отрицатьельным или нулем
//                System.out.println("Введенное число не может быть отрицательным или нулем.\nВведите положительное пятизначное целое число (состоящее из пяти цифр): ");
//                n5Dig = scanner.nextInt();
//            }
//            if (n5Dig != 3) { //Проверка на то что число составляет 3 знака
//                System.out.println("Число не может состоять меньше или больше чем из пяти знаков.\nВведите положительное пятизначное целое число (состоящее из пяти цифр): ");
//                n5Dig = scanner.nextInt();
//                n5Dig = (int) Math.ceil(Math.log10(n5Dig));
//            }
//        }
        int n5Digdig1 = n5Dig / 10000; // Сокращаем число до первого знака делением
        int n5Digdig2 = n5Dig / 1000 % 10;
        int n5Digdig3 = n5Dig / 100 % 10;
        int n5Dig1dig4 = n5Dig /10 % 10; // Сокращаем число до двух знаков и делением по модулю на 10 получаем второй знак
        int n5Dig1dig5 = n5Dig % 10; // Получаем третье число делением на 10 по модулю
        System.out.println("Введенное число с измененным порядком цифр: " + n5Dig1dig4 + n5Dig1dig5 + n5Digdig1 + n5Digdig2 + n5Digdig3 + " (Реализовано методом канкатенации строк).");
        n5Dig = n5Dig1dig4 * 10000 + n5Dig1dig5 * 1000 + n5Digdig1 * 100 + n5Digdig2 *10 + n5Digdig3;
        System.out.println("Введенное число с зеркально измененным порядком цифр: " + n5Dig);

//Десятое задание
//10. Рассчитать общую массу всех планет Солнечной системы. Вычислить среднее арифметическое масс планет. Затем - массу каждой планеты в процентном соотношении, если принять за 100% общую массу всех планет. Во сколько раз масса самой крупной планеты больше чем сумма масс всех остальных планет? Все результаты – показать на экране. Рекомендуется использование типа BigDecimal.
        System.out.println("");
        System.out.println("\nДесятое задание");
        double venus = 4.81068E+24;
        double earch = 5.97600E+24;
        double mars = 0.63345E+24;
        double mercury = 0.32868E+24;
        double neptun = 101.59200E+24;
        // Больше не планета - планетоид double pluton = 0.01195E+24;
        double saturn = 561.80376E+24;
        double uran = 86.05440E+24;
        double jupiter = 1876.64328E+24;
        double massaAllPlanetets = venus + earch + mars + mercury + neptun + saturn + uran + jupiter;
        System.out.println("Масса всех планет солнечной системы: " + massaAllPlanetets +" киллограмм ");
        double srednee = massaAllPlanetets / 8;
        System.out.println("Средняя арифметическая масса всех планет солнечной системы: " + srednee +" киллограмм ");
        double massaAllPlanetetsOnePerc = massaAllPlanetets / 100;
        double venusPercent = venus / massaAllPlanetetsOnePerc;
        double earchPercent = earch  / massaAllPlanetetsOnePerc;
        double marsPercent = mars  / massaAllPlanetetsOnePerc;
        double mercuryPercent = mercury / massaAllPlanetetsOnePerc;
        double neptunPercent = neptun / massaAllPlanetetsOnePerc;
        double saturnPercent = saturn / massaAllPlanetetsOnePerc;
        double uranPercent = uran / massaAllPlanetetsOnePerc;
        double jupiterPercent = jupiter / massaAllPlanetetsOnePerc;
        System.out.println("Масса Венеры составляет " + venusPercent + " процентов от массы всех планет солнечной системы");
        System.out.println("Масса Земли составляет " + earchPercent + " процентов от массы всех планет солнечной системы");
        System.out.println("Масса Марса составляет " + marsPercent + " процентов от массы всех планет солнечной системы");
        System.out.println("Масса Меркурия составляет " + mercuryPercent + " процентов от массы всех планет солнечной системы");
        System.out.println("Масса Нептуна составляет " + neptunPercent + " процентов от массы всех планет солнечной системы");
        System.out.println("Масса Сатурна составляет " + saturnPercent + " процентов от массы всех планет солнечной системы");
        System.out.println("Масса Урана составляет " + uranPercent + " процентов от массы всех планет солнечной системы");
        System.out.println("Масса Юпитера составляет " + jupiterPercent + " процентов от массы всех планет солнечной системы");
        double jupiterAllPlanetets = jupiter / (venus + earch + mars + mercury + neptun + saturn + uran);
        System.out.println("Масса юпитера в " + jupiterAllPlanetets + " превышает массу остальных планет");

    }
}