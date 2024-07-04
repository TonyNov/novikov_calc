package ru.summer2024.novikov;

public class intAddition extends IntOperation {
   public intAddition(Number first, Number second) {
      super(first, second);
   }

   @Override
   public Number calculate() {
      return new IntegerNumber(firstOperand.value + secondOperand.value);
   }
}