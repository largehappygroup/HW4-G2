package tdd.mrAPI.tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import tdd.mrAPI.MarsRover;

public class MarsRoverTest {

	/*
	 * Here, we provide two example "not-yet-implemented" test cases that each contains the description of 
	 *    1) assumptions or scenarios of this test case, e.g., position of the rover, position of an obstacle(s)...
	 *    2) test input
	 *    3) expected output
	 * 
	 * There is no limit of the number of test cases. 
	 * The goal is to create test cases based on the expected program behavior to guide the API implementation.
	 * 
	 * Check the README.md in Task 1 for the expected program behavior.
	 * 
	 * You ONLY need to create test cases that each with
	 *     1) a proper name, 
	 *     2) a detail description of test assumption/scenario, test input and expected output
	 * 
	 * You DO NOT need to implement the program or the actual test cases
	 * 
	 */

	MarsRover rover;

	@Before
	public void setUp() throws Exception {
		rover = new MarsRover(100, 100, "");
	}

	@Test
	public void theRoverIsLandedAndExecutedAnEmptyCommand() throws Exception {
		/*
		 * Assumption/Scenario: A rover is being created/landed and executed an empty
		 * command
		 * 
		 * Testing Input: NULL
		 * 
		 * Expected Output: rover position: (0,0,N)
		 */
		
		fail("Not yet implemented");
	}

	@Test
	public void theRoverMovesForwardOnceLanding() throws Exception {
		/*
		 * Assumption/Scenario: A rover is being created/landed and moved forward based
		 * on the string command "f"
		 * 
		 * Testing Input: "f"
		 * 
		 * Expected Output: rover position: (0,1,N)
		 */
		
		fail("Not yet implemented");
	}

	// Start creating your test cases!

}
