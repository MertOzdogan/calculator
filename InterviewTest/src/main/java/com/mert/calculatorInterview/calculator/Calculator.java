package com.mert.calculatorInterview.calculator;

import java.util.LinkedList;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mert.calculatorInterview.calculator.operation.Addition;
import com.mert.calculatorInterview.calculator.operation.Apply;
import com.mert.calculatorInterview.calculator.operation.Divide;
import com.mert.calculatorInterview.calculator.operation.Multiply;
import com.mert.calculatorInterview.calculator.operation.OperationInterface;
import com.mert.calculatorInterview.calculator.operation.Subtraction;

/**
 * The class that contains basic operations such as Divide,Multiply,Subsraction,Addition and Apply.
 *
 * @author Mert
 */
public class Calculator
{
   final static Logger LOG = LoggerFactory.getLogger( Calculator.class );

   private final OperationInterface divide = new Divide();

   private final OperationInterface multiply = new Multiply();

   private final OperationInterface subtraction = new Subtraction();

   private final OperationInterface addition = new Addition();

   private final Apply apply = new Apply();

   private final LinkedList<String> operationInList;

   private Number mainResult;


   public Calculator( LinkedList<String> operationInList ) throws InvalidCommandException
   {
      this.operationInList = operationInList;
      Calculator.LOG.info( "Calculator has been initialized." );
   }


   /**
    * Splits the commands into two,
    * ADD 5 -> [ADD,5] and calls the method that is responsible for doing the calculation.
    * @return result of calculation
    * @throws InvalidCommandException
    */
   public Number doCalculate() throws InvalidCommandException
   {
      final LinkedList<String> operationInListCopy = new LinkedList<>( this.operationInList );
      if ( operationInListCopy.peekLast().toLowerCase().contains( "apply" ) )
      {
         final String applyLine = operationInListCopy.pollLast();
         final String[] splittedApplyLine = applyLine.split( " " );
         if ( splittedApplyLine.length != 2 )
         {
            throw new InvalidCommandException( "Invalid command given! ->" + applyLine );
         }
         this.mainResult = this.apply.apply( splittedApplyLine[1] );

         for ( final String operation : operationInListCopy )
         {
            Number number = null;
            final String[] splittedOperation = operation.split( " " );
            if ( splittedOperation.length != 2 )
            {
               throw new InvalidCommandException( "Invalid command given! ->" + operation );
            }
            try
            {
               if ( splittedOperation[1].contains( "." ) )
               {
                  number = Double.valueOf( splittedOperation[1] );
               }
               else
               {
                  number = Integer.valueOf( splittedOperation[1] );
               }
            }
            catch ( final NumberFormatException e )
            {
               throw new InvalidCommandException( "Invalid command given! ->" + operation );
            }

            switch ( splittedOperation[0].toLowerCase( Locale.US ) )
            {
               case "add":
                  this.mainResult =
                  this.runOperation( this.addition, this.mainResult, number );
                  break;
               case "multiply":
                  this.mainResult =
                  this.runOperation( this.multiply, this.mainResult, number );
                  break;
               case "divide":
                  this.mainResult = this.runOperation( this.divide, this.mainResult, number );
                  break;
               case "subtract":
                  this.mainResult =
                  this.runOperation( this.subtraction, this.mainResult, number );
                  break;
               default:
                  throw new InvalidCommandException(
                        "Unknown command was given ->" + splittedOperation[0] );
            }

         }
      }
      return this.mainResult;
   }


   /**
    * The method that runs the given operation according to coming command
    * @param operation
    * @param num1
    * @param num2
    * @return
    */
   private Number runOperation( OperationInterface operation, Number num1, Number num2 )
   {
      if ( (num1 instanceof Double) || (num2 instanceof Double) )
      {
         return operation.calculate( num1.doubleValue(), num2.doubleValue() );
      }
      return operation.calculate( num1.intValue(), num2.intValue() );

   }


   /**
    * Getter for result
    * @return
    */
   public Number getMainResult()
   {
      return this.mainResult;
   }


   public LinkedList<String> getOperationInList()
   {
      return this.operationInList;
   }

}
