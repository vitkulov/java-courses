package com.vitkulov.lesson_03;

import java.text.DecimalFormat;
import java.util.Locale;

/**
 * Sample class for arithmetic operations  + - * / ^
 *
 * @author vitkulov
 * @version 1
 * @since 27.07.2017
 */
public class Calculate {

    public static void main(String[] args) {
        System.out.println("Calculate...");
        int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);

        Calculate calc = new Calculate();

        System.out.println(String.format("%s + %s = %s", first, second, calc.add(first, second)));
        System.out.println(String.format("%s - %s = %s", first, second, calc.subtract(first, second)));
        System.out.println(String.format("%s * %s = %s", first, second, calc.multiply(first, second)));
        System.out.println(String.format("%s / %s = %s", first, second, calc.divide(first, second)));
        System.out.println(String.format("%s ^ %s = %s", first, second, calc.pow(first, second)));
    }

    /**
     * Adds two numbers
     *
     * @param first  first number
     * @param second second number
     * @return sum of two numbers
     */
    public int add(int first, int second) {
        return first + second;
    }

    /**
     * Multiply two numbers
     *
     * @param first  first number
     * @param second second number
     * @return result of multiplication
     */
    public int multiply(int first, int second) {
        return first * second;
    }

    /**
     * Divides the first number on the second
     *
     * @param first  first number
     * @param second second number
     * @return result of division
     */
    public double divide(int first, int second) {
        double d = (double) first / second;

        Locale locale = new Locale("en");
        Locale.setDefault(locale);
        String pattern = "##0.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String format = decimalFormat.format(d);

        return Double.parseDouble(format);
    }

    /**
     * Subtracts the second number from the first
     *
     * @param first  first number
     * @param second second number
     * @return result of subtraction
     */
    public int subtract(int first, int second) {
        return first - second;
    }

    /**
     * Elevate the first number
     *
     * @param first  first number
     * @param second second number - the power of the first
     * @return result of elevation
     */
    public int pow(int first, int second) {
        int result = 1;
        for (int i = 0; i < second; i++) {
            result *= first;
        }
        return result;
    }
}
