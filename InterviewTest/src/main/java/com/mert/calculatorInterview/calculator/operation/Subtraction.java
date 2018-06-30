package com.mert.calculatorInterview.calculator.operation;

/**
 * Implementation of Subtraction
 * @author Mert
 *
 */
public class Subtraction implements OperationInterface
{

   @Override
   public Number calculate( Double firstNumber, Double secondNumber )
   {
      return firstNumber - secondNumber;
   }


   @Override
   public Number calculate( Integer firstNumber, Integer secondNumber )
   {
      return firstNumber - secondNumber;
   }

}
