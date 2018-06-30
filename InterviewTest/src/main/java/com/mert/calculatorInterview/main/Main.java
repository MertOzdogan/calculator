package com.mert.calculatorInterview.main;

import java.io.IOException;
import java.net.URISyntaxException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mert.calculatorInterview.calculator.InvalidCommandException;
import com.mert.calculatorInterview.service.CalculatorService;

/**
 * Main method.
 * @author Mert
 *
 */
public class Main
{
   final static Logger LOG = LoggerFactory.getLogger( Main.class );


   /**
    *
    * @param args[0]: Filename to be read from the repository.
    */
   public static void main( String[] args )
   {
      if ( args.length > 0 )
      {
         CalculatorService calculatorService;
         try
         {
            calculatorService = new CalculatorService( args[0] );
            calculatorService.getCalc().doCalculate();
            Main.LOG.info(
                  "The inputs are = " + calculatorService.getCalc().getOperationInList()
                  + " RESULT = " + calculatorService.getCalc().getMainResult() );

         }
         catch ( IOException | URISyntaxException | InvalidCommandException e )
         {
            //No need to do anything.
         }
      }
      else
      {
         Main.LOG.warn(
               "To run the application, a filename must be given by args. Please try again." );
      }
   }

}
