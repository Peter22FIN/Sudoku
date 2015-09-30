package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {
	
	String solution;

	public int verify(String candidateSolution) {
		solution = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		if (candidateSolution.equals(solution)){
			return 1;
		}
		else{
			return 0;
		}
		// returns 1 if the candidate solution is correct
	}
}
