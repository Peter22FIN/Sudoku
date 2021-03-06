package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	@Test
	public void rightSolutionTest() {
		String candidateSolution = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		assertEquals(1, SudokuVerifier.verify (candidateSolution));
	}
	
	@Test
	public void wrongSolutionTest() {
		String candidateSolution = "123456789912345678891234567789123456678912345567891234456789123345678912234567891";
		assertEquals(0, SudokuVerifier.verify (candidateSolution));
	}
	
	@Test
	public void isPositiveTest() {
		String candidateSolution = "417369825";
		assertEquals(0, SudokuVerifier.positive (candidateSolution));
	}

	@Test
	public void isNotPositiveTest() {
		String candidateSolution = "4-17369825";
		assertEquals(-1, SudokuVerifier.positive (candidateSolution));
	}
	
	@Test
	public void noSameInRowTest() {
		String candidateSolution = "417369825";
		assertEquals(0, SudokuVerifier.row (candidateSolution));
	}
	
	@Test
	public void sameInRowTest() {
		String candidateSolution = "417669825";
		assertEquals(-3, SudokuVerifier.row (candidateSolution));
	}
	
	@Test
	public void noSameInColumnTest() {
		String candidateSolution = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		assertEquals(0, SudokuVerifier.column (candidateSolution));
	}
	
	@Test
	public void sameInColumnTest() {
		String candidateSolution = "417369825432158947958724316825437169791586432346912758289643571573291684164875293";
		assertEquals(-4, SudokuVerifier.column (candidateSolution));
	}
}
