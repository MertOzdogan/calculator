package com.mert.calculatorInterview.InterviewTest;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.Test;

import com.mert.calculatorInterview.calculator.InvalidCommandException;
import com.mert.calculatorInterview.service.CalculatorService;

public class SubtractionTest extends TestBase
{

   @Test
   public void subtract1() throws IOException, URISyntaxException, InvalidCommandException
   {
      TestBase.logTestStart( "Testing for Addition Operator" );
      final CalculatorService serv = new CalculatorService( "Subtraction1" );
      Assert.assertEquals( -5, serv.getCalc().getMainResult() );
      TestBase.LOG.info( "PASSED: Result was as expected(-5)" );
      TestBase.logTestEnd();
   }


   @Test
   public void subtract2() throws IOException, URISyntaxException, InvalidCommandException
   {
      TestBase.logTestStart( "Testing for Addition Operator" );
      final CalculatorService serv = new CalculatorService( "Subtraction2" );
      Assert.assertEquals( -5.0, serv.getCalc().getMainResult() );
      TestBase.LOG.info( "PASSED: Result was as expected(-5.0)" );
      TestBase.logTestEnd();
   }

}
