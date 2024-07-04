package ru.summer2024.novikov;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите выражение");
        try (Scanner scanner = new Scanner(System.in);) {
            String str = scanner.nextLine();
            Calculator calc = new Calculator();
            System.out.println(calc.calculate(str));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + ' ' + e);
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage() + ' ' + e);
        } catch (Exception e) {
            System.out.println("Ошибка ввода");
        }
    }
}