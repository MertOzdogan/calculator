package com.mert.calculatorInterview.InterviewTest;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.Test;

import com.mert.calculatorInterview.calculator.InvalidCommandException;
import com.mert.calculatorInterview.service.CalculatorService;

public class AdditionTest extends TestBase
{

   @Test
   public void AdditionTest1() throws IOException, URISyntaxException, InvalidCommandException
   {
      TestBase.logTestStart( "Testing for Addition Operator" );
      final CalculatorService serv = new CalculatorService( "Addition1" );
      serv.getCalc().doCalculate();
      Assert.assertEquals( 48.698, serv.getCalc().getMainResult().doubleValue(), 0.0 );
      TestBase.LOG.info( "PASSED: Result was as expected.(48.698)" );
      TestBase.logTestEnd();
   }


   @Test
   public void AdditionTest2() throws IOException, URISyntaxException, InvalidCommandException
   {
      TestBase.logTestStart( "Testing for Addition Operator" );
      final CalculatorService serv = new CalculatorService( "Addition2" );
      serv.getCalc().doCalculate();

      Assert.assertEquals( 0, serv.getCalc().getMainResult() );
      TestBase.LOG.info( "PASSED: Result was as expected.(0)" );
      TestBase.logTestEnd();

   }


   @Test
   public void AdditionTest3() throws IOException, URISyntaxException, InvalidCommandException
   {
      TestBase.logTestStart( "Testing for Addition Operator Expecting an Exception" );
      final CalculatorService serv = new CalculatorService( "Addition3" );
      serv.getCalc().doCalculate();

      Assert.assertEquals( 0.0, serv.getCalc().getMainResult() );
      TestBase.LOG.info( "PASSED: Result was as expected.(0.0)" );
      TestBase.logTestEnd();

   }


   @Test(expected = InvalidCommandException.class)
   public void AdditionInvalid1()
         throws IOException, URISyntaxException, InvalidCommandException
   {
      TestBase.logTestStart( "Testing for Addition Operator Expecting an Exception" );
      final CalculatorService serv = new CalculatorService( "AdditionInvalid1" );
      serv.getCalc().doCalculate();
      TestBase.logTestEnd();

   }

}
