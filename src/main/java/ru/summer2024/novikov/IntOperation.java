package ru.summer2024.novikov;

public abstract class IntOperation extends Operation {
   IntegerNumber firstOperand, secondOperand;

   public IntOperation(Number first, Number second) {
      firstOperand = (IntegerNumber) first;
      secondOperand = (IntegerNumber) second;
   }

   public abstract Number calculate();
}
