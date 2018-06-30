package com.mert.calculatorInterview.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 *Invalid command exception is thrown when there is something wrong with the given command in the file.
 * @author Mert
 *
 */
public class InvalidCommandException extends Exception
{
   final static Logger LOG = LoggerFactory.getLogger( InvalidCommandException.class );


   public InvalidCommandException( String cause )
   {
      InvalidCommandException.LOG.warn( cause );
      InvalidCommandException.LOG
      .info( "====================================================================" );
   }

}
