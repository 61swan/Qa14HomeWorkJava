package Qa14HomeWork_007;

import java.util.Scanner;

public class HomeWork007 {


    public static void main(String[] args) {

// Первое задание
//1. Вывести на экран горизонтальную линию из звёздочек. Число звёздочек указывает пользователь.
        System.out.println("\nПервое задание");
        System.out.println("Введите колличество звездочек, которое должно распечататься на экране: ");
        Scanner scanner = new Scanner(System.in);
        short starQuantity = scanner.nextShort();
        while (starQuantity <=0) {
            if (starQuantity < 0) {
                System.out.println("Введенное число не может быть отрицательным.\nПопробуйте еще раз.");
            }
            if (starQuantity == 0) {
                System.out.println("Введенное число не может быть нулем.\nПопробуйте еще раз.");
            }
            starQuantity = scanner.nextShort();
        }
        short countStarQuantity = 0;
        char star = '*';
        while (countStarQuantity < starQuantity) {
            System.out.print(star);
            countStarQuantity++;
        }

//Второе задание
//2. Написать программу, выводящую на экран только чётные целые числа из диапазона от 1 до 100.
        System.out.println("");
        System.out.println("\nВторое задание");
        byte countEvenNumbersFrom1To100 = 1;
        while (countEvenNumbersFrom1To100 <100) {
            if (countEvenNumbersFrom1To100 % 2 == 0) {
                System.out.print(countEvenNumbersFrom1To100 + " ");
            }
            countEvenNumbersFrom1To100++;
        }

//Третье задание
//3. Вычислить сумму чисел в диапазоне от M до N.
        System.out.println("");
        System.out.println("\nТретье задание");
        System.out.println("Введите начальную цифру диапазона чисел (М): ");
        int starDiapazonM = scanner.nextInt();
        System.out.println("Введите конечную цифру диапазона чисел (N): ");
        int endDiapazonN = scanner.nextInt();
        while (endDiapazonN <= starDiapazonM) {
            if (endDiapazonN < starDiapazonM) {
                System.out.println("Конечная цифра диапазона чисел не может быть меньше начальной цифры диапазона чисел.\nПопробуйте еще раз.");
            }
            if (endDiapazonN == starDiapazonM) {
                System.out.println("Конечная цифра диапазона чисел не может равняться начальной цифре диапазона чисел.\nПопробуйте еще раз.");
            }
            endDiapazonN = scanner.nextInt();
        }
        int sumDiapazonFromMtoN = 0;
        int countDiapazonFromMtoN = starDiapazonM;
        while (countDiapazonFromMtoN < endDiapazonN) {
            sumDiapazonFromMtoN+=countDiapazonFromMtoN;
            countDiapazonFromMtoN++;
        }
        System.out.println("Сумма диапазона чисел от М (включительно) до N (не включая) составляет: " + sumDiapazonFromMtoN);

//Четвертое задание
//4. Программа печатает таблицу соответствия температур по Цельсию и Фаренгейту  в указанном диапазоне.
        System.out.println("");
        System.out.println("\nЧетвертое задание");
        System.out.println("Введите начальную цифру диапазона температур (по цельсию): ");
        int starTempDiapazonCels = scanner.nextInt();
        System.out.println("Введите конечную цифру диапазона температур (по цельсию): ");
        int endTempDiapazonCels = scanner.nextInt();
        while (endTempDiapazonCels <= starTempDiapazonCels) {
            if (endTempDiapazonCels < starTempDiapazonCels) {
                System.out.println("Конечная цифра диапазона температур не может быть меньше начальной цифры диапазона температур.\nПопробуйте еще раз.");
            }
            if (endTempDiapazonCels == starTempDiapazonCels) {
                System.out.println("Конечная цифра диапазона температур не может равняться начальной цифре диапазона температур.\nПопробуйте еще раз.");
            }
            endTempDiapazonCels = scanner.nextInt();
        }
        int countTempDiapazonCels = starTempDiapazonCels;
        while (countTempDiapazonCels <endTempDiapazonCels) {
            System.out.println(countTempDiapazonCels + " градусов по цельсию равняется " + (((double) countTempDiapazonCels * 9 / 5) + 32) + "градусов по фарингейту.");
            countTempDiapazonCels++;
        }

//Пятое задание
//5. Написать программу, вычисляющую факториал введённого числа.
        System.out.println("");
        System.out.println("\nПятое задание");
        System.out.println("Введите число для расчета его факториала: ");
        int numberFactorial = scanner.nextInt();
        while (numberFactorial < 0) {
            System.out.println("Факториал может быть вычислен только для натурального числа.\nПопробуйте еще раз.");
            numberFactorial = scanner.nextInt();
        }
        if (numberFactorial == 0 || numberFactorial == 1) {
            System.out.println("Факториал введенного числа равен 1.");
        }
        else if (numberFactorial > 1) {
            int countNumberFactorial = 1;
            int multiplicationNumberFactorial =1;
            while (countNumberFactorial < numberFactorial) {
                multiplicationNumberFactorial *= countNumberFactorial;
                countNumberFactorial++;
            }
            multiplicationNumberFactorial *= numberFactorial;
        System.out.println("Факториалом числа " + numberFactorial + " является число " + multiplicationNumberFactorial + ".");
        }

//Шестое задание
//6. С клавиатуры вводится целое число любой разрядности. Определить количество цифр в нём и их сумму.
        System.out.println("");
        System.out.println("\nШестое задание");
        System.out.println("Введите натуральное число любой разрядности: ");
        int numberDigs = scanner.nextInt();
        while (numberDigs <= 0) {
            if (numberDigs < 0) {
                System.out.println("Введенное число не может быть отрицательным.\nПопробуйте еще раз.");
            }
            if (numberDigs == 0) {
                System.out.println("Введенное число не может быть нулем.\nПопробуйте еще раз.");
            }
            numberDigs = scanner.nextInt();
        }
        int numberDigsDigitsQantyty = (int) Math.ceil(Math.log10(numberDigs)); // Определение колличество знаков из которых состоит число при помощи логарифма.
        int sumNumberDigs = 0;
        int numberDigsDig;
        int countNumberDigs =0;
        while (numberDigs !=0) {
            numberDigsDig = numberDigs %10;
            sumNumberDigs += numberDigsDig;
            countNumberDigs++;
            numberDigs /= 10;
        }
        System.out.println("Колличество знаков числа вычисленное при помощи цикла: " + countNumberDigs);
        System.out.println("Сумма знаков числа составляет: " + sumNumberDigs);
        System.out.println("Колличество знаков числа вычисленное при помощи логарифма: " + numberDigsDigitsQantyty);

//Седьмое задание
//7. С клавиатуры вводится целое число любой разрядности. Необходимо перевернуть это число, т.е.  цифры должны располагаться в обратном порядке (например, вводим число 1234 – в результате будет 4321).
        System.out.println("");
        System.out.println("\nСедьмое задание");
        System.out.println("Введите натуральное число любой разрядности: ");
        int numberD = scanner.nextInt();
        while (numberD <= 0) {
            if (numberD < 0) {
                System.out.println("Введенное число не может быть отрицательным.\nПопробуйте еще раз.");
            }
            if (numberD == 0) {
                System.out.println("Введенное число не может быть нулем.\nПопробуйте еще раз.");
            }
            numberD = scanner.nextInt();
        }

        while(numberD != 0){
            System.out.print(numberD % 10);
            numberD/=10;
        }

//Восьмое задание
//8. С клавиатуры вводится целое число. Вывести на экран все числа, на которые введённое число делится без остатка. Например, для 60 такими числами станут 1, 2, 3, 4, 5, 6, 10, 12, 15, 20, 30, 60.
        System.out.println("");
        System.out.println("\nВосьмое задание");
        System.out.println("Введите натуральное число любой разрядности: ");
        int numD = scanner.nextInt();
        while (numD <= 0) {
            if (numD < 0) {
                System.out.println("Введенное число не может быть отрицательным.\nПопробуйте еще раз.");
            }
            if (numD == 0) {
                System.out.println("Введенное число не может быть нулем.\nПопробуйте еще раз.");
            }
            numD = scanner.nextInt();
        }
        int countNumD = 1;
        while(countNumD <= numD) {
            if (numD % countNumD == 0) {
                System.out.print(countNumD);
                if (countNumD == numD) {
                    System.out.print(".");
                } else {
                    System.out.print(", ");
                }
            }
            countNumD++;
        }

//Девятое задание
//9. С клавиатуры вводится целое число. Определить, является ли оно простым. Простое число делится без остатка только на 1 и само на себя.
        System.out.println("");
        System.out.println("\nДевятое задание");
        System.out.println("Введите натуральное число любой разрядности: ");
        int numDeinfach = scanner.nextInt();
        while (numDeinfach <= 0) {
            if (numDeinfach < 0) {
                System.out.println("Введенное число не может быть отрицательным.\nПопробуйте еще раз.");
            }
            if (numDeinfach == 0) {
                System.out.println("Введенное число не может быть нулем.\nПопробуйте еще раз.");
            }
            numDeinfach = scanner.nextInt();
        }
        int countnumDeinfach = 1;
        int isNumDeinfach = 0;
        while(countnumDeinfach <= numDeinfach) {
            if (numDeinfach % countnumDeinfach == 0) {
                System.out.print(countnumDeinfach);
                isNumDeinfach++;
                if (countnumDeinfach == numDeinfach) {
                    System.out.print(".");
                } else {
                    System.out.print(", ");
                }
            }
            countnumDeinfach++;
        }
        if (isNumDeinfach == 2) {
            System.out.println("\n" + numDeinfach + " - простое число.");
        }
        else {
            System.out.println("\n" + numDeinfach + " - не является простым числом.");
        }

//Десятое задание
//10. Проверить, есть ли во введённом числе одинаковые цифры подряд.
        System.out.println("");
        System.out.println("\nДесятое задание");
        System.out.println("Введите натуральное число любой разрядности: ");
        int num000 = scanner.nextInt();
        while (num000 <= 0) {
            if (num000 < 0) {
                System.out.println("Введенное число не может быть отрицательным.\nПопробуйте еще раз.");
            }
            if (num000 == 0) {
                System.out.println("Введенное число не может быть нулем.\nПопробуйте еще раз.");
            }
            num000 = scanner.nextInt();
        }
        int num000D1;
        int num000D2;
        while (num000 != 0) {
            num000D1 = num000 % 10;
            num000D2 = num000 / 10 % 10;
            if (num000D1 == num000D2) {
                System.out.println("Число " + num000D1 + " и число " + num000D2 + " расположенные рядом - одинаковые.");
            }
            num000 = num000 / 10;
        }


//Одинадцатое задание
//11. Ввести с клавиатуры число. Проверить, что все цифры этого числа расположены в неубывающем порядке (например, число 11299 соответствует заданию, а число 22044 нет).
        System.out.println("");
        System.out.println("\nОдинадцатое задание");
        System.out.println("Введите натуральное число любой разрядности: ");
        int num0001 = scanner.nextInt();
        while (num0001 <= 0) {
            if (num0001 < 0) {
                System.out.println("Введенное число не может быть отрицательным.\nПопробуйте еще раз.");
            }
            if (num0001 == 0) {
                System.out.println("Введенное число не может быть нулем.\nПопробуйте еще раз.");
            }
            num0001 = scanner.nextInt();
        }
        int num0001D1;
        int num0001D2;
        byte countNum0001 = 0;
        while (num0001 != 0) {
            num0001D1 = num0001 % 10;
            num0001D2 = num0001 / 10 % 10;
            if (num0001D1 < num0001D2) {
                System.out.println("Правый знак  числа " + num0001D1 + " больше расположенного с лева от него знака числа " + num0001D2 + " - условие не выполняется.");
                countNum0001++;
            }
            num0001 = num0001 / 10;
        }
        if (countNum0001 > 0) {
            System.out.println("Не все знаки числа расположены в порядке возрастания (с лева на право).\nИсключения выведены на экран выше.");
        }
        else {
            System.out.println("Все знаки числа расположены в порядке возрастания (с лева на право).");
        }

//Двенадцатое задание
//12. Написать игру «Угадай число». Пользователь мысленно загадывает число от 0 до 1000, компьютер отгадывает его за минимальное количество попыток.
        System.out.println("");
        System.out.println("\nДвенадцатое задание");
        System.out.println("Введите натуральное число от 0 до 1000 включительно: ");
        short num0003 = scanner.nextShort();
        while (num0003 < 0 || num0003 > 1000) {
            if (num0003 < 0) {
                System.out.println("Введенное число не может быть отрицательным.\nПопробуйте еще раз.");
            }
            if (num0003 > 1000) {
                System.out.println("Введенное число не может быть больше 1000.\nПопробуйте еще раз.");
            }
            num0003 = scanner.nextShort();
        }
        short number003Max = 1001;
        short number003Min = 0;
        short number003Half = 500;
        short countTryNumber003 = 0;
        byte isSmoller;
        while (number003Half != num0003 ) {
            if (number003Min == 0) {
                number003Half = (short) (number003Max / 2);
            }
            else if (number003Min > 0) {
                number003Half = (short) ((number003Max - number003Min)/2 + number003Min);
            }
            if (number003Half == num0003){
                System.out.println("Загаданное число: " + number003Half + "\nИгра окончена.");
                break;
            }
            else if (number003Half != num0003) {
                System.out.println("Загаданное число больше, меньше " + number003Half + "?\n Если больше введите цифру 1, если меньше, введите 0.");
                isSmoller = scanner.nextByte();
                while (isSmoller < 0 || isSmoller > 1) {
                    System.out.println("Если больше введите цифру 1, если меньше, введите 0.");
                    isSmoller = scanner.nextByte();
                }
                if (isSmoller == 1) {
                    number003Min = number003Half;
                }
                if (isSmoller == 0) {
                    number003Max = number003Half;
                }
            }


            countTryNumber003++;
        }
        System.out.println("Колличество попыток = " + countTryNumber003 + ".");

//Тринадцатое задание
//13. Показать номера и общее количество всех счастливых трамвайных билетов с шестизначными номерами.
        System.out.println("");
        System.out.println("\nТринадцатое задание");
        int countNum002 = 1001;
        byte countNum002Dig001;
        byte countNum002Dig002;
        byte countNum002Dig003;
        byte countNum002Dig004;
        byte countNum002Dig005;
        byte countNum002Dig006;
        byte leftNum002;
        byte rightNum002;
        int countHappyTickets = 1;
        while (countNum002 <= 999999) {
            countNum002Dig001 = (byte) (countNum002 / 100000);
            countNum002Dig002 = (byte) (countNum002 / 10000 % 10);
            countNum002Dig003 = (byte) (countNum002 / 1000 % 10);
            countNum002Dig004 = (byte) (countNum002 / 100 % 10);
            countNum002Dig005 = (byte) (countNum002 / 10 % 10);
            countNum002Dig006 = (byte) (countNum002 % 10);
            leftNum002 = (byte) (countNum002Dig001 + countNum002Dig002 + countNum002Dig003);
            rightNum002 = (byte) (countNum002Dig004 + countNum002Dig005 + countNum002Dig006);
            if (leftNum002 == rightNum002) {
                System.out.println("Левая часть " + Byte.toString(countNum002Dig001) + Byte.toString(countNum002Dig002) + Byte.toString (countNum002Dig003) + " равна правой части " + Byte.toString(countNum002Dig004) + Byte.toString(countNum002Dig005) + Byte.toString(countNum002Dig006) + " для числа " + countNum002 + ".");
                countHappyTickets++;
            }
            countNum002++;
        }
        System.out.println("Колличество счастливых билетов: " + countHappyTickets);

//Четырнадцатое задание
//14. Показать на экран все восьмизначные числа, цифры в которых не повторяются. Эти числа должны делиться на 12345 без остатка. Показать общее количество найденных чисел.
        System.out.println("");
        System.out.println("\nЧетырнадцатое задание");
        int num8Digcount = 0;
        int num8Dig = 99999999;

        int count8DigQantyty = 0;

        while (num8Digcount != 99999999) {
            int num8DigCopy = num8Dig;
            byte countNum8Dig = 0;

            while (num8DigCopy != 0) {

                byte num8DigD1;
                byte num8DigD2;
                num8DigD1 = (byte) (num8DigCopy % 10);
                num8DigD2 = (byte) (num8DigCopy / 10 % 10);
                if (num8DigD1 == num8DigD2) {
                    countNum8Dig++;
                }
                num8DigCopy = num8DigCopy / 10;
            }
                if (countNum8Dig == 0 && num8Dig % 12345 == 0) {
                        System.out.println("Смежные цифры числа " + num8Dig + " не совпадают и делятся на 12345 без остатка.");
                        count8DigQantyty++;
                    }

            num8Digcount++;// счетчик повторов
            num8Dig--;
        }
        System.out.println("Колличество чисел смежные цифры которых не совпадают и делятся на 12345 без остатка: " + count8DigQantyty + ".");

//Пятнадцатое задание
//15. Написать программу, позволяющую переводить любое число из десятичной системы счисления в 2, 8 и 16-ричную систему.
        System.out.println("");
        System.out.println("\nПятнадцатое задание");
        System.out.println("Введите натуральное число  для его перевода: ");
        int num10Sys = scanner.nextInt();
        String num2Sys = Integer.toBinaryString(num10Sys);
        System.out.println(num2Sys);
        String num8Sys = Integer.toOctalString(num10Sys);
        System.out.println(num8Sys);
        String num16Sys = Integer.toHexString(num10Sys);
        System.out.println(num16Sys);

//Шестнадцатое задание
//16. Реализовать игровую программу «Однорукий бандит» (игровой автомат). В начале игры пользователю выдаётся 5000 кредитов. Случайным образом на барабанчиках выпадает три значения от 0 до 7. Призовые комбинации: 0 0 0, 1 1 1, 2 2 2, 3 3 3, 4 4 4, 5 Х Х, 5 5 Х, 5 5 5, 7 Х Х, 7 7 Х, 7 7 7 (на месте Х может быть любая цифра). Штрафная комбинация: 6 6 6. Все остальные комбинации нейтральные. В любом случае, за показ новой комбинации с игрового счёта пользователя снимается определённая фиксированная сумма денег. Необходимо назначить различные вознаграждения за выпадение призовых комбинаций. Комбинации можно показывать через JOptionPane.showMessageDialog, например. Зациклить работу приложения. Игра заканчивается поражением, если деньги закончились. Игра заканчивается победой, если выпадает джек-пот (7 7 7).
        System.out.println("");
        System.out.println("\nШестнадцатое задание");
        int score = 5000;
        byte numberA = 0;
        byte numberB = 0;
        byte numberC = 0;
        byte startOrStop;
        System.out.println("Игра однорукий бандит началась.\nУ Вас на счете 5 000 очков.");
        while (score != 0) {
            System.out.println("\nЧтобы запустить новую игру нажмите 1, чтобы прекратить игру нажмите 0.");
            startOrStop = scanner.nextByte();
            while (startOrStop < 0 || startOrStop > 1) {
                System.out.println("Введите 1 для игры и 0 для ее окончания.");
                startOrStop = scanner.nextByte();
            }
            if (startOrStop == 1) {
                numberA = (byte) (Math.random() * 10);
                numberB = (byte) (Math.random() * 10);
                numberC = (byte) (Math.random() * 10);
            } else if (startOrStop == 0) {
                System.out.println("Игра окончена по Вашему желанию.");
                System.out.println("У Вас на счете осталось " + score + " очков.");
                break;
            }
            if (numberA == numberB && numberA == numberC) {
                if (numberA == 0 || numberA == 1 || numberA == 3 || numberA == 4 || numberA == 5) {
                    System.out.println("Поздравляем, у Вас выпала выигрышная комбинация чисел - " + numberA + ":" + numberB + ":" + numberC + " Вы выиграли 100 очков.");
                    score = score + 100;
                } else if (numberA == 6) {
                    System.out.println("К сожалению, у Вас выпала проигрышная комбинация чисел - " + numberA + ":" + numberB + ":" + numberC + " Вы проиграли половину всех своих очков.");
                    score = score - (score / 2);
                } else if (numberA == 7) {
                    System.out.println("Поздравляем, у Вас выпала выигрышная комбинация чисел - " + numberA + ":" + numberB + ":" + numberC + " Вы выиграли Джек-пот. Ваши очки увеличиваются в 10 раз.");
                    score = score * 10;
                    break;
                }
            } else if (numberA == numberB && numberA != numberC) {
                if (numberA == 5 || numberA == 7) {
                    System.out.println("Поздравляем, у Вас выпала выигрышная комбинация чисел - " + numberA + ":" + numberB + ":" + numberC + " Вы выиграли 50 очков.");
                    score = score + 50;
                }
            } else if (numberB == numberC && numberA != numberB) {
                if (numberB == 5 || numberB == 7) {
                    System.out.println("Поздравляем, у Вас выпала выигрышная комбинация чисел - " + numberA + ":" + numberB + ":" + numberC + " Вы выиграли 50 очков.");
                    score = score + 50;
                }
            } else {
                System.out.println("Выпавшая комбинация чисел - " + numberA + ":" + numberB + ":" + numberC + " не является выигрышной.\nПопробуйте еще раз.\nВам обязательно повезет.");
            }
            score = score - 50;
            System.out.println("За участие в игре у Вас снято 50 очков.");
            if (score == 0) {
                System.out.println("Игра окончена в связи с исчерпанием всех очков.");
            } else {
                System.out.println("У Вас осталось " + score + " очков.");
            }
        }

//Семнадцатое задание
//17. Королю нужно убить дракона, но средства его казны – ограничены.  Нужно создать программу, которая поможет рассчитать минимальное количество копейщиков, которое необходимо, чтобы убить дракона. Данные очков здоровья и атаки дракона и одного копейщика вводятся с клавиатуры. Защиту, удачу, мораль, меткость и т.п. не учитывать. Копейщики наносят удар первыми (общий нанесённый урон – это сумма атак всех живых копейщиков). Если атака дракона превышает значение очков здоровья копейщика (например, у копейщика хп 10, а атака дракона - 15),  то копейщик погибает, а оставшийся урон действует на оставшихся в живых копейщиков. Например, жизнь дракона 500, атака 55, жизнь одного копейщика 10, атака 10, а количество копейщиков – 20 http://heroes.thelazy.net/wiki/List_of_creatures Лог боя для данного примера должен выглядеть так:
//Копейщики атакуют (урон 200) – у дракона осталось 300 очков здоровья.
//Дракон атакует (урон 55) – осталось 15 копейщиков, один из которых ранен (осталось 5 очков здоровья).
//Копейщики атакуют (урон 150) – у дракона осталось 150 очков здоровья.
//Дракон атакует (урон 55) – осталось 9 копейщиков.
//Копейщики атакуют (урон 90) – у дракона осталось 60 очков здоровья.
//Дракон атакует (урон 55) – осталось 4 копейщика, один из которых ранен (осталось 5 жизней).
//Копейщики атакуют (урон 40) – у дракона осталось 20 очков здоровья.
//Дракон атакует  и побеждает.
        System.out.println("");
        System.out.println("\nСемнадцатое задание");

        System.out.println("Введите очки здоровья одного копейщика (от 1 до 15): ");
        byte copHelth = scanner.nextByte();
        while (copHelth < 1 || copHelth > 15) {
            System.out.println("Введите очки здоровья одного копейщика (от 1 до 15): ");
            copHelth = scanner.nextByte();
        }
        System.out.println("Введите очки атаки одного копейщика (от 1 до 15): ");
        byte copAtac = scanner.nextByte();
        while (copAtac < 1 || copAtac > 15) {
            System.out.println("Введите очки здоровья одного копейщика (от 1 до 15): ");
            copAtac = scanner.nextByte();
        }

        System.out.println("Введите очки здоровья дракона (от 50  до 500): ");
        short dracHelth = scanner.nextShort();
        while (dracHelth < 50 || dracHelth > 500) {
            System.out.println("Введите очки здоровья дракона (от 50  до 500): ");
            dracHelth = scanner.nextByte();
        }
        System.out.println("Введите очки атаки дракона (от 25 до 100): ");
        byte dracAtac = scanner.nextByte();
        while (dracAtac < 25 || dracAtac > 100) {
            System.out.println("Введите очки атаки дракона (от 25 до 100): ");
            dracAtac = scanner.nextByte();
        }

        System.out.println("Введите колличество копейщиков (от 1 до 100): ");
        double copQant = scanner.nextShort();
        while (copQant < 1 || copQant > 100) {
            System.out.println("Введите колличество копейщиков (от 1 до 100): ");
            copAtac = scanner.nextByte();
        }
        short copHelthTotal = (short) (copQant * copHelth);
        System.out.println("Начало боя.");
        short copAtacTotal = (short) (copQant * copAtac);

        while (dracHelth > 0 || copHelthTotal > 0) {
            //Копейщики атакуют
            dracHelth -= copAtacTotal;
            System.out.println("Копейщики атакуют (урон  дракону - " + copAtacTotal + ") – у дракона осталось " + dracHelth + " очков здоровья.");
            //Дракон атакует
            copHelthTotal -= dracAtac;
            copQant = copHelthTotal / copHelth;
            if (copHelthTotal % copHelth > 0) {
                System.out.println("Дракон атакует (урон копейщикам - " + dracAtac + ") – осталось " + (int) copQant + " копейщиков, один из которых ранен (осталось " + (int) (copHelthTotal % copHelth) + " очков здоровья).");
            } else if (copHelthTotal % copHelth == 0) {
                System.out.println("Дракон атакует (урон копейщикам - " + dracAtac + ") – осталось " + (int) copQant + " копейщиков.");
            }
            if (dracHelth - copAtacTotal <= 0) {
                System.out.println("Копейщики атакуют и побеждают.");
                break;
            } else if (copHelthTotal - dracAtac <= 0) {
                System.out.println("Дракон атакует и побеждает.");
                break;
            }


        }

    }
}