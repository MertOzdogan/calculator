package com.mert.calculatorInterview.InterviewTest;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.Test;

import com.mert.calculatorInterview.calculator.InvalidCommandException;
import com.mert.calculatorInterview.service.CalculatorService;

public class OperatorTest extends TestBase {

	@Test
	public void Divide1() throws IOException, URISyntaxException, InvalidCommandException {
		TestBase.logTestStart("Testing for Addition Operator");
		final CalculatorService serv = new CalculatorService("Divide1");
		serv.getCalc().doCalculate();

		Assert.assertEquals(4.0, serv.getCalc().getMainResult().doubleValue(), 0.0);
		TestBase.LOG.info("PASSED successfully.");
	}

	@Test
	public void Divide2() throws IOException, URISyntaxException, InvalidCommandException {
		TestBase.logTestStart("Testing for Addition Operator");
		final CalculatorService serv = new CalculatorService("Divide2");
		serv.getCalc().doCalculate();

		Assert.assertEquals(4.375, serv.getCalc().getMainResult().doubleValue(), 0.0);
		TestBase.LOG.info("PASSED successfully.");
		TestBase.logTestEnd();

	}

	@Test
	public void Divide3() throws IOException, URISyntaxException, InvalidCommandException {
		TestBase.logTestStart("Testing for Addition Operator");
		final CalculatorService serv = new CalculatorService("Divide3");
		serv.getCalc().doCalculate();

		Assert.assertEquals(4.5, serv.getCalc().getMainResult().doubleValue(), 0.0);
		TestBase.LOG.info("PASSED successfully");
		TestBase.logTestEnd();
	}

	@Test(expected = IllegalArgumentException.class)
	public void DivideByZero() throws IOException, URISyntaxException, InvalidCommandException {
		TestBase.logTestStart("Testing for Addition Operator, expecting IllegalArgumentException");
		final CalculatorService serv = new CalculatorService("DivideBy0");
		serv.getCalc().doCalculate();

	}

	@Test(expected = IllegalArgumentException.class)
	public void Divide0By0() throws IOException, URISyntaxException, InvalidCommandException {
		TestBase.logTestStart("Testing for Addition Operator, expecting IllegalArgumentException");
		final CalculatorService serv = new CalculatorService("Divide0By0");
		serv.getCalc().doCalculate();

	}
}
