package ballandpaddle.base;

import java.util.*;

import renderer.Game;

import ballandpaddle.base.BAPObject.Shape;

public class Main {


	public static void main(String[] args) {
		Level level = Level.getInstance();
		
		
		/**
		 * TestLevel stuff
		 */
		Paddle testPaddle = new Paddle("testP", 2, 4, 0, 1, Shape.rectangle);
		List<Paddle> testPads = new ArrayList<Paddle>();
		testPads.add(testPaddle);
		Ball testBall = new Ball("testB", 3, 4);
		List<Ball> testBalls = new ArrayList<Ball>();
		testBalls.add(testBall);
		List<String> impBlocks = new ArrayList<String>();
		impBlocks.add("....."); impBlocks.add("..A.."); impBlocks.add(".BBB.");
		impBlocks.add("....."); impBlocks.add(".....");
		Block A = new Block("A", 0, 0, 0, 0, 0, null);
		Block B = new Block("B", 0, 0, 0, 0, 0, null);
		List<Block> uniqBlocks = new ArrayList<Block>();
		uniqBlocks.add(A); uniqBlocks.add(B);
		Level testLevel = new Level("test", testPads, testBalls, impBlocks);
		testLevel.generateBlocks(uniqBlocks);		
		Game testGame = new Game(testLevel, 100.0);
		level.print();
		
		
		testGame.start();
	}

}
