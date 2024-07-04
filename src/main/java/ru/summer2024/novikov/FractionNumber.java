package ru.summer2024.novikov;

public class FractionNumber extends Number {
    public Integer a, b;

    public FractionNumber(String value) {
        String[] parts = value.split("/");
        if (parts.length != 2)
            throw new IllegalArgumentException(
                    "Строка должна содержать ровно одно деление");
        a = Integer.parseInt(parts[0]);
        b = Integer.parseInt(parts[1]);
    }

    public FractionNumber(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    public FractionNumber toFraction() {
        return this;
    }

    public void makeItBeautifull() {
        if (b < 0) {
            a *= -1;
            b *= -1;
        }
        int numerator = a, denominator = b;
        while (denominator != 0) {
            int temp = denominator;
            denominator = numerator % denominator;
            numerator = temp;
        }
        a /= numerator;
        b /= numerator;
    }

    public String toString() {
        return a.toString() + "/" + b.toString();
    }
}