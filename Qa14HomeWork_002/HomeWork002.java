package Qa14HomeWork_002;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Scanner;

public class HomeWork002 {
        // Main method
        public static void main(String[] args) {

// Первое задание1.
// Написать программу, которая находит среднее арифметическое значение трёх вещественных чисел, введённых с клавиатуры.
        System.out.println("\nПервое задание");
        System.out.println("To calculate arithmetic mean of three numbers, enter the first number: ");
        Scanner s = new Scanner(System.in);
        double number01 = Double.parseDouble(s.next());
        System.out.println("To calculate arithmetic mean of three numbers, enter the second number: ");
        double number02 = Double.parseDouble(s.next());
        System.out.println("To calculate arithmetic mean of three numbers, enter the third number: ");
        double number03 = Double.parseDouble(s.next());
        System.out.println("Arithmetic mean of three numbers: " + number01 + " ," + number02 + " ," + number03 + " is - " + (number01 + number02 + number03) / 3);

//Второе задание
//Написать программу, которая находит корень линейного уравнения ax + b = 0.
        System.out.println("\nВторое задание");
        System.out.println("Enter the number A: ");
        double a_1 = Double.parseDouble(s.next());
        System.out.println("Enter the number B: ");
        double b_1 = Double.parseDouble(s.next());
        if (a_1 == 0 && b_1 == 0) {
            System.out.println("The root of the linear equation (x) is any number.");
        }
        else if (a_1 == 0 && b_1 > 0) {
            System.out.println("The linear equation has no solution.");
        }
        else if (a_1 != 0) {
            System.out.println("The root of the linear equation (x) is" + -b_1/a_1);
        };

//Третье задание
//Пользователь вводит число и степень. Программа вычисляет указанную степень этого числа (Scanner, Math.pow).
        System.out.println("\nТретье задание");
        System.out.println("To calculate the power of a number, enter the appropriate number: ");
        double number = Double.parseDouble(s.next());
        System.out.println("To calculate the power of a number, enter the appropriate power: ");
        double power = Double.parseDouble(s.next());
        System.out.println (number + " in power " + power + " is - " + Math.pow(number, power));

//Четвертое задание
//Написать программу, которая  предлагает пользователю ввести радиус окружности, а затем считает площадь и длину этой окружности. Число Pi задать в программе как вещественную константу.
        System.out.println("\nЧетвертое задание");
        System.out.println("To calculate the area and circumference, enter the radius of the circle: ");
        double circleRadius = Double.parseDouble(s.next());
        double pi = 3.14159265358979;
        double area = pi * Math.pow(circleRadius, 2);
        double circumference = 2 * pi * circleRadius;
        System.out.println("For a circle of radius: " + circleRadius + " area is - " + area + " and circumference is - " + circumference);

//Пятое задание
// Написать программу, которая  предоставляет пользователю возможность ввести с клавиатуры количество гривен, и переводит это количество в доллары, евро и биткоины.
        System.out.println("\nПятое задание");
        System.out.println("Enter the amount of hryvnia: ");
        double uah = Double.parseDouble(s.next());
        double usdToUah = 0.041;
        double euroToUah = 0.037;
        double btcToUah = 0.0000050;
        System.out.println(uah + "hryvnia" + " corresponds to " + usdToUah * uah + " US dollars or " + euroToUah *  uah + " euros or " + btcToUah * uah + " bitcoins");
        //Почему-то сумму в биткойнах вывело в математической форме представления 5.0E-4

//Шестое задание
//6. Написать программу, которая переводит километры в сухопутные и морские мили.
        System.out.println("\nШестое задание");
        System.out.println("Enter the number of kilometers: ");
        double km = Double.parseDouble(s.next());
        double kmToSeaMilese = 0.539957;
        double kmToMilese = 0.621371;
        System.out.println(km + " kilometers" + " corresponds to " + kmToMilese * km + " Miles or " + kmToSeaMilese *  km + " Sea Miles ");

//Седьмое задание
//Написать программу, которая находит процент P от числа N.
        System.out.println("\nСедьмое задание");
        System.out.println("Enter the number: ");
        double numberPercent = Double.parseDouble(s.next());
        System.out.println("Enter the percent: ");
        double Percent = Double.parseDouble(s.next());
        System.out.println("The percentage (" + Percent + "%) of the number " + numberPercent + " is - " + numberPercent / 100 * Percent);

//Восьмое задание
//8. Написать программу, которая переводит указанное количество градусов по Цельсию в градусы по шкале Фаренгейта, Кельвина, Реомюра и Делиля.
        System.out.println("\nВосьмое задание");
        System.out.println("Enter the number of degrees Celsius: ");
        double celsius = Double.parseDouble(s.next());
        double celsiusToFahrenheit = (celsius * 9/5) + 32;
        double celsiusToKelvin = celsius + 273.15;
        double celsiusToReaumur = celsius * 0.80000;
        double celsiusToDelille = celsius * 1.5000 - 100.00;
        System.out.println(celsius + " Celsius degrees" + " corresponds to " + celsiusToFahrenheit + " Fahrenheit degrees or " + celsiusToKelvin + " Kelvin degrees or " + celsiusToReaumur + " Reaumur degrees or " + celsiusToDelille + " Delille degrees.");

//Девятое задание
//9. Поменять местами значения переменных a и b, сначала с использованием дополнительной третьей переменной, а затем – без.
        System.out.println("\nДевятое задание");
        System.out.println("Enter the number A: ");
        double a = Double.parseDouble(s.next());
        System.out.println("Enter the number B: ");
        double b = Double.parseDouble(s.next());
//Реализация через третье число С
        double c = b;
        b = a;
        a = c;
        System.out.println("The result of exchanging the values of two variables using the third." + "A= " + Double.toString(a) + "; B = " + Double.toString(b));
//Реализация без использования третьего числа (возвращаем переменным их исходные значения). Ответ на вторую часть этого задания подсмотрел в интернете.
        a = a + b;
        b = b - a;
        b = - b;
        a = a - b;
        System.out.println("The result of exchanging the values of two variables without using a third." + "A= " + Double.toString(a) + "; B = " + Double.toString(b));

    }

}