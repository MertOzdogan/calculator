package com.mert.calculatorInterview.calculator.operation;

/**
 * Interface for operators.
 * @author Mert
 *
 */
public interface OperationInterface
{
   public Number calculate( Double firstNumber, Double secondNumber );


   public Number calculate( Integer firstNumber, Integer secondNumber );
}
