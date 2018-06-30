package com.mert.calculatorInterview.InterviewTest;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.Test;

import com.mert.calculatorInterview.calculator.InvalidCommandException;
import com.mert.calculatorInterview.service.CalculatorService;

public class ValidityTest extends TestBase
{

   @Test
   public void Example1() throws IOException, URISyntaxException, InvalidCommandException
   {
      TestBase.logTestStart( "Testing command validity." );
      final CalculatorService serv = new CalculatorService( "Example1" );
      Assert.assertEquals( 18, serv.getCalc().getMainResult() );
      TestBase.LOG.info( "PASSED: Result was as expected(18)" );
      TestBase.logTestEnd();
   }


   @Test
   public void Example2() throws IOException, URISyntaxException, InvalidCommandException
   {
      TestBase.logTestStart( "Testing command validity." );
      final CalculatorService serv = new CalculatorService( "Example2" );
      Assert.assertEquals( 90.0, serv.getCalc().getMainResult().doubleValue(), 0.0 );
      TestBase.LOG.info( "PASSED: Result was as expected(90.0)" );
      TestBase.logTestEnd();

   }


   @Test
   public void Example3() throws IOException, URISyntaxException, InvalidCommandException
   {
      TestBase.logTestStart( "Testing command validity." );
      final CalculatorService serv = new CalculatorService( "Example3" );
      Assert.assertEquals( 1, serv.getCalc().getMainResult() );
      TestBase.LOG.info( "PASSED: Result was as expected(1)" );
      TestBase.logTestEnd();

   }


   @Test
   public void Example4() throws IOException, URISyntaxException, InvalidCommandException
   {
      TestBase.logTestStart( "Testing command validity." );
      final CalculatorService serv = new CalculatorService( "Example4" );
      Assert.assertEquals( 7, serv.getCalc().getMainResult() );
      TestBase.LOG.info( "PASSED: Result was as expected(1)" );
      TestBase.logTestEnd();

   }


   @Test
   public void Example5() throws IOException, URISyntaxException, InvalidCommandException
   {
      TestBase.logTestStart( "Testing command validity." );
      final CalculatorService serv = new CalculatorService( "Example5" );
      Assert.assertEquals( 1971.296, serv.getCalc().getMainResult().doubleValue(), 0.001 );
      TestBase.LOG.info( "PASSED: Result was as expected(1)" );
      TestBase.logTestEnd();

   }


   @Test(expected = InvalidCommandException.class)
   public void ExampleInvalid1()
         throws IOException, URISyntaxException, InvalidCommandException
   {
      TestBase.logTestStart( "Testing command validity, expected InvalidCommandException" );
      final CalculatorService serv = new CalculatorService( "ExampleInvalid1" );
   }


   @Test(expected = InvalidCommandException.class)
   public void ExampleInvalid2()
         throws IOException, URISyntaxException, InvalidCommandException
   {
      TestBase.logTestStart( "Testing command validity, expected InvalidCommandException" );
      final CalculatorService serv = new CalculatorService( "ExampleInvalid2" );
      Assert.assertEquals( 90.0, serv.getCalc().getMainResult() );
   }


   @Test(expected = InvalidCommandException.class)
   public void ExampleInvalid3()
         throws IOException, URISyntaxException, InvalidCommandException
   {
      TestBase.logTestStart( "Testing command validity, expected InvalidCommandException" );
      final CalculatorService serv = new CalculatorService( "ExampleInvalid3" );
      Assert.assertEquals( 90.0, serv.getCalc().getMainResult() );
   }


   @Test(expected = InvalidCommandException.class)
   public void ExampleInvalid4()
         throws IOException, URISyntaxException, InvalidCommandException
   {
      TestBase.logTestStart( "Testing command validity, expected InvalidCommandException" );
      final CalculatorService serv = new CalculatorService( "ExampleInvalid4" );
      Assert.assertEquals( 90.0, serv.getCalc().getMainResult() );
   }


   @Test(expected = InvalidCommandException.class)
   public void ExampleInvalid5()
         throws IOException, URISyntaxException, InvalidCommandException
   {
      TestBase.logTestStart( "Testing command validity, expected InvalidCommandException" );
      final CalculatorService serv = new CalculatorService( "ExampleInvalid5" );
      Assert.assertEquals( 90.0, serv.getCalc().getMainResult() );
   }


   @Test(expected = InvalidCommandException.class)
   public void ExampleInvalid6()
         throws IOException, URISyntaxException, InvalidCommandException
   {
      TestBase.logTestStart( "Testing command validity, expected InvalidCommandException" );
      final CalculatorService serv = new CalculatorService( "ExampleInvalid6" );
      Assert.assertEquals( 90.0, serv.getCalc().getMainResult() );
   }


   @Test(expected = InvalidCommandException.class)
   public void ExampleInvalid7()
         throws IOException, URISyntaxException, InvalidCommandException
   {
      TestBase.logTestStart( "Testing command validity, expected InvalidCommandException" );
      final CalculatorService serv = new CalculatorService( "ExampleInvalid7" );
   }


   @Test(expected = InvalidCommandException.class)
   public void ExampleInvalid8()
         throws IOException, URISyntaxException, InvalidCommandException
   {
      TestBase.logTestStart( "Testing command validity, expected InvalidCommandException" );
      final CalculatorService serv = new CalculatorService( "ExampleInvalid8" );
   }


   @Test(expected = InvalidCommandException.class)
   public void ExampleInvalid9()
         throws IOException, URISyntaxException, InvalidCommandException
   {
      TestBase.logTestStart( "Testing command validity, expected InvalidCommandException" );
      final CalculatorService serv = new CalculatorService( "ExampleInvalid9" );
   }


   @Test(expected = InvalidCommandException.class)
   public void ExampleInvalid10()
         throws IOException, URISyntaxException, InvalidCommandException
   {
      TestBase.logTestStart( "Testing command validity, expected InvalidCommandException" );
      final CalculatorService serv = new CalculatorService( "ExampleInvalid10" );
   }


   @Test(expected = InvalidCommandException.class)
   public void ExampleFileDoesnotExist()
         throws IOException, URISyntaxException, InvalidCommandException
   {
      TestBase.logTestStart( "Testing command validity, expected InvalidCommandException" );
      final CalculatorService serv = new CalculatorService( "sadasdasd" );
   }


   @Test(expected = InvalidCommandException.class)
   public void ExampleInvalid11()
         throws IOException, URISyntaxException, InvalidCommandException
   {
      TestBase.logTestStart( "Testing command validity, expected InvalidCommandException" );
      final CalculatorService serv = new CalculatorService( "ExampleInvalid11" );
   }

}
