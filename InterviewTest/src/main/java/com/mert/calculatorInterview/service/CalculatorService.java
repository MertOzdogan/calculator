package com.mert.calculatorInterview.service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.LinkedList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mert.calculatorInterview.calculator.Calculator;
import com.mert.calculatorInterview.calculator.InvalidCommandException;
import com.mert.calculatorInterview.io.Reader;

/**
 * Calculator service that has a calculator and the list of commands.
 * As it is written in the PDF:
 * "The last instruction  should  be "apply" and a number (e.g., "apply 3").
 * The calculator is then initialized with that number and the previous instructions are applied to that number.
 *
 * Therefore, commandlist is being checked if the last instruction is APPLY, if so THEN the calculator is initialized.
 * @author Mert
 */
public class CalculatorService
{
   final static Logger LOG = LoggerFactory.getLogger( CalculatorService.class );

   private Calculator calculator;

   private LinkedList<String> operationInList = new LinkedList<>();


   public CalculatorService( String path )
         throws IOException, URISyntaxException, InvalidCommandException
   {

      this.operationInList = Reader.read( path );

      if ( !this.operationInList.isEmpty()
            && this.operationValidityCheck( this.operationInList ) )
      {
         this.calculator = new Calculator( this.operationInList );
      }
      else
      {
         throw new InvalidCommandException(
               "The command order either did not carry APPLY in the end or carried in the wrong place. Please check your file. ->"
                     + path );
      }
      CalculatorService.LOG.info( "Calculator Service is initialized." );

   }


   private boolean operationValidityCheck( LinkedList<String> operationInList )
   {
      return operationInList.peekLast().toLowerCase().contains( "apply" );
   }


   public Calculator getCalc()
   {
      return this.calculator;
   }
}
