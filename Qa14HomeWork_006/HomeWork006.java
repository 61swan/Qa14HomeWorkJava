package Qa14HomeWork_006;

import java.util.*;

public class HomeWork006 {


    public static void main(String[] args) {
        //Вопрос по 12 заданию - выход из цикла с последним дополнительным предсказанием.

// Первое задание
//1. Определить, параллельна ли определённая прямая линия оси ординат, либо оси абсцисс. Прямая задаётся двумя точками.
        System.out.println("\nПервое задание");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число Х1, - координату первой точки по горизонтальной оси Х: ");
        int numberX1 = scanner.nextInt();
        System.out.println("Введите число Y1, - координату первой точки по вертикальной оси Y: ");
        int numberY1 = scanner.nextInt();
        System.out.println("Введите число Х2, - координату второй точки по горизонтальной оси Х: ");
        int numberX2 = scanner.nextInt();
        System.out.println("Введите число Y2, - координату второй точки по вертикальной оси Y: ");
        int numberY2 = scanner.nextInt();
        if (numberX1 == numberX2) {
            System.out.println("Прямая параллельна вертикальной оси Y.");
        }
        else if (numberY1 == numberY2) {
            System.out.println("Прямая параллельна горизонтальной оси X.");
        }
        else {
            System.out.println("Прямая не параллельна ни одной из осей.");
        }

//Второе задание
//2. Проверить, имеет ли введённое число вещественную часть. Например, числа 3.14 и 2.5 – имеют вещественную часть, а числа 5 и 10.0 – нет.
        System.out.println("");
        System.out.println("\nВторое задание");
        System.out.println("Введите число для проверки наличия у него вещественной части: ");
        float numberRealPart = scanner.nextFloat();
        if (numberRealPart != (int) numberRealPart) {
            System.out.println("Число имеет вещественную часть. Вещественная часть числа - " + (numberRealPart - (int) numberRealPart));
        }
        else if (numberRealPart == (int) numberRealPart) {
            System.out.println("У числа нет вещественной части");
        }

//Третье задание
//3. Написать программу, которая предлагает пользователю ввести номер дня недели, и в ответ показывает название этого дня (например, 6 – это суббота). Решить с использованием if и switch.
        System.out.println("");
        System.out.println("\nТретье задание");
        System.out.println("Введите день недели (число от 1 до 7): ");
        int numberDayOfWeek = scanner.nextInt();
        while (numberDayOfWeek <= 0 || numberDayOfWeek > 7) {
            System.out.println("Введите дель недели (число от 1 до 7). Введенное число не может быть отрицательным, нулем, больше семи.");
            numberDayOfWeek = scanner.nextInt();
        }
        if (numberDayOfWeek == 1) {
            System.out.println("Это понедельник.");
        }
        else if (numberDayOfWeek == 2) {
            System.out.println("Это вторник.");
        }
        else if (numberDayOfWeek == 3) {
            System.out.println("Это среда.");
        }
        else if (numberDayOfWeek == 4) {
            System.out.println("Это четверг.");
        }
        else if (numberDayOfWeek == 5) {
            System.out.println("Это пятница.");
        }
        else if (numberDayOfWeek == 6) {
            System.out.println("Это суббота.");
        }
        else if (numberDayOfWeek == 7) {
            System.out.println("Это воскресенье.");
        }

//Четвертое задание
//4. Указать с клавиатуры текущее время (количество часов, минут, секунд). Проверить корректность введённых значений.
        System.out.println("");
        System.out.println("\nЧетвертое задание");

        System.out.println("Введите часы (число от 0 до 24 включительно): ");
        byte timeHours = scanner.nextByte();
        while (timeHours < 0 || timeHours > 24) {
            if (timeHours < 0) {
                System.out.println("Число не может быть отрицательным. Введите часы (число от 0 до 24 включительно): ");
            }
            else if (timeHours > 24) {
                System.out.println("Число не может быть больше 24. Введите часы (число от 0 до 24 включительно): ");
            }
            timeHours = scanner.nextByte();
        }
        System.out.println("Введите минуты (число от 0 до 59 включительно): ");
        Byte timeMinut = scanner.nextByte();
        while (timeMinut < 0 || timeMinut > 59) {
            if (timeMinut < 0) {
                System.out.println("Число не может быть отрицательным. Введите минуты (число от 0 до 59 включительно): ");
            }
            else if (timeMinut > 59) {
                System.out.println("Число не может быть больше 59. Введите минуты (число от 0 до 59 включительно): ");
            }
            timeMinut = scanner.nextByte();
        }
        System.out.println("Введите секунды (число от 0 до 59 включительно): ");
        Byte timeSecond = scanner.nextByte();
        while (timeSecond < 0 || timeMinut > 59) {
            if (timeSecond < 0) {
                System.out.println("Число не может быть отрицательным. Введите секунды (число от 0 до 59 включительно): ");
            }
            else if (timeSecond > 59) {
                System.out.println("Число не может быть больше 59. Введите секунды (число от 0 до 59 включительно): ");
            }
            timeSecond = scanner.nextByte();
        }
        GregorianCalendar calendar = new GregorianCalendar(new Locale("ua", "IN"));
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);
        System.out.printf("%02d:%02d:%02d - Время полученное с клавиатуры.\n", timeHours, timeMinut, timeSecond);
        System.out.println(hour + ":" + minute + ":" + second + " - Системное время.");
        if (timeHours == hour && timeMinut == minute) {
            System.out.println("Время совпадает (кроме секунд).");
        }
        else if (timeHours == hour && timeMinut == minute + 1) {
            System.out.println("Время почти совпадает (кроме минут и секунд).");
        }
        else {
            System.out.println("Время не совпадает.");
        }

//Пятое задание
//5. Ввести с клавиатуры шестизначный номер трамвайного (троллейбусного) билета, и определить является ли он счастливым (совпадают суммы трёх первых и трёх последних цифр билета).
        System.out.println("");
        System.out.println("\nПятое задание");
        System.out.println("Введите шестизначный номер билета (число из 6 цифр): ");
        int number6Dig = scanner.nextInt();
        int isNumber6Dig = (int) Math.ceil(Math.log10(number6Dig));
        while (isNumber6Dig != 6 || number6Dig < 0) {
            System.out.println("Введенное число содержит больше или меньше чем 6 знаков или отрицательное. Введите шестизначный номер (число из 6 цифр): ");
            number6Dig = scanner.nextInt();
            isNumber6Dig = (int) Math.ceil(Math.log10(number6Dig));
        }
        int number6Dig001 = number6Dig / 100000;
        int number6Dig002 = number6Dig / 10000 % 10;
        int number6Dig003 = number6Dig / 1000 % 10;
        int number6Dig004 = number6Dig / 100 % 10;
        int number6Dig005 = number6Dig / 10 % 10;
        int number6Dig006 = number6Dig % 10;
        int number3FirstDigSum = number6Dig001 + number6Dig002 + number6Dig003;
        int number3SecondDigSum = number6Dig004 + number6Dig005 + number6Dig006;
        if (number3FirstDigSum == number3SecondDigSum) {
            System.out.println("Поздравляем! Билет щасливый!");
        }
        else {
            System.out.println("Билет обычный.");
        }

//Шестое задание
//6. Указать с клавиатуры пол и возраст человека. Определить, пора ли ему на пенсию.
        System.out.println("");
        System.out.println("\nШестое задание");
        System.out.println("Введите возраст человека: ");
        int numberAge = scanner.nextInt();
        while (numberAge <= 0) {
            System.out.println("Введенное число не может быть отрицательным или равным нулю Введите возраст человека: ");
            numberAge = scanner.nextInt();
        }
        System.out.println("Укажите пол, введя с клавиатуры один из символов w или m: ");
        String symbolGender = scanner.next();
        if (symbolGender.equalsIgnoreCase("w") && numberAge >= 55) {
            System.out.println("Женщине пора на пенсию.");
        }
        else if (symbolGender.equalsIgnoreCase("m") && numberAge >= 60) {
            System.out.println("Мужчине пора на пенсию.");
        }
        else if (symbolGender.equalsIgnoreCase("w") && numberAge < 55) {
            System.out.println("Женщине нужно дальше работать.");
        }
        else if (symbolGender.equalsIgnoreCase("m") && numberAge < 60) {
            System.out.println("Мужчине нужно дальше работать.");
        }

//Седьмое задание
//7. Вводится время (часы и минуты) – программа выводит приветствие, соответствующее введённому времени (например, ввели 15 часов 6 минут – выводится приветствие «добрый день»).
        System.out.println("");
        System.out.println("\nСедьмое задание");
        System.out.println("Введите часы (число от 0 до 24 включительно): ");
        int numberHours = scanner.nextInt();
        while (numberHours < 0 || numberHours > 24) {
            if (numberHours < 0) {
                System.out.println("Число не может быть отрицательным. Введите часы (число от 0 до 24 включительно): ");
            }
            else if (numberHours > 24) {
                System.out.println("Число не может быть больше 24. Введите часы (число от 0 до 24 включительно): ");
            }
            numberHours = scanner.nextInt();
        }
        System.out.println("Введите минуты (число от 0 до 59 включительно): ");
        int numberMinut = scanner.nextInt();
        while (numberMinut < 0 || numberMinut > 59) {
            if (numberMinut < 0) {
                System.out.println("Число не может быть отрицательным. Введите минуты (число от 0 до 59 включительно): ");
            }
            else if (numberMinut > 59) {
                System.out.println("Число не может быть больше 59. Введите минуты (число от 0 до 59 включительно): ");
            }
            numberMinut = scanner.nextInt();
        }
        int numberHoursAndMinuts = numberHours * 60 + numberMinut;
        if (numberHoursAndMinuts  >=  60 * 22 && numberHoursAndMinuts <= 60 * 24 || numberHoursAndMinuts > 0 && numberHoursAndMinuts < 60 * 6) {
            System.out.println("Доброй ночи.");
        }
        else  if (numberHoursAndMinuts >= 60 * 6 && numberHoursAndMinuts < 60 * 10) {
            System.out.println("Доброе утро.");
        }
        else  if (numberHoursAndMinuts >= 60 * 10 && numberHoursAndMinuts < 60 * 13 || numberHoursAndMinuts >= 60 * 14 && numberHoursAndMinuts < 60 * 18) {
            System.out.println("Добрый день.");
        }
        else  if (numberHoursAndMinuts >= 60 * 18 &&  numberHoursAndMinuts < 60 * 22) {
            System.out.println("Добрый вечер.");
        }
        else {
            System.out.println("Обед.");
        }

//Восьмое задание
//8. Программа подсчета идеального веса к росту. Ввести рост и вес, вывести сообщение о том, сколько  нужно кг набрать или сбросить (идеальный вес = рост - 110).
        System.out.println("");
        System.out.println("\nВосьмое задание");
        System.out.println("Введите вес в киллограммах: ");
        int numberWeight = scanner.nextInt();
        while (numberWeight <= 0) {
            if (numberWeight < 0) {
                System.out.println("Вес не может быть отрицательным. Введите вес в киллограммах: ");
            }
            else if (numberWeight == 0) {
                System.out.println("Вес не может быть равен 0. Введите вес в киллограммах: ");
            }
            numberWeight = scanner.nextInt();
        }
        System.out.println("Введите рост в сантиметрах: ");
        int numberHeight = scanner.nextInt();
        while (numberHeight <= 0 || numberHeight < 110) {
            if (numberHeight < 0) {
                System.out.println("Рост не может быть отрицательным. Введите рост в сантиметрах: ");
            } else if (numberHeight == 0) {
                System.out.println("Рост не может быть равен нулю. Введите рост в сантиметрах: ");
            } else if (numberHeight > 0 && numberHeight <= 110) {
                System.out.println("Рост не может быть меньше 110 сантиметров. Введите рост в сантиметрах: ");
            }
            numberHeight = scanner.nextInt();
        }
        int idealWeight = numberHeight - 110;
        int deviationWeight = numberWeight - idealWeight;
        if (deviationWeight < 0) {
            System.out.println("Вам нужно набрать " + (0 - deviationWeight) + " килограмм.");
        }
        else if (deviationWeight > 0) {
            System.out.println("Вам нужно сбросить " + deviationWeight + " килограмм.");
        }
        else {
            System.out.println("У Вас все впорядке с весом.");
        }

//Девятое задание
//9. Ввести любую дату (день, месяц и год вводятся по отдельности). Проверить корректность введённых значений. Вывести дату следующего дня (использовать стандартные встроенные классы Java вроде GregorianCalendar запрещено!)
        System.out.println("");
        System.out.println("\nДевятое задание");
        System.out.println("Введите год: ");
        int year = scanner.nextInt();
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        System.out.println("Введите месяц: ");
        int month = scanner.nextInt();
        while (month <= 0 || month > 12) {
            if (month < 0) {
                System.out.println("Месяц не может быть отрицательным. Введите месяц: ");
            } else if (month == 0) {
                System.out.println("Месяц не может быть равен нулю. Введите месяц: ");
            } else if (month > 12) {
                System.out.println("Месяц не может быть больше 12. Введите месяц: ");
            }
            month = scanner.nextInt();
        }

