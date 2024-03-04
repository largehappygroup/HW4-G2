package tdd.bsk.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import tdd.bsk.*;

public class tests {

	/*
	 * Here, we provide two example test cases that check 
	 *    1) if the frame is created
	 *    2) if the score of a frame is added up correctly
	 * 
	 * There is no limit of the number of test cases.
	 * The goal is to TEST the implementation as thorough as possible. 
	 * 
	 * Check the README.md in Task 2 for the expected program behavior.
	 * 
	 * There is at least ONE bug in the code. Try to find them out! 
	 * You DO NOT need to correct the implementation!
	 * 
	 * Online Bowling Game Score Calculator: https://bowlinggenius.com
	 */
	
	@Test
	public void testFrameWithScoreIsCreated() throws Exception {
		Frame f = new Frame(1, 2);
		assertNotNull(f);
	}

	@Test
	public void testFrameScore() throws Exception {
		Frame f = new Frame(2, 4);
		assertEquals(6, f.score());
	}
	
	// Start creating your test cases!

}
