package com.mert.calculatorInterview.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mert.calculatorInterview.calculator.InvalidCommandException;

/**
 * Reading from resources.
 * @author Mert
 *
 */
public class Reader
{
   final static Logger LOG = LoggerFactory.getLogger( Reader.class );


   public static LinkedList<String> read( String path )
         throws IOException, InvalidCommandException
   {
      try (InputStream resourceAsStream =
            Reader.class.getClassLoader().getResourceAsStream( path );
            InputStreamReader reader = new InputStreamReader( resourceAsStream );
            BufferedReader bReader = new BufferedReader( reader ))
      {
         final LinkedList<String> operationInList = new LinkedList<>();
         while ( bReader.ready() )
         {
            final String a = bReader.readLine();
            if ( !a.isEmpty() )
            {
               operationInList.add( a );
            }
         }
         return operationInList;
      }
      catch ( final NullPointerException e )
      {
         throw new InvalidCommandException(
               "Path could not be found! Please check your resources -> Path = " + path );
      }

   }

}