        boolean dayInMont30;
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            dayInMont30 = true;
        }
        else {
            dayInMont30 = false;
        }
        boolean dayInMont31;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            dayInMont31 = true;
        }
        else {
            dayInMont31 = false;
        }
        System.out.println("Введите день месяца: ");
        int day = scanner.nextInt();
        while (day > 31 || day <= 0 || month == 2 && isLeapYear == false && day > 28 || month == 2 && isLeapYear && day >29 || day > 30 && dayInMont30) {
            if (day <=0) {
                System.out.println("День месяца не может быть отрицательным числом. Введите день месяца: ");
            } else if (day == 0) {
                System.out.println("День месяца не может быть равен нулю. Введите день месяца: ");
            } else if (day > 31) {
                System.out.println("В месяце не может быть больше чем 31 день. Введите день месяца: ");
            }
            else if (day > 30 && dayInMont30) {
                System.out.println("В " + month + " месяце не может быть больше 30 дней. Введите день месяца: ");
            }
            else if (month == 2 && isLeapYear && day >29) {
                System.out.println("В феврале високосного года не может быть больше чем 29 дней. Введите день месяца: ");
            }
            else if (month == 2 && isLeapYear == false && day > 28) {
                System.out.println("В феврале обычного (не высокосного) года не может быть больше чем 28 дней. Введите день месяца: ");
            }
            day = scanner.nextInt();
        }
        if (day <= 30 && dayInMont31) {
            System.out.println("Следующий день: " + (day+1) + "." + month + "." + year);
        }
        else if (day > 30 && dayInMont31 && month <= 11) {
            System.out.println("Следующий день: 01." + (month + 1) + "." + year);
        }
        else if (day > 30 && dayInMont31 && month == 12) {
            System.out.println("Следующий день: 01.01." + year+1);
        }
        else if (day <= 29 && dayInMont30) {
            System.out.println("Следующий день: " + (day+1) + "." + month + "." + year);
        }
        else if (day > 29 && dayInMont30 && month <= 11) {
            System.out.println("Следующий день: 01." + (month + 1) + "." + year);
        }
        else if (day > 29 && dayInMont30 && month == 12) {
            System.out.println("Следующий день: 01.01." + year+1);
        }
        else if (day <= 28 && month == 2 && isLeapYear) {
            System.out.println("Следующий день: " + (day+1) + "." + month + "." + year);
        }
        else if (day > 28 && month == 2 && isLeapYear) {
            System.out.println("Следующий день: 01.03" + year);
        }

        else if (day <= 27 && month == 2 && isLeapYear == false) {
            System.out.println("Следующий день: " + (day+1) + "." + month + "." + year);
        }
        else if (day > 27 && month == 2 && isLeapYear == false) {
            System.out.println("Следующий день: 01.03" + year);
        }

