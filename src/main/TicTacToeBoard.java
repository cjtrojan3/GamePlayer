package main;

import java.awt.Graphics;
import java.awt.geom.Point2D;

public class TicTacToeBoard implements TwoPlayerGameBoard {
	
	private int nextOpenPosition;
	private int[] board = new int[9];
	private boolean nextMover;
	
	//Initial constructor
	public TicTacToeBoard() {
		this.nextOpenPosition = 0;
		for(int i = 0; i < this.board.length; ++i) {
			this.board[i] = -1;
		}
	}
	
	//Copy constructor
	public TicTacToeBoard(TicTacToeBoard parent) {
		this.nextOpenPosition = parent.nextOpenPosition;
		this.board = new int[9];
		for(int i = 0; i < parent.board.length; ++i) {
			this.board[i] = parent.board[i];
		}
	}

	@Override
	public boolean hasMoreChildren() {
		boolean hasMoreChildren = false;
		for(int i = 0; i < this.board.length; ++i) { 
			if(board[i] == -1) {
				hasMoreChildren = true;
			}
		}
		return hasMoreChildren;
	}

	@Override
	public TwoPlayerGameBoard nextChild() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double staticEvaluation() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isComputerWinner() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDraw() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isUserWinner() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void placeUserMove(Point2D mouseLocation) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	public String toString() {
		String toReturn = "Contents of the board:\n\n";
		for(int i = 0; i < board.length; ++i) {
			toReturn = toReturn + board[i] + " ";
			if(i % 3 == 0) {
				toReturn = toReturn + "\n";
			}
		}
		return toReturn;
	}
}
