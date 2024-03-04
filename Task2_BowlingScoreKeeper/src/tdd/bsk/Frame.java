package tdd.bsk;

import tdd.bsk.BowlingException;

public class Frame {
	private int firstThrow;
	private int secondThrow;

	public Frame(int firstThrow, int secondThrow) throws BowlingException {
		if (firstThrow > 10 || firstThrow < 0 
				|| secondThrow > 10 || secondThrow < 0  
				|| firstThrow + secondThrow > 10 || firstThrow + secondThrow < 0
				){
	        throw new BowlingException();
	    }
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}

	// the score of a single frame
	public int score() {
		return firstThrow + secondThrow;
	}

	// returns whether the frame is a strike or not
	public boolean isStrike() {
		return firstThrow == 10 && secondThrow == 0;
	}

	// return whether a frame is a spare or not
	public boolean isSpare() {
		return !isStrike() && firstThrow + secondThrow == 10;
	}

	public Integer getFirstThrow() {
		return firstThrow;
	}

	public Integer getSecondThrow() {
		return secondThrow;
	}

	// bonus throws
	public int bonus() {
		return firstThrow + secondThrow;
	}

}