//Десятое задание
//10. Написать программу, которая предлагает пользователю выбрать животное из списка (1 – кошка, 2 – собака и тд.), и в ответ показывает, какие звуки издаёт выбранное животное. В списке должно быть хотя бы 10 животных.
        System.out.println("");
        System.out.println("\nДесятое задание");
        String [] arrayZoo = new String [] {"1.Кошка", "2.Собака", "3.Свинья", "4.Петух", "5.Курица", "6.Квочка", "7.Корова", "8.Козел", "9.Воробей", "10.Слон"};
        for (int i=0; i < arrayZoo.length; i++) {
            System.out.println(arrayZoo[i]);
        }
        System.out.println("Выберите одно из животных, указав цифру, расположенную с лева от него: ");
        byte numberAnimal = scanner.nextByte();
        while (numberAnimal <= 0 || numberAnimal > 10) {
            System.out.println("Выберите одно из животных, указав цифру, расположенную с лева от него.");
            numberAnimal = scanner.nextByte();
        }
        if (numberAnimal == 1) {
            System.out.println("Мяу.");
        }
        else if (numberAnimal == 2) {
            System.out.println("Гав.");
        }
        else if (numberAnimal == 3) {
            System.out.println("Хрю.");
        }
        else if (numberAnimal == 4) {
            System.out.println("Кука-реку.");
        }
        else if (numberAnimal == 5) {
            System.out.println("Куд-куда.");
        }
        else if (numberAnimal == 6) {
            System.out.println("Ко-ко-ко-ко.");
        }
        else if (numberAnimal == 7) {
            System.out.println("Му.");
        }
        else if (numberAnimal == 8) {
            System.out.println("Бе-еееее.");
        }
        else if (numberAnimal == 9) {
            System.out.println("Чик-чирик.");
        }
        else if (numberAnimal == 10) {
            System.out.println("Ту-уууу.");
        }

