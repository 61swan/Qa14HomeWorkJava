package Qa14HomeWork_003;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class HomeWork003 {

    public static void main(String[] args) {
// Первое задание
//Марафонец прошел S километров со скоростью V метров в секунду (расстояние и скорость вводятся с клавиатуры). Определить, сколько времени он был в пути (часов, минут, секунд)?
        System.out.println("\nПервое задание");
        System.out.println("Для определения времени нахождения марафонца в пути введите путь (расстояние) в киллометрах, которое прошел марафонец: ");
        Scanner scanner = new Scanner (System.in);
        double s = Double.parseDouble(scanner.next());
        System.out.println("Для определения времени нахождения марафонца в пути введите скорость в метрах в секунду с которой двигался марафонец: ");
        double v = Double.parseDouble(scanner.next());
        double vKmH = v * 3.6;
        double tH = s / vKmH;
        double tM = tH * 60;
        double tS = tM * 60; // или double tS = t * 3600;
        System.out.println("Пройдя " + s + " киллометров и двигаясь со скоростью " + v + " метров в секунду марафонец был в пути " + tH + " часов или " + tM + " минут или " + tS + " секунд" );
        // Хочу дополнительно реализовать показ времени в формате часы: минуты: секунды
        int tSF = (int) tS % 60;
        int tMF = (int) tS / 60;
        tMF %=60;
        int tHF = (int) tS / 3600;
        tHF %=24;
        int tDF = (int) tS / 86400;
        System.out.println("Показ времени в формате дни, часы: минуты: секунды \n" + "В пути: " + tDF + " дней " + tHF + ":" + tMF + ":" + tSF);

//Второе задание
//Пользователь вводит с клавиатуры два дробных числа.  Вывести на экран сумму целых частей и сумму дробных.
        System.out.println("");
        System.out.println("\nВторое задание");
        System.out.println("Введите дробное число А: ");
        double a = Double.parseDouble(scanner.next());
        System.out.println("Введите дробное число Б: ");
        double b = Double.parseDouble(scanner.next());
        System.out.println("Сумма целых частей А и Б = " + ((int) a + (int) b));
        System.out.println("Сумма дробных частей А и Б = " + ((a%1) + (b%1)));

//Третье задание
//Пользователь вводит с клавиатуры сумму в гривнах (дробное число). Вывести по отдельности количество гривен и количество копеек (например, ввести 45.67 гривен - получить и вывести 45 гривен 67 копеек)
        System.out.println("");
        System.out.println("\nТретье задание");
        System.out.println("Введите сумму в гривнах (дробное число): ");
        float uah = Float.parseFloat(scanner.next());
        System.out.println("Сумма составляет: " + (int) uah + " гривен " + (int) (uah % 1 * 100) + " копеек.");

//Четвертое задание
//Пользователь вводит с клавиатуры массу в тоннах (дробное число). Вывести по отдельности количество тонн, килограмм, грамм (например, ввести 126.456789т - получить и вывести 126т 456кг 789г)
        System.out.println("");
        System.out.println("\nЧетвертое задание");
        System.out.println("Введите вес в тоннах (дробное число): ");
        double weightTn = Double.parseDouble(scanner.next());
        double weightGr = weightTn * 1e+6; // Определяем вес в граммах.
        int weightGrF = (int) weightGr % 1000; // Вычисляем остаток деленения грамм на 1000 грамм.
        double weightKg = weightGr / 1000; // Определяем вес в килограммах.
        int weightKgF = (int) weightKg % 1000; // Вычисляем остаток деленения килограмм на 1000 килограмм.
        int weightTnF = (int) weightTn;
        System.out.println("Вес составляет: " + weightTnF + " тонн " + weightKgF + " килограмм " + weightGrF + " грамм.");

//Пятое задание
//Пользователь вводит с клавиатуры время в секундах. Перевести это значение в дни, часы, минуты и секунды. Например, 43512 секунд – это 12 часов, 5 минут и 12 секунд.
        System.out.println("");
        System.out.println("\nПятое задание");
        System.out.println("Введите время в секундах (можно дробное число): ");
        double timeSecond = Integer.parseInt(scanner.next());
        int timeSecondF = (int) timeSecond % 60;
        double timeMinutes = timeSecond / 60;
        int timeMinutesF = (int) timeMinutes % 60;
        double timeHours = timeSecond / 3600;
        int timeHoursF = (int) timeHours % 60;
        System.out.println("Введенное в секундах время соответсвует: " + timeHoursF + " часов " + timeMinutesF + " минут " + timeSecondF + "секунд.");

//Шестое задание
//Пользователь вводит с клавиатуры расстояние до аэропорта (в километрах, может быть вещественное значение) и время, за которое нужно доехать (в минутах). Вычислить скорость (км/ч), с которой нужно ехать.
        System.out.println("");
        System.out.println("\nШестое задание");
        System.out.println("Введите расстояние до аэропорта в километрах: ");
        double sAirPort = Integer.parseInt(scanner.next());
        System.out.println("Введите время за которое нужно доехать до аэропорта в минутах: ");
        double tAirPortMin = Integer.parseInt(scanner.next());
        double tAirPortHourse = tAirPortMin / 60;
        double vAirPort = sAirPort / tAirPortHourse;
        System.out.println("Скорость (киллометров в час) при расстоянии " + sAirPort + " киллометров до аэропорта и времени в пути " + tAirPortMin + " минут должна составлять " + vAirPort + " киллометров в час.");

//Седьмое задание
//Пользователь вводит с клавиатуры время начала и время завершения телефонного разговора (часы, минуты и секунды). Посчитать стоимость разговора, если стоимость минуты составляет 15 копеек, с учётом посекундной тарификации.
        System.out.println("");
        System.out.println("\nСедьмое задание");
        System.out.println("Введите время начала разговора (часов): ");
        float hhtimeStart = Float.parseFloat(scanner.next());
        while (hhtimeStart < 0 || hhtimeStart > 24 ) {
            System.out.println("Время начала разговора (часов) не может быть отрицательным числом, числом больше 24. Введите время начала разговора (часов): ");
            hhtimeStart = Float.parseFloat(scanner.next());
        }
        System.out.println("Введите время начала разговора (минут): ");
        float mmTimeStart = Float.parseFloat(scanner.next());
        while (mmTimeStart < 0 || mmTimeStart > 60) {
            System.out.println("Время начала разговора (минут) не может быть отрицательным числом, числом больше 60. Введите время начала разговора (минут): ");
            mmTimeStart = Float.parseFloat(scanner.next());
        }
        System.out.println("Введите время начала разговора (секунд): ");
        float ssTimeStart = Float.parseFloat(scanner.next());
        while (ssTimeStart < 0 || ssTimeStart > 60) {
            System.out.println("Время разговора (секунд) не может быть отрицательным числом, больше 60. Введите время начала разговора (секунд): ");
            ssTimeStart = Float.parseFloat(scanner.next());
        }
        System.out.println("Введите время окончания разговора (часов): ");
        float hhtimeEnd = Float.parseFloat(scanner.next());
        while (hhtimeEnd < 0 || hhtimeEnd > 24 || hhtimeEnd < hhtimeStart) {
            System.out.println("Время начала разговора (часов) не может быть отрицательным числом, числом больше 24, больше времение начала разговора. Введите время окончания разговора (часов): ");
            hhtimeEnd = Float.parseFloat(scanner.next());
        }
        System.out.println("Введите время окончания разговора (минут): ");
        float mmtimeEnd = Float.parseFloat(scanner.next());
        while (mmtimeEnd < 0 || mmtimeEnd > 60) {
            System.out.println("Время окончания разговора (минут) не может быть отрицательным числом, числом больше 60, больше времение начала разговора. Введите время окончания разговора (минут): ");
            mmtimeEnd = Float.parseFloat(scanner.next());
        }
        System.out.println("Введите время окончания разговора (секунд): ");
        float sstimeEnd = Float.parseFloat(scanner.next());
        while (sstimeEnd < 0 || sstimeEnd > 60 || sstimeEnd < hhtimeStart) {
            System.out.println("Время окончания разговора (секунд) не может быть отрицательным числом, числом больше 60, больше времение начала разговора. Введите время окончания разговора (секунд): ");
            sstimeEnd = Float.parseFloat(scanner.next());
            }
        float priseForSecond = (float) 0.25; // 60/15
        float hhLongInSS = (hhtimeEnd - hhtimeStart) * 3600;
        float mmLongInSS = (mmtimeEnd - mmTimeStart) * 60;
        float ssLongInSS = sstimeEnd - ssTimeStart;
        float totalLongInSS = hhLongInSS + mmLongInSS + ssLongInSS;
        float totalPriceInKop = totalLongInSS * priseForSecond;
        System.out.println("Стоимость телефонного разговора составляет " + totalPriceInKop + " копеек " + (totalPriceInKop / 100) + " гривен.");

//Восьмое задание
//Пользователь вводит с клавиатуры время в секундах, прошедшее с начала рабочего дня. Посчитать, сколько целых часов ему осталось сидеть на работе, если рабочий день составляет 8 часов.
        System.out.println("");
        System.out.println("\nВосьмое задание");
        System.out.println("Введите время (в секундах) с начала рабочего дня: ");
        double tFromStartWDInSeconds = Double.parseDouble(scanner.next());
        double tWDInSeconds = 8 * 60 * 60; // 8*3600 or 28800
        double tLeftToEndWDInSeconds = tWDInSeconds - tFromStartWDInSeconds;
        double tLeftToEndWDInHours = tLeftToEndWDInSeconds / 3600;
        tLeftToEndWDInHours = (int) tLeftToEndWDInHours;
        System.out.println("До конца рабочего дня осталось " + tLeftToEndWDInHours + " часов (без учета перерыва на обед) или " + (tLeftToEndWDInHours - 1) + " часов (c учетом перерыва на обед).");

//Девятое задание
//Пользователь вводит с клавиатуры стоимость одного ноутбука, их количество и процент скидки. Посчитать общую сумму заказа.
        System.out.println("");
        System.out.println("\nДевятое задание");
        System.out.println("Введите стоимость одного ноутбука: ");
        float nPrice = Float.parseFloat(scanner.next());
        while (nPrice < 0 || nPrice == 0) {
            System.out.println("Стоимость ноутбука не может быть отрицательным числом, равной нулю. Введите стоимость одного ноутбука: ");
            nPrice = Integer.parseInt(scanner.next());
        }
        System.out.println("Введите колличество ноутбуков: ");
        int nQantity = Integer.parseInt(scanner.next());
        while (nQantity < 0 || nQantity == 0) {
            System.out.println("Колличество ноутбуков не может быть отрицательным числом, равно нулю. Введите колличество ноутбуков: ");
            nQantity = Integer.parseInt(scanner.next());
        }
        System.out.println("Введите размер скидки в процентах: ");
        float nPercent = Float.parseFloat(scanner.next());
        while (nPercent >= 100 || nPercent <= 0) {
        System.out.println("Размер скидки в процентах  не может быть отрицательным числом, больше либо равен ста? равен нулю. Введите размер скидки в процентах (целое число от 0 до 99): ");
        nPercent = Integer.parseInt(scanner.next());
        }
        float nTotalPrice = nPrice * nQantity * nPercent / 100;
        System.out.println("Общая стоимость ноутбуков = " + nTotalPrice + "у.е.");

//Десятое задание
//10. Пользователь вводит с клавиатуры размер одного фильма в гигабайтах (вещественное значение!) и скорость Интернет-соединения в битах в секунду. Определить, за какое время (часы, минуты и секунды) скачается фильм.
        System.out.println("");
        System.out.println("\nДесятое задание");
        System.out.println("Введите размер фильма в гигабайтах: ");
        int fSize = Integer.parseInt(scanner.next());
        while (fSize < 0 || fSize == 0) {
            System.out.println("Размер фильма не может быть отрицательным числом, равным нулю. Введите размер фильма в гигабайтах: ");
            fSize = Integer.parseInt(scanner.next());
        }
        System.out.println("Введите скорость интернета в битах в секунду: ");
        int internetSpeed = Integer.parseInt(scanner.next());
        while (internetSpeed <= 0) {
            System.out.println("Скорость интернета не может быть отрицательным числом, равным нулю. Введите скорость интернета в битах: ");
            internetSpeed = Integer.parseInt(scanner.next());
        }
        double fSize1InBit = fSize * 8e+9;
        double tSeconds = fSize1InBit / internetSpeed;
        int tSecondsF = (int) tSeconds % 60;
        double tMinuts = tSeconds / 60;
        tMinuts = (int) tMinuts % 60;
        double tHours = tSeconds / 3600;
        tHours = (int) tHours % 60;
        System.out.println("Для скачивания файла необходимо: " + tHours + " часов " + tMinuts + " минут " + tSecondsF + " секунд.");

//Одинадцатое задание
//Пользователь вводит с клавиатуры объем флешки в гигабайтах. Посчитать, сколько на нее поместится фильмов размером 760 Мбайт.
        System.out.println("");
        System.out.println("\nОдинадцатое задание");
        System.out.println("");
        System.out.println("Введите размер флешки в гигабайтах: ");
        int fleskaSize = Integer.parseInt(scanner.next());
        while (fleskaSize <= 0) {
            System.out.println("Размер флешки не может быть отрицательным числом, равным нулю. Введите размер флешки в гигабайтах: ");
            fleskaSize = Integer.parseInt(scanner.next());
        }
        int fleskaSizeInMegabaits = fleskaSize * 1000;
        int filmQantity= fleskaSizeInMegabaits / 760;
        int freeSpace = fleskaSizeInMegabaits % 760;
        System.out.println("На флешку поместиться " + filmQantity + " фильмов размером 760 мегабайт. На флешке останется " + freeSpace + " мегабайт свободного места.");

//Двенадцатое задание
//Пользователь вводит с клавиатуры дробное число. Округлить его до двух знаков после запятой и вывести на экран.
        System.out.println("");
        System.out.println("\nДвенадцатое задание");
        System.out.println("Введите дробное число: ");
        float enyNumber = Float.parseFloat(scanner.next());
        System.out.println(String.format ("%.3g%n", enyNumber));

//Тринадцатое задание
//Преподаватель вводит с клавиатуры количество студентов, сдавших домашние задание, и количество «должников». Посчитать, сколько процентов составляют «должники» от общего числа студентов.
        System.out.println("");
        System.out.println("\nТринадцатое задание");
        System.out.println("Введите колличество студентов сдавших домашнее задание: ");
        int studGut = Integer.parseInt(scanner.next());
        while (studGut < 0) {
            System.out.println("Колличество студентов сдавших домашнее задание не может быть отрицательным числом. Введите колличество студентов сдавших домашнее задание: ");
            studGut = Integer.parseInt(scanner.next());
        }
        System.out.println("Введите колличество студентов не сдавших домашнее задание: ");
        int studBed = Integer.parseInt(scanner.next());
        while (studBed < 0) {
            System.out.println("Колличество студентов не сдавших домашнее задание не может быть отрицательным числом, равным нулю. Введите колличество студентов не сдавших домашнее задание: ");
            studBed = Integer.parseInt(scanner.next());
        }
        float studTugether = studBed + studGut; // Общее колличество студентов
        float studOnePercent = studTugether / 100; // Колличество студентов составляющих 1 % всех студентов.
        float studBedPercent = studBed / studOnePercent;
        float studGutPercent = studGut / studOnePercent;
        if (studGut > 0 && studBed > 0) {
            System.out.println("Процент хороших студентов составляет: " + studGutPercent + " процентов.\nПроцент плохих студентов составляет " + studBedPercent + " процентов.");
        }
        else if (studBed > 0 && studGut == 0) {
            System.out.println("Процент хороших студентов составляет: 0 процентов.\nПроцент плохих студентов составляет: 100 процентов.");
        }
        else if (studBed == 0 && studGut > 0) {
            System.out.println("Процент хороших студентов составляет: 100 процентов.\nПроцент плохих студентов составляет: 0 процентов.");
        }
        else if (studBed == 0 && studGut == 0) {
            System.out.println("Колличество всех студентов равно нулю. Процент вычислить невозможно.");
        }

//Четырнадцатое задание
//Пользователь вводит с клавиатуры время в секундах, прошедшее с начала дня. Определить, сколько времени (часов, минут и секунд) осталось до полуночи.
        System.out.println("");
        System.out.println("\nЧетырнадцатое задание");
        System.out.println("Введите время в секундах, прошедшее с начала рабочего дня: ");
        int tFromStart = Integer.parseInt(scanner.next());
        while (tFromStart < 0) {
            System.out.println("Время в секундах, прошедшее с начала рабочего дня:  не может быть отрицательным числом. Введите время в секундах, прошедшее с начала рабочего дня: ");
            tFromStart = Integer.parseInt(scanner.next());
        }
        int t24HoursInSeconds = 86400;
        int tTo24InSeconds = t24HoursInSeconds - tFromStart;
        int tTo24InSecondsF = (int) tTo24InSeconds % 60;
        int tTo24InMinuts = tTo24InSeconds / 60;
        tTo24InMinuts = (int) tTo24InMinuts % 60;
        int tTo24InHours = tTo24InSeconds / 3600;
        tTo24InHours = (int) tTo24InHours % 60;
        System.out.println("Время до конца дня: " + tTo24InHours + " часов " + tTo24InMinuts + " минут " + tTo24InSecondsF + " секунд.");

//Пятнадцатое задание
//Пользователь вводит с клавиатуры объем одного фильма в гигабайтах. Посчитать, сколько дискет понадобится для переноса фильма на другой компьютер (размер дискеты считать равным 1.44 Мбайт).
        System.out.println("");
        System.out.println("\nПятнадцатое задание");
        System.out.println("Введите размер фильма в гигабайтах: ");
        float fSizeInGb = Float.parseFloat(scanner.next());
        while (fSizeInGb <= 0) {
            System.out.println("Размер фильма не может быть отрицательным числом, равным нулю. Введите размер фильма в гигабайтах: ");
            fSizeInGb = Float.parseFloat(scanner.next());
        }
        float fSizeInMb = fSizeInGb * 1000;
        double discetQantity = fSizeInMb / 1.44;
        if ((discetQantity % 1.44) > 0) {
            discetQantity = (int) discetQantity + 1;
        }
        else if ((discetQantity % 1.44) == 0) {
            discetQantity = (int) discetQantity;
        }
        System.out.println("Для переноса фильма понадобится следующее колличество дискет обьемом 1,4 мегабайта: " + discetQantity);

//Шестнадцатое задание
//Пользователь вводит с клавиатуры сумму в гривнах, срок вклада в месяцах и процентную ставку за год. Посчитать, сколько денег будет у пользователя в конце срока.
        System.out.println("");
        System.out.println("\nШестнадцатое задание");
        System.out.println("Введите сумму в гривнах: ");
        float SumInUAH = Float.parseFloat(scanner.next());
        while (SumInUAH <= 0) {
            System.out.println("Сумма в гривнах: не может быть отрицательным числом, равной нулю. Введите сумму в гривнах: ");
            SumInUAH = Float.parseFloat(scanner.next());
        }
        System.out.println("Введите ставку размера процентов годовых: ");
        float PercentForJear = Float.parseFloat(scanner.next());
        while (PercentForJear <= 0) {
            System.out.println("Размер процентов не может быть отрицательным числом, равным нулю. Введите ставку размера процентов годовых: ");
            PercentForJear = Float.parseFloat(scanner.next());
        }
        System.out.println("Введите срок депозита (месяцев): ");
        int depositTimeInMonts = Integer.parseInt(scanner.next());
        while (depositTimeInMonts <= 0) {
            System.out.println("Срок депозита не может быть отрицательным числом, равным нулю. Введите срок депозита (месяцев): ");
            depositTimeInMonts = Integer.parseInt(scanner.next());
        }
        float percentForMonts = PercentForJear / 12;
        float percentSum = percentForMonts * depositTimeInMonts * SumInUAH / 100;
        float totalSum = percentSum + SumInUAH;
        System.out.println("Клиент получит сумму в размере: " + totalSum);

//Семнадцатое задание
//1,5 белки за 1,5 минуты съедают 1,5 ореха. Сколько орехов съедят 9 белок за 9 минут?
        System.out.println("");
        System.out.println("\nСемнадцатое задание"); // Одна белка ест орехов за 1,5 минут
        float oneSqurEatQantForOneAndFiveMinuts = (float) (1 * 1.5); // одна белка ест орехов за 1,5 минут
        float OneSqureEatQantForNineMinuts = (float) (9 / 1.5); // одна белка ест орехов за 9 минут
        int NineSqureEatQantForNineminuts = (int) OneSqureEatQantForNineMinuts * 9; // девять белок едят орехов за 9 минут
        System.out.println("Девять белок за девять минут сьедят следующее колличество орехов: " + NineSqureEatQantForNineminuts);

//Восемнадцатое задание
//Рассчитать площадь поверхности Земли.
        System.out.println("");
        System.out.println("\nВосемнадцатое задание");
        //S=4 π R2, R = 6371км.
        double pi = 3.14159265358979;
        double sE = 4 * 3.14159265358979 * 6371 * 6371;
        System.out.println("Площадь земли (квадратных киллометров) = " + String.format("%.16g%n", sE));

//Девятнадцатое задание
//Какая дата будет через N дней? Рекомендуется использование типа GregorianCalendar.
        System.out.println("");
        System.out.println("\nДевятнадцатое задание");
        System.out.println("Введите колличество дней: ");
        int dayQant = Integer.parseInt(scanner.next());
        Calendar cal = GregorianCalendar.getInstance();
        cal.add( Calendar.DAY_OF_YEAR, dayQant);
        Date yourDay = cal.getTime();
        System.out.println("Через " + dayQant + "  дней будет " + yourDay);

    }
}
