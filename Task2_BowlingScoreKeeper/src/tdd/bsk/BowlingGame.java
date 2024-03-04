package tdd.bsk;

import java.util.ArrayList;
import java.util.List;
import tdd.bsk.BowlingException;

public class BowlingGame {
	// a bowling game is made of (at least) 10 frames
	private List<Frame> frames;
	private Frame bonus;
	private int frameCounter = 0;

	public BowlingGame() {
		frames = new ArrayList<Frame>();
	}

	public void addFrame(Frame frame) {
		frames.add(frame);
		frameCounter++;
	}

	public void setBonus(int firstThrow, int secondThrow) throws BowlingException {
		if (isNextFrameBonus() 
				|| frames.get(frameCounter - 1).isSpare() 
				|| frames.get(frameCounter - 1).isStrike()) {
			bonus = new Frame(firstThrow, secondThrow);
			frames.add(bonus);
		}
	}

	// return the score of the match
	public int score() {
		int score = 0;
		int index = 0;
		for (Frame frame : frames) {
			if (frame.isStrike() && index < 9) {
				Frame nextFrame = frames.get(index + 1);
				if (nextFrame.isStrike() && index < 8) {
					Frame nextnextFrame = frames.get(index + 2);
					score = score + 10 + nextFrame.getFirstThrow() + nextnextFrame.getFirstThrow();
				} else {
					score = score + 10 + nextFrame.getFirstThrow() + nextFrame.getSecondThrow();
				}

			} else if (frame.isSpare() && index < 9) {
				Frame nextFrame = frames.get(index + 1);
				score = score + 10 + nextFrame.getFirstThrow();
			} else {
				score = score + frame.getFirstThrow() + frame.getSecondThrow();
			}
			index++;
		}
		return score;
	}

	// return whether this is the last frame of the match
	public boolean isLastFrame() {
		return frameCounter == 10;
	}

	// return whether the next frame is a bonus frame
	public boolean isNextFrameBonus() {
		return frameCounter > 10;
	}
}