//Одинадцатое задание
//11. Написать игру "О, счастливчик!". На экране по очереди появляются вопросы, и варианты ответов. Неправильный выбор - игра окончена. Правильный ответ – переходим к следующему вопросу. Если все ответы правильные – в конце выводится сообщение о победе. По желанию можно реализовать несгораемые суммы и подсказки.
        System.out.println("");
        System.out.println("\nОдинадцатое задание");
        System.out.println("Игра \"О, счастливчик!\" началась. У нас библейская тема, потому что других вопросов не нашлось.\nОтветьте на следующий вопросы, введя номер ответа: ");
        System.out.println("Первый вопрос. Кто по размеру малый, но бывает в царских палатах?");
        int countYesGame = 0;
        int countNotGame = 0;
        String [] arrayAnswer001 = new String [] {"1.муравей", "2.паук", "3.воробей", "4.сверчок"};
        for (int i=0; i < arrayAnswer001.length; i++) {
            System.out.println(arrayAnswer001[i]);
        }
        System.out.println("Выберите ответ, указав цифру, расположенную с лева от него: ");
        byte arrayAnswer001In = scanner.nextByte();
        while (arrayAnswer001In <= 0 || arrayAnswer001In > 4) {
            System.out.println("Выберите ответ, указав цифру, расположенную с лева от него: ");
            arrayAnswer001In = scanner.nextByte();
        }
        if (arrayAnswer001In == 2) {
            System.out.println("Ответ верный.");
            System.out.println("");
            countYesGame++;
        }
        else {
            System.out.println("Ответ не верный.");
            System.out.println("");
            countNotGame++;
        }
        System.out.println("Второй вопрос. Чем нужно накормить человека, который болен от любви?");
        String [] arrayAnswer002 = new String [] {"1.яблоками", "2.виноградом", "3.медом", "4.Фиґами"};
        for (int i=0; i < arrayAnswer002.length; i++) {
            System.out.println(arrayAnswer002[i]);
        }
        System.out.println("Выберите ответ, указав цифру, расположенную с лева от него: ");
        byte arrayAnswer002In = scanner.nextByte();
        while (arrayAnswer002In <= 0 || arrayAnswer002In > 4) {
            System.out.println("Выберите ответ, указав цифру, расположенную с лева от него: ");
            arrayAnswer002In = scanner.nextByte();
        }
        if (arrayAnswer002In == 1) {
            System.out.println("Ответ верный.");
            System.out.println("");
            countYesGame++;
        }
        else {
            System.out.println("Ответ не верный.");
            System.out.println("");
            countNotGame++;
        }
        System.out.println("Третий вопрос. Как называлась верхняя одежда первосвященника?");
        String [] arrayAnswer003 = new String [] {"1.хитон", "2.ефод", "3.пурпур", "4.туника"};
        for (int i=0; i < arrayAnswer003.length; i++) {
            System.out.println(arrayAnswer003[i]);
        }
        System.out.println("Выберите ответ, указав цифру, расположенную с лева от него: ");
        byte arrayAnswer003In = scanner.nextByte();
        while (arrayAnswer003In <= 0 || arrayAnswer003In > 4) {
            System.out.println("Выберите ответ, указав цифру, расположенную с лева от него: ");
            arrayAnswer003In = scanner.nextByte();
        }
        if (arrayAnswer003In == 2) {
            System.out.println("Ответ верный.");
            System.out.println("");
            countYesGame++;
        }
        else {
            System.out.println("Ответ не верный.");
            System.out.println("");
            countNotGame++;
        }
        if (countNotGame == 3) {
            System.out.println("Колличество ошибочных ответов = 3. Игра окончена.");
            System.out.println("Колличество правильных ответов - " + countYesGame + " Колличество неправисльных ответов - " + countNotGame);
            System.exit(0);
        }
        System.out.println("Четвертый вопрос. Какое значение слова \"Нехуштан\"?");
        String [] arrayAnswer004 = new String [] {"1.жалящий змей", "2.зеленый змей", "3.спасающий змей", "4.медный змей"};
        for (int i=0; i < arrayAnswer004.length; i++) {
            System.out.println(arrayAnswer004[i]);
        }
        System.out.println("Выберите ответ, указав цифру, расположенную с лева от него: ");
        byte arrayAnswer004In = scanner.nextByte();
        while (arrayAnswer004In <= 0 || arrayAnswer004In > 4) {
            System.out.println("Выберите ответ, указав цифру, расположенную с лева от него: ");
            arrayAnswer004In = scanner.nextByte();
        }
        if (arrayAnswer004In == 4) {
            System.out.println("Ответ верный.");
            System.out.println("");
            countYesGame++;
        }
        else {
            System.out.println("Ответ не верный.");
            System.out.println("");
            countNotGame++;
        }
        if (countNotGame == 3) {
            System.out.println("Колличество ошибочных ответов = 3. Игра окончена.");
            System.out.println("Колличество правильных ответов - " + countYesGame + " Колличество неправисльных ответов - " + countNotGame);
            System.exit(0);
        }
        System.out.println("Пятый вопрос. С чем сравнивается язык мудрецов??");
        String [] arrayAnswer005 = new String [] {"1.с маслом", "2.с вином", "3.с лекарствами", "4.с медом"};
        for (int i=0; i < arrayAnswer005.length; i++) {
            System.out.println(arrayAnswer005[i]);
        }
        System.out.println("Выберите ответ, указав цифру, расположенную с лева от него: ");
        byte arrayAnswer005In = scanner.nextByte();
        while (arrayAnswer005In <= 0 || arrayAnswer005In > 4) {
            System.out.println("Выберите ответ, указав цифру, расположенную с лева от него: ");
            arrayAnswer005In = scanner.nextByte();
        }
        if (arrayAnswer005In == 3) {
            System.out.println("Ответ верный.");
            System.out.println("");
            countYesGame++;
        }
        else {
            System.out.println("Ответ не верный.");
            System.out.println("");
            countNotGame++;
        }
        if (countNotGame == 3) {
            System.out.println("Колличество ошибочных ответов = 3. Игра окончена.");
            System.exit(0);
        }
        System.out.println("Игра окончена.");
        System.out.println("Колличество правильных ответов - " + countYesGame + " Колличество неправисльных ответов - " + countNotGame);

