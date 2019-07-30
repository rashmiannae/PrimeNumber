package com.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class MySingletonTest {

	@Test
	void testTrue() {
		assertEquals("When n is 5",MySingleton.nthprime(5),11);
	}
	/*@Test
	void testFalse() {
		
		assertEquals("When n is 5",MySingleton.nthprime(5),10);
	}*/
	@Test
	void testTrue2() {
		
		assertEquals("When n is 12",MySingleton.nthprime(12),37);
	}
   @Test
   void testZero() {
	   assertEquals("When n is 0",MySingleton.nthprime(0),1);
   }
   @Test
   void testNegative() {
	   assertEquals("When n is -1",MySingleton.nthprime(-1),1); 
   }
  
   @Test
	void testTrue4() {
		
		assertEquals("When n is 125",MySingleton.nthprime(125),691);
	}
 
   
}
