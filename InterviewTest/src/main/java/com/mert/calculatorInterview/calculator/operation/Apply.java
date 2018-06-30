package com.mert.calculatorInterview.calculator.operation;

/**
 * Implementation of Apply.
 * Checks if the operand whether is double or not.
 * @author Mert
 *
 */
public class Apply
{

   public Number apply( String splitted )
   {
      if ( splitted.contains( "." ) )
      {
         return Double.valueOf( splitted );
      }
      return Integer.valueOf( splitted );
   }

}