//Двенадцатое задание
//12. Реализовать программу «Предсказатель». Пользователь вводит вопрос. Программа выдаёт случайный ответ из набора заранее предусмотренных ответов (5 положительных, 5 отрицательных, 10 нейтральных вариантов).
        System.out.println("");
        System.out.println("\nДвенадцатое задание");
        String [] arrayAnswer = new String [] {"Да.", "Нет.", "Верно.", "Не верно.", "Правильно.", "Не правильно.", "Хорошо.", "Плохо.", "Звезды Вам благоволят.", "Звезды Вам не благоволят.", "Сомневаюсь.", "Скорее, нет.", "Скорее да.", "Обратитель попозже.", "Попробуйте еще раз.", "Будущее не очевидно.", "Затрудняюсь ответить.", "Ситуация не ясна.", "Возможно.", "Может быть."};
        System.out.println("Задайте вопрос великому и всезнающему оракулу: ");
        String question = scanner.next();
        Random generator = new Random();
        int randomIndex = generator.nextInt(arrayAnswer.length);
        System.out.println(arrayAnswer[randomIndex]);
        while (!question.equalsIgnoreCase("n")) {
            System.out.println("Задайте еще один вопрос великому оракулу или напишите \"N\" и уползайте аакуратно, дабы не разгневать его: ");
            question = scanner.next();
            randomIndex = generator.nextInt(arrayAnswer.length);
            System.out.println(arrayAnswer[randomIndex]); // При вводе n и выходе из цикла, оракул выдает еще один ответ, хотя не должен это делать.
        }

