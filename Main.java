import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.toRadians;

public class Main {
/*
1 Написати програму, чяка друкує таблицю значень sin(x), де х - кожні 10 градусів від 0 до 360.(значення мають бути записані в масив за допомогою циклу)
2 Написати програму, яка в масиві з випадкових цілих чисел замінює всі парні числа на 0 і виводить отриманий масив на екран. Для генерації випадкових чисел можна користуватись Random.
3 Написати програму, яка перевіряє чи є рядок паліндромом (використовувати масив символів - char string[]. Для конвертації рядка, використовувати метод toCharArray())
4 Написати програму, яка знаходить мінімальне і максимальне число в масиві.
 */

    static void printSin() {

        double[] sinValues = new double[37];
        for (int i = 0; i < sinValues.length; i++) {
            int angle = i * 10;
            double radians = toRadians(angle);
            double sin = Math.sin(radians);
            sinValues[i] = sin;
            System.out.println("sin(" + angle + "): " + sin);
        }
    }

        static void changeArr() {

            Random random = new Random();
            int[] numbers = new int[10];

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(101);
            }

            for ( int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    numbers[i] = 0;
                }
            }

            for ( int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i] + " ");
            }
        }

    static void palindromeWord(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value: ");
        String inputString = input.nextLine();

        char[] charArray = inputString.toCharArray();
        boolean isPalindrome = true;

        for ( int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[charArray.length - i - 1]){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

    static int[] arrayRandom(){
        Random random = new Random();
        int[] numbers = new int[11];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1001);
        }
        return numbers;
    }

    static void minAndMaxValueInArray(int[] someArray){
        System.out.println("Min value: " + Arrays.stream(someArray).min() + " " + "and" + " " + "max value: " + Arrays.stream(someArray).max());
    }

    public static void main(String[] args) {
        printSin();
        System.out.println("===================================================================>");
            // 2 Написати програму, яка в масиві з випадкових цілих чисел замінює всі парні числа на 0 і виводить отриманий масив на екран. Для генерації випадкових чисел можна користуватись Random.
        changeArr();
        System.out.println("===================================================================>");
//                3 Написати програму, яка перевіряє чи є рядок паліндромом (використовувати масив символів - char string[]. Для конвертації рядка, використовувати метод toCharArray())
//                Слова для проверки: мим, дед, наган, заказ, кабак, казак, мадам, шалаш.
        palindromeWord();
        System.out.println("===================================================================>");
//  4 Написати програму, яка знаходить мінімальне і максимальне число в масиві.
        minAndMaxValueInArray(arrayRandom());
        }
    }
