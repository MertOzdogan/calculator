package com.mert.calculatorInterview.calculator.operation;

/**
 * Implementation of Addition
 * @author Mert
 *
 */
public class Addition implements OperationInterface
{

   @Override
   public Number calculate( Double firstNumber, Double secondNumber )
   {
      return firstNumber + secondNumber;
   }


   @Override
   public Number calculate( Integer firstNumber, Integer secondNumber )
   {
      return firstNumber + secondNumber;
   }

}