//Тринадцатое задание
//13. Пользователь указывает дату своего рождения (число и месяц). Программа определяет знак зодиака пользователя и составляет для него гороскоп на ближайшую неделю.
        System.out.println("");
        System.out.println("\nТринадцатое задание");
        System.out.println("Введите свою дату рождения: ");
        int birthDate = scanner.nextInt();
        while (birthDate <= 0 || birthDate > 31) { //Проверка на то что введенное число не является отрицатьельным или нулем, а так же не больше 31.
            System.out.println("Введенное число не может быть отрицательным, нулем, больше 31.\nВведите свою дату рождения: ");
            birthDate = scanner.nextInt();
        }
        System.out.println("Введите свой месяц рождения: ");
        int birthMonth = scanner.nextInt();
        while (birthMonth <= 0 || birthMonth >12) { //Проверка на то что введенное число не является отрицатьельным или нулем
            System.out.println("Введенное число не может быть отрицательным, нулем, больше 12.\nВведите свой месяц рождения: ");
            birthMonth = scanner.nextInt();
        }
        if ((birthMonth==1 &&  birthDate <= 20) || (birthMonth==12 &&  birthDate >= 22)) {
                System.out.println("По знаку зодиака вы Козерог");
                System.out.println("Гороскоп на неделю 21 – 27 октября 2019 для Козерога\n" +
                        "\n" +
                        "Козерогам на этой неделе надо обратить внимание на питание. Старайтесь меньше употреблять сладкой и жирной пищи. Впрочем, вся новая неделя будет благоприятной для внутренней работы и самосовершенствования. Избавьтесь от сомнений, не позволяйте себе переживать из-за событий, которые от вас не зависят.\n" +
                        "\n" +
                        "В начале недели вы почувствуете прилив бодрости, который положительно скажется на вашей работоспособности. Этот день благоприятен для занятий спортом или прогулок на свежем воздухе. Приятные эмоции принесут покупки, встречи со старыми друзьями и домашние хлопоты. С финансами у Козерогов на этой неделе проблем не будет.\n" +
                        "\n" +
                        "В конце недели умерьте свой пыл и амбиции, а свободное время проведите в одиночестве: почитайте, послушайте любимую музыку. В субботу не спешите принимать серьезные решения в личной сфере.\n" +
                        "\n" +
                        "Благоприятный день: 26 октября\n" +
                        "Неблагоприятный день: 27 октября");
        }
        else if ((birthMonth==1 &&  birthDate >= 21) || (birthMonth==2 &&  birthDate <= 18)) {
            System.out.println("По знаку зодиака вы Водолей");
            System.out.println("Гороскоп на неделю 21 – 27 октября 2019 для Водолея\n" +
                    "Водолеев на этой неделе ждут приятные и позитивные события. Перед вами откроются новые возможности, которые вас окрылят и подарят новые возможности. Сядьте за рабочий стол и тщательно продумайте четкий план того, чего бы вы хотели достичь.\n" +
                    "Одиноким знакам очень захочется крепких и серьезных отношений, однако для того, чтобы найти свою вторую половинку, вам стоит начать с себя. Помните о самоконтроле и саморазвитии. Уделяйте свое свободное время учебе: читайте интересные книги, научные материалы, будьте в центре событий и сосредоточьтесь на одной теме, в которой вы будете досконально разбираться.\n" +
                    "Конец недели очень благоприятный для отдыха. В субботу смело отправляйтесь на шопинг или попробуйте поэкспериментировать со свои внешним видом.\n" +
                    "Благоприятный день: 23 октября \n" +
                    "Неблагоприятный день: 24 октября");
        }
            else if ((birthMonth==2 &&  birthDate >= 19) || (birthMonth==3 &&  birthDate <= 20)) {
            System.out.println("По знаку зодиака вы Рыбы");
            System.out.println("Гороскоп на неделю 21 – 27 октября 2019 для Рыб\n" +
                    "\n" +
                    "На этой неделе Рыбы будут уставшими от работы и от того объема задач, которые они выполнили. Для того, чтобы хоть немного переключиться вам надо больше встречаться с друзьями или гулять на свежем воздухе. Не бойтесь самому пойти в парк с кофе. Прогулка наедине, скорее всего, вам даже более полезна.\n" +
                    "На работе вам нужно соблюдать дисциплину. Не переключайтесь с одних дел на другие. Завершите до конца то, что начали, а потом приступайте к другим задачам. Не помешает вам и четкое планирование своего дня. Выделите несколько часов на то, чтобы расписать ваши приоритеты и дела, которые надо выполнить до конца месяца.\n" +
                    "Если на работе у вас возникнут проблемы с руководством – не уступайте. Четко представьте свое мнение и объясните чем вы руководствуетесь, делая тот или иной выбор. Старайтесь не показывать свою злость коллегам. Будьте приветливыми и добрыми – успех вам непременно улыбнется.\n" +
                    "Благоприятный день: 26 октября\n" +
                    "Неблагоприятный день: 14 октября");
        }
        else if ((birthMonth==3 &&  birthDate >= 21) || (birthMonth==4 &&  birthDate <= 21)) {
            System.out.println("По знаку зодиака вы Овен");
            System.out.println("Гороскоп на неделю 21 – 27 октября 2019 для Овна \n" +
                    "На этой неделе Овны будут очень зажигательными и энергичными. Представители знака добьются успеха почти во всех делах, за которых возьмутся. Если вы не уединитесь дома, а после работы отправитесь на прогулку с друзьями – то вполне вероятно, что сможете встретить свою вторую половинку или объект симпатии.\n" +
                    "Для разгрузки своего состояния астрологи рекомендуют заниматься спортом. А вечером уделите время на отдых: откройте любимую книгу или посмотрите познавательный документальный фильм. Если вы давно задумывались о том, каким образом вам сбросить лишние несколько килограммов – это больше всего в этом вопросе вам поможет правильное сбалансированное питание. Не пренебрегайте этим и получите тело своей мечты.\n" +
                    "На выходных соберитесь вместе компанией и отправляйтесь в мини-путешествие за город. Если будет способствовать погода – можете устроить осенний пикник.\n" +
                    "Благоприятный день: 22 октября\n" +
                    "Неблагоприятный день: 24 октября\n");
        }
        else if ((birthMonth==4 &&  birthDate >= 21) || (birthMonth==5 &&  birthDate <= 21)) {
            System.out.println("По знаку зодиака вы Телец");
            System.out.println("Гороскоп на неделю 21 – 27 октября 2019 для Тельца\n" +
                    "У Тельцов новая неделя будет немного стрессовой. Справиться с проблемами вам поможет спорт и внутренняя самодисциплина. Если ваше тело и ум будет в тонусе – у вас возникнут новые идеи, интересные проекты и желание создать что-то неординарное и качественное.\n" +
                    "Одиноким стоит попытаться реализовать желание найти свою вторую половинку. Встреча, которая будет дана вам судьбой произойдет случайно и тогда, когда вы совсем не будете этого ожидать. Супругам стоит обсудить проблемы, которые у вас накопились в последнее время. Научитесь слушать и прийдите к согласию со своим мужем или женой.\n" +
                    "На выходных устройте себе полный релакс. Не утруждайте себя делами, которые не успели сделать. Лучше все правильно структурируйте и перенесите на следующую неделю. Позвольте себе долго полежать в любимой ванной и насладиться джазом или расслабляющей музыкой.\n" +
                    "Благоприятный день: 22 октября\n" +
                    "Неблагоприятный день: 25 октября");
        }
        else if ((birthMonth==5 &&  birthDate >= 22) || (birthMonth==6 &&  birthDate <= 21)) {
            System.out.println("По знаку зодиака вы Близнецы");
            System.out.println("Гороскоп на неделю 21 – 27 октября 2019 для Близнецов\n" +
                    "Близнецы на этой неделе будут полны сил и вдохновения, главное не потерять пыл к работе. Ваше настроение будет достаточно позитивным, а незнакомые люди на улице будут делать вам комплименты. В бизнесе ваши дела будут идти очень хорошо, вы получите похвалу от руководства и коллег. Если среди представителей знака на работе появилась свободная вакансия, то человек, который займет определенную должность впоследствии может стать вам хорошим другом.\n" +
                    "В любовной сфере у вас все будет хорошо. У Близнецов не возникнет никакой ссоры с партнером. Однако, если ваша вторая половинка очень хочет познакомиться с вашими родителями – не следует ей в этом отказывать.\n" +
                    "Астрологи рекомендуют на выходных упорным Близнецам, которые работали в течение недели в поте лица – отправиться в горы, если этому будет способствовать погода. Горный воздух и пейзажи, которые завораживают взгляд – подарят вам глоток сил и энергии.\n" +
                    "Благоприятный день: 27 октября\n" +
                    "Неблагоприятный день: 24 октября");
        }
        else if ((birthMonth==6 &&  birthDate >= 22) || (birthMonth==7 &&  birthDate <= 22)) {
            System.out.println("По знаку зодиака вы Рак");
            System.out.println("Гороскоп на неделю 21 – 27 октября 2019 для Рака\n" +
                    "Ракам на этой неделе будет несколько сложно. Вы будете часто уставать и чувствовать упадок сил. Астрологи рекомендуют обратить особое внимание на состояние своего здоровья. Если у вас длительное время были проблемы с горлом, то не откладывайте поход к врачу. Оградите себя от будущих осложнений.\n" +
                    "Представителям знака рекомендуется выделить время на то, чтобы составить план ваших действий до конца осени. Не забывайте, что до окончания года осталось совсем мало времени. Поэтому, если у вас еще есть какие-то не реализованные цели или нерешенные вопросы – приложите максимум усилий, чтобы достичь желаемого результата.\n" +
                    "На выходных уделите время своим родным и близким, с которыми вы давно не виделись. Не ждите специальной случая, чтобы подарить родителям торт – купите его просто так. Семейные душевные разговоры за чашечкой чая сблизят вас с семьей и подарят ощущение уюта, покоя и любви.\n" +
                    "Благоприятный день: 26 октября\n" +
                    "Неблагоприятный день: 23 октября");
        }
        else if ((birthMonth==7 &&  birthDate >= 23) || (birthMonth==8 &&  birthDate <= 23)) {
            System.out.println("По знаку зодиака вы Лев");
            System.out.println("Гороскоп на неделю 21 – 27 октября 2019 для Льва\n" +
                    "Львы на этой неделе будут полностью соответствовать своему знаку. Ваше упорство, сила, энергичность и упорство позволит вам решить все дела, которые, казалось бы, надо реализовывать очень долгое время. Впрочем, чтобы не потерять задора, астрологи советуют приступать к задачам постепенно и не делать все сразу.\n" +
                    "В понедельник и вторник будьте осторожны с занятиями спортом и физическим трудом, существует риск получить травму или пострадать от чрезмерного переутомления. Не изводите себя за один раз, лучше несколько раз пойдите в зал и разгрузите свои задачи.\n" +
                    "Вторая половина недели благоприятна для поездок, в том числе за границу. В среду займитесь своими финансами и начните экономить средства. Сэкономленные деньги вам очень понадобятся уже совсем скоро.\n" +
                    "Благоприятный день: 25 октября\n" +
                    "Неблагоприятный день: 23 октября");
        }
        else if ((birthMonth== 8 &&  birthDate >= 24) || (birthMonth==9 &&  birthDate <= 22)) {
            System.out.println("По знаку зодиака вы Дева");
            System.out.println("Гороскоп на неделю 21 – 27 октября 2019 для Девы\n" +
                    "Звезды не рекомендуют Девам на этой неделе никакой дополнительной работы, которая будет заставлять работать допоздна. Будьте внимательны к себе и берегитесь, ведь существует вероятность нанести вред здоровью. Не забывайте об отдыхе, иначе вы просто \"сгорите\" на работе и не получите за это никакого вознаграждения.\n" +
                    "Если у вас есть такая возможность, то не оставайтесь наедине. Проводите больше времени с вашим партнером или в кругу друзей. На выходных это поможет не только забыть о работе, но и восстановить свои силы и новым стартом начать неделю.\n" +
                    "На работе старайтесь не сплетничать, этим вы можете навредить карьерному росту. Лучше сосредоточьтесь на своих собственных задачах и выполняйте их качественно. Это поможет вам стать добросовестным работником в глазах руководства.\n" +
                    "Благоприятный день: 23 октября\n" +
                    "Неблагоприятный день: 24 октября");
        }
        else if ((birthMonth== 9 &&  birthDate >= 24) || (birthMonth==10 &&  birthDate <= 22)) {
            System.out.println("По знаку зодиака вы Весы");
            System.out.println("Гороскоп на неделю 21 – 27 октября 2019 для Весов\n" +
                    "Для Весов пора абсолютного обновления. Выделите свое свободное время для того, чтобы освободиться от мыслей, которые мешают вам двигаться вперед; сделайте генеральную уборку в доме и избавьтесь от всех ненужных вещей; очистите переписки в телефоне с теми людьми, с которыми вы не поддерживаете контакт, упорядочьте заметки и рабочий стол. Таким образом вы откроете двери для того, чтобы в вашу жизнь вошло что-то новое и действительно вам нужно.\n" +
                    "В течение недели у вас будет много внеплановых встреч. Не отменяет их, ведь разговоры с друзьями и знакомыми помогут вам быстрее раскрыть потенциал, который вы глубоко закопали в себе и не хотите раскрывать.\n" +
                    "Выходные будут благоприятны для физических нагрузок. Вы не навредите организму, если все будете выполнять размеренно и под руководством инструктора.\n" +
                    "Благоприятный день: 26 октября\n" +
                    "Неблагоприятный день: 24 октября");
        }
        else if ((birthMonth== 10 &&  birthDate >= 24) || (birthMonth==11 &&  birthDate <= 22)) {
            System.out.println("По знаку зодиака вы Скорпион");
            System.out.println("Гороскоп на неделю 21 – 27 октября 2019 для Скорпиона\n" +
                    "Скорпионам на этой неделе будет нелегко. Осенняя затяжная погода возьмет над вами верх и вам будет непросто выйти из депрессии, которая нападет неожиданно. Вместо того, чтобы зарыться в одеяло и провести все свое свободное время в телефоне – займитесь приятными делами. Купите домой ароматические свечи, сварите ароматное какао или глинтвейн, украсьте свою комнату осенней атрибутикой или начните читать новую книгу. Такие вещи точно вас отвлекут и уберегут от плохого настроения.\n" +
                    "В четверг откажитесь от чужих и необязательных дел. Делайте только самое важное и самое необходимое из того, что запланировали в течение недели. В пятницу вы сможете решить самые острые проблемы, которые вас давно беспокоят.\n" +
                    "Рекомендуется на этой неделе сосредоточиться на личностном развитии. Вечеринки и шумные компании оставьте на следующую неделю, а вечера проведите в пользу книг и других учебных материалов.\n" +
                    "Благоприятный день: 22 октября\n" +
                    "Неблагоприятный день: 23 октября");
        }
        else if ((birthMonth== 11 &&  birthDate >= 23) || (birthMonth==12 &&  birthDate <= 21)) {
            System.out.println("По знаку зодиака вы Стрелец");
            System.out.println("Гороскоп на неделю 21 – 27 октября 2019 для Стрельца\n" +
                    "На этой неделе Стрельцам нужно расширить свои горизонты. Звезды будут способствовать любым вашим начинаниям, главное не сдаваться и добросовестно выполнять все поставленные перед вами задачи. В работе и бизнесе вас ждут интересные знакомства, которые помогут вашему будущему успеху.\n" +
                    "Первая половина недели очень благоприятна для любых начинаний. Лекции, доклады или мастер-классы дадут вам удивительно легко и иметь хороший результат. Посвятите вечер близким друзьям за чашкой душистого какао или интересного фильма в кинотеатре.\n" +
                    "На выходных Стрельцы будут чувствовать себя комфортно во всех сферах жизни. Проблемы со здоровьем вас не будут беспокоить, а финансовое положение будет, как всегда стабильным. Принимайте все события вашей жизни с благодарностью и не отказывайте себе в удовольствии отпраздновать собственные достижения.\n" +
                    "Благоприятный день: 25 октября\n" +
                    "Неблагоприятный день: 24 октября");
        }

