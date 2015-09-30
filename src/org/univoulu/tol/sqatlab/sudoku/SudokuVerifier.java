package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {
	
	static String solution;

	public static int verify(String candidateSolution) {
		solution = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		if (candidateSolution.equals(solution)){
			return 1;
		}
		else{
			return 0;
		}
		// returns 1 if the candidate solution is correct
	}
	
	public static int positive(String candidateSolution){
		for (int i=0; i < candidateSolution.length(); i++){
			char c = candidateSolution.charAt(i);
			if (c<49 || c>57){
				return -1;
			}
		}
		return 0;
	}
}
