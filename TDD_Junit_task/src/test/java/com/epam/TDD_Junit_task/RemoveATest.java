package com.epam.TDD_Junit_task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveATest {
	/*
	 * TO-DO List
	 * 1.2 chars AA=' ' OR BC=BC
	 * 2.multiple chars
	 *   >ABCD=BCD
	 *   >AACD=CD
	 *   >BACD=BCD
	 *   >BBAA=BBAA
	 *   >AABAA=BAA
	 * 
	 */

	
	RemoveA ra;
	
	@BeforeEach
	void start() {
		ra =new RemoveA();
	}
	
	
	@Test
	void DelA2chars() {
		assertEquals("",ra.delete("AA"));
		assertEquals("BB",ra.delete("BB"));
	}
	
	@Test
	void oneChar(){
		assertEquals("BCD",ra.delete("ABCD"));
	}
	
	@Test
	void twoChar() {
		assertEquals("CD",ra.delete("AACD"));
	}
	
	@Test
	void secChar() {
		assertEquals("BCD",ra.delete("BACD"));
	}
	
	@Test
	void NoA() {
		assertEquals("BBAA",ra.delete("BBAA"));
	}
	
	@Test
	void MultiChars() {
		assertEquals("BAA",ra.delete("AABAA"));
	}
	
	

}
