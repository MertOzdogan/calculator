package com.mert.calculatorInterview.InterviewTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBase
{

   static protected Logger LOG = LoggerFactory.getLogger( TestBase.class );


   protected static void logTestEnd()
   {
      TestBase.LOG.info( TestBase.getTestName() + " passed successfully" );
      TestBase.LOG
      .info( "====================================================================" );
   }


   protected static void logTestStart( final String requirements )
   {
      TestBase.LOG.info( "Running " + TestBase.getTestName() + " " + requirements );
   }


   /**
    * Gets the test name.
    *
    * @return the test name
    */
   public static String getTestName()
   {
      String classname = Thread.currentThread().getStackTrace()[3].getClassName();
      classname = classname.substring( classname.lastIndexOf( "." ) + 1 );
      return classname + "." + Thread.currentThread().getStackTrace()[3].getMethodName();
   }

}
