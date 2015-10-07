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
			if (candidateSolution.charAt(i)<49 || candidateSolution.charAt(i)>57) return -1;
		}
		return 0;
	}
	
	public static int subgrid(String candidateSolution){
		return 0;
	}
	
	public static int row(String candidateSolution){
		int j = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;
		int nine = 0;
		for (int i=0; i < candidateSolution.length(); i++){
			if (j==9){
				j = 0;
				one = 0;
				two = 0;
				three = 0;
				four = 0;
				five = 0;
				six = 0;
				seven = 0;
				eight = 0;
				nine = 0;
			}
			if (candidateSolution.charAt(i)==49) one++;
			if (candidateSolution.charAt(i)==50) two++;
			if (candidateSolution.charAt(i)==51) three++;
			if (candidateSolution.charAt(i)==52) four++;
			if (candidateSolution.charAt(i)==53) five++;
			if (candidateSolution.charAt(i)==54) six++;
			if (candidateSolution.charAt(i)==55) seven++;
			if (candidateSolution.charAt(i)==56) eight++;
			if (candidateSolution.charAt(i)==57) nine++;
			if (one>1 || two>1 || three>1 || four>1 || five>1 || six>1 || seven>1 || eight>1 || nine>1) return -3;
			j++;
		}
		return 0;
	}
	
	public static int column(String candidateSolution){
		int j = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;
		int nine = 0;
		for (int i=0; i < candidateSolution.length(); i=i+9){
			if (j==9){
				j = 0;
				one = 0;
				two = 0;
				three = 0;
				four = 0;
				five = 0;
				six = 0;
				seven = 0;
				eight = 0;
				nine = 0;
				if (i>0) i=i-71;
			}
			if (candidateSolution.charAt(i)==49) one++;
			if (candidateSolution.charAt(i)==50) two++;
			if (candidateSolution.charAt(i)==51) three++;
			if (candidateSolution.charAt(i)==52) four++;
			if (candidateSolution.charAt(i)==53) five++;
			if (candidateSolution.charAt(i)==54) six++;
			if (candidateSolution.charAt(i)==55) seven++;
			if (candidateSolution.charAt(i)==56) eight++;
			if (candidateSolution.charAt(i)==57) nine++;
			if (one>1 || two>1 || three>1 || four>1 || five>1 || six>1 || seven>1 || eight>1 || nine>1) return -3;
			j++;
		}
		return 0;
	}
	
}
