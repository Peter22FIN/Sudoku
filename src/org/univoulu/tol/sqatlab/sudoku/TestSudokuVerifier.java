package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	@Test
	public void wrongSolutionTest() {
		String candidateSolution = "123456789912345678891234567789123456678912345567891234456789123345678912234567891";
		int verify = SudokuVerifier.verify (candidateSolution);
		assertEquals(0, verify);
	}
	
	@Test
	public void rightSolutionTest() {
		String candidateSolution = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		int verify = SudokuVerifier.verify (candidateSolution);
		assertEquals(1, verify);
	}

}