//Четырнадцатое задание
//14. Валера купил N куриц по M гривен за одну курицу. Каждая курица несёт по X яиц в неделю. Валера решил открыть свой бизнес и стал продавать яйца, которые несут курицы. За сколько дней окупятся куры, если продавать яйца по Z гривен за десяток (с учётом НДС, но без учёта сбора в ПФ)? Сроком жизни куриц, влажностью воздуха в курятнике, а также скоростью ветра и фазами луны можно пренебречь.
        System.out.println("");
        System.out.println("\nЧетырнадцатое задание");
        System.out.println("Введите колличество куриц (N), приобретенных Валерой: ");
        int chickenN = scanner.nextInt();
        while (chickenN <= 0) { //Проверка на то что введенное число не является отрицатьельным или нулем
            System.out.println("Введенное число не может быть отрицательным или нулем.\nВведите колличество куриц (N), приобретенных Валерой: ");
            chickenN = scanner.nextInt();
        }
        System.out.println("Введите стоимость одной курицы (M), приобретенной Валерой: ");
        double chickenM = scanner.nextDouble();
        while (chickenM <= 0) { //Проверка на то что введенное число не является отрицатьельным или нулем
            System.out.println("Введенное число не может быть отрицательным или нулем.\nВведите стоимость одной курицы(M), приобретенной Валерой: ");
            chickenM = scanner.nextDouble();
        }
        System.out.println("Введите колличество яиц (Х), которые несет каждая приобретенная Валерой курица за неделю: ");
        int chickenX = scanner.nextInt();
        while (chickenX <= 0) { //Проверка на то что введенное число не является отрицатьельным или нулем
            System.out.println("Введенное число не может быть отрицательным или нулем.\nВведите колличество яиц (Х), которые несет каждая приобретенная Валерой курица за неделю: ");
            chickenX = scanner.nextInt();
        }
        System.out.println("Введите стоимость яиц (Z) в гривнах за десяток с НДС, но без сбора в пенсионный фонд (сбор в пенсионный фонд отдельно в данном случае не взимается - он учитывается при выплате заработной платы в ней и фонде оплаты труда), приобретенной Валерой: ");
        double chickenZ = scanner.nextDouble();
        while (chickenZ <= 0) { //Проверка на то что введенное число не является отрицатьельным или нулем
            System.out.println("Введенное число не может быть отрицательным или нулем.\nВведите стоимость яиц (Z) в гривнах за десяток с НДС, но без сбора в пенсионный фонд (сбор в пенсионный фонд отдельно в данном случае не взимается - он учитывается при выплате заработной платы в ней и фонде оплаты труда), приобретенной Валерой: ");
            chickenZ = scanner.nextDouble();
        }
        double chickenXforOneDay = chickenX / 7; // Колличество яиц, которые несет одна курица в день.
        double chickenZforOneEgg = chickenZ / 10; // Стоимость одного яйца.
        double totalEgsForOneDay = chickenXforOneDay * chickenN; //Общее колличество яиц, которые несут все курицы за день.
        double totalCostAllEgsAllChickenForOneDay = totalEgsForOneDay * chickenZforOneEgg; //Общая стоимость яиц, которые несут все курицы за один день.
        double totalCostAllChicken = chickenN * chickenM; //Общая стоимость всех куриц приобретенных Валерой.
        int paybackPeriod = (int) (totalCostAllChicken / totalCostAllEgsAllChickenForOneDay); //Срок окупаемости
        System.out.println("Срок окупаемости равен " + paybackPeriod + " дней.");

    }

}
