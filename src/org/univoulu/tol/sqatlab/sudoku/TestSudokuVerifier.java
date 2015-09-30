package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	@Test
	public void test() {
		String candidateSolution = "";
		int verify = SudokuVerifier.verify (candidateSolution);
		assertEquals(1, verify);
	}

}
