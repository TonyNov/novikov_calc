package krista;

import java.util.InputMismatchException;

public class Calculator {

   public Calculator() {
   }

   public String calculate(String s) {
      String[] parts = s.split(" ");
      Number firstNumber, secondNumber;
      try {
         if (parts[0].contains("/")) {
            firstNumber = new FractionNumber(parts[0]);
         } else {
            firstNumber = new IntegerNumber(parts[0]);
         }
      } catch (Exception e) {
         throw new IllegalArgumentException("\nОшибка анализа первого операнда: " + e);
      }
      try {
         if (parts[0].contains("/")) {
            secondNumber = new FractionNumber(parts[2]);
         } else {
            secondNumber = new IntegerNumber(parts[2]);
         }
      } catch (Exception e) {
         throw new IllegalArgumentException("\nОшибка анализа второго операнда: " + e);
      }
      Operation operation;
      if (firstNumber instanceof IntegerNumber && secondNumber instanceof IntegerNumber) {
         switch (parts[1]) {
            case "-":
               operation = new intSubstraction(firstNumber, secondNumber);
               break;
            case "+":
               operation = new intAddition(firstNumber, secondNumber);
               break;
            case "*":
               operation = new intMultiplication(firstNumber, secondNumber);
               break;
            case "/":
               operation = new intDivision(firstNumber, secondNumber);
               break;
            default:
               throw new InputMismatchException("\nОшибка чтения знака операции!");
         }
      } else {
         switch (parts[1]) {
            case "-":
               operation = new FractionSubstraction(firstNumber.toFraction(), secondNumber.toFraction());
               break;
            case "+":
               operation = new FractionAddition(firstNumber.toFraction(), secondNumber.toFraction());
               break;
            case "*":
               operation = new FractionMultiplication(firstNumber.toFraction(), secondNumber.toFraction());
               break;
            case "/":
               operation = new FractionDivision(firstNumber.toFraction(), secondNumber.toFraction());
               break;
            default:
               throw new InputMismatchException("Ошибка чтения знака операции!");
         }
      }
      Number result = operation.calculate();
      if (result instanceof FractionNumber)
         ((FractionNumber) result).makeItBeautifull();
      return result.toString();
   }
}
