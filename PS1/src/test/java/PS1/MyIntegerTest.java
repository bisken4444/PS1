package PS1;

import static org.junit.Assert.*;
import org.junit.Test;

public class MyIntegerTest {

	@Test
	public void Test_IsEven_1() {

		int iValue = 3;

		MyInteger myInt = new MyInteger(iValue);

		assertFalse(myInt.isEven());

		iValue = 4;
		myInt = new MyInteger(iValue);

		assertTrue(myInt.isEven());
	}

	
	@Test
	public void Test_IsEven_2() {
		int iValue = 3;

		assertFalse(MyInteger.isEven(iValue));

		iValue = 4;

		assertTrue(MyInteger.isEven(iValue));

	}

	
	@Test
	public void Test_IsEven_3() {

		int iValue = 3;

		MyInteger myInt = new MyInteger(iValue);

		assertFalse(MyInteger.isEven(myInt));

		iValue = 4;
		myInt = new MyInteger(iValue);

		assertTrue(MyInteger.isEven(myInt));

	}
	
	
	@Test
	public void Test_IsOdd_1() {

		int iValue = 4;

		MyInteger myInt = new MyInteger(iValue);

		assertFalse(myInt.isOdd());

		iValue = 3;
		myInt = new MyInteger(iValue);

		assertTrue(myInt.isOdd());
	}

	
	@Test
	public void Test_IsOdd_2() {
		int iValue = 4;

		assertFalse(MyInteger.isOdd(iValue));

		iValue = 3;

		assertTrue(MyInteger.isOdd(iValue));

	}
	

	@Test
	public void Test_IsOdd_3() {

		int iValue = 4;

		MyInteger myInt = new MyInteger(iValue);

		assertFalse(MyInteger.isOdd(myInt));

		iValue = 3;
		myInt = new MyInteger(iValue);

		assertTrue(MyInteger.isOdd(myInt));
	}
	

	@Test
	public void Test_Prime_1() {

		int iValue = 3;
		MyInteger myInt = new MyInteger(iValue);
		
		assertTrue(myInt.isPrime());
		
	}
	

	@Test
	public void Test_Prime_2() {

		int[] iValues = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
				97 };

		for (int i : iValues) {
			MyInteger myInt = new MyInteger(i);
			
			assertTrue(myInt.isPrime());
			
		}

	}
	
	
	@Test
	public void Test_Prime_3() {

		int[] iValues = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
				97 };

		for (int i = 2; i < 100; i++) {
			boolean bValueFound = false;
			for (int idx : iValues) {
				if (i == idx) {
					bValueFound = true;
					break;
				}
			}
			if (bValueFound == false) {
				MyInteger myInt = new MyInteger(i);
				assertFalse(myInt.isPrime());
			}
		}
	}
	
	
	@Test
	public void Test_Prime_4() {
		
		int iValue = 3;
		assertTrue(MyInteger.isPrime(iValue));
	}
	
	
	@Test
	public void Test_Prime_5() {

		int[] iValues = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
				97 };

		for (int i : iValues) {
			assertTrue(MyInteger.isPrime(i));
		}
	}

	
	@Test
	public void Test_Prime_6() {

		int[] iValues = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
				97 };

		for (int i = 2; i < 100; i++) {
			boolean bValueFound = false;
			for (int idx : iValues) {
				if (i == idx) {
					bValueFound = true;
					break;
				}
			}
			if (bValueFound == false) {
				assertFalse(MyInteger.isPrime(i));
			}
		}
	}
	
	
	@Test
	public void Test_Prime_7() {

		int iValue = 3;
		MyInteger myInt = new MyInteger(iValue);
		assertTrue(MyInteger.isPrime(myInt));
	}

	
	@Test
	public void Test_Prime_8() {

		int[] iValues = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
				97 };

		for (int i : iValues) {
			MyInteger myInt = new MyInteger(i);
			
			assertTrue(MyInteger.isPrime(myInt));
		}
	}
	
	
	@Test
	public void Test_Prime_9() {

		int[] iValues = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
				97 };

		for (int i = 2; i < 100; i++) {
			boolean bValueFound = false;
			for (int idx : iValues) {
				if (i == idx) {
					bValueFound = true;
					break;
				}
			}
			if (bValueFound == false) {
				MyInteger myInt = new MyInteger(i);
				assertFalse(MyInteger.isPrime(myInt));
			}
		}
	}
	
	@Test
	public void Test_Equal_1() {
		
		int iValue = 3;
		MyInteger myInt = new MyInteger(iValue);

		assertFalse(myInt.equals(5));

		assertTrue(myInt.equals(3));
		
	}
	
	@Test
	public void Test_Equal_2() {
		
		int iValue = 3;
		MyInteger myInt = new MyInteger(iValue);

		int iValue2 = 7;
		MyInteger myInt2 = new MyInteger(iValue2);
		
		assertFalse(myInt.equals(myInt2));


	}
	
	@Test
	public void Test_Equal_3() {
		
		int iValue = 7;
		MyInteger myInt = new MyInteger(iValue);

		int iValue2 = 7;
		MyInteger myInt2 = new MyInteger(iValue2);
		
		assertTrue(myInt.equals(myInt2));


	}
}
