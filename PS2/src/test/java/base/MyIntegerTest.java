package base;

import base.MyInteger;
import static org.junit.Assert.*;

import org.junit.Test;

public class MyIntegerTest {

	@Test
	public void testGetiValue() {
		MyInteger y = new MyInteger(3);
		assertEquals(y.getiValue(),3);
	}

	@Test
	public void testIsEven() {
		MyInteger y = new MyInteger(3);
		assertEquals(y.isEven(),false);
		MyInteger x = new MyInteger(4);
		assertEquals(x.isEven(),true);
	}

	@Test
	public void testIsOdd() {
		MyInteger y = new MyInteger(3);
		assertEquals(y.isOdd(),true);
		MyInteger x = new MyInteger(4);
		assertEquals(x.isOdd(),false);
	}

	@Test
	public void testIsPrime() {
		MyInteger y = new MyInteger(17);
		assertEquals(y.isPrime(),true);
		MyInteger x = new MyInteger(20);
		assertEquals(x.isPrime(),false);
	}

	@Test
	public void testIsEvenInt() {
		MyInteger y = new MyInteger(3);
		assertEquals(y.isEven(3),false);
		assertEquals(y.isEven(4),true);
	}

	@Test
	public void testIsOddInt() {
		MyInteger y = new MyInteger(3);
		assertEquals(y.isOdd(4),false);
		assertEquals(y.isOdd(3),true);
	}

	@Test
	public void testIsPrimeInt() {
		MyInteger y = new MyInteger(3);
		assertEquals(y.isPrime(20),false);
		assertEquals(y.isPrime(17),true);
	}

	@Test
	public void testIsEvenMyInteger() {
		MyInteger y = new MyInteger(3);
		assertEquals(y.isEven(y),false);
		MyInteger x = new MyInteger(4);
		assertEquals(x.isEven(y),false);
		assertEquals(x.isEven(x),true);
	}

	@Test
	public void testIsOddMyInteger() {
		MyInteger y = new MyInteger(3);
		assertEquals(y.isOdd(y),true);
		MyInteger x = new MyInteger(4);
		assertEquals(x.isOdd(y),true);
		assertEquals(x.isOdd(x),false);
	}

	@Test
	public void testIsPrimeMyInteger() {
		MyInteger y = new MyInteger(17);
		assertEquals(y.isPrime(y),true);
		MyInteger x = new MyInteger(20);
		assertEquals(x.isPrime(y),true);
		assertEquals(x.isPrime(x),false);
	}

}
