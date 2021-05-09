// Template for UVa solutions
//
// Part of Project 462, a trip through the 462 starred problems
// at http://uhunt.felix-halim.net/id/570854
//
// To use this template, just remove the indicated code from
// parseNextTestCase(), and add yours. That function will run
// once for each test case.
//
// For more information, see http://www.redgreencode.com/about-project-462/

import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main
{
	public static void main(String args[]) {
		Main m = new Main();
		m.setupIO(new InputStreamReader(System.in), new OutputStreamWriter(System.out));
		m.run();
	}

	public void setupIO(Reader reader, Writer writer) {
		stdin = new BufferedReader(reader);
		stdout = new BufferedWriter(writer);
		sb = new StringBuilder(25000);

		// Uncomment if first input line is number of test cases
		//String sNumCases = getNextInputLine();
		//numCases = Integer.parseInt(sNumCases);
	}

	public void run() {
		long startTime = System.nanoTime();
		while (parseNextTestCase()) ;
		flushOutput();
		long stopTime = System.nanoTime();
		System.err.println((stopTime - startTime)/1000000);
	}

	// Module-level variables
	int numCases = 0;
	int caseNum = 0;
	Boolean debug = false;

	BufferedReader stdin;
	BufferedWriter stdout;
	StringBuilder sb;

	private Boolean parseNextTestCase() {
		if (!ready()) return false;
		//if (caseNum >= numCases) return false;

		// ********** Delete this code and add yours (start) **********
        // Read in i and j
        // int i, j;
        // res = getCollatzNumber(i, j)

		if (debug) writeln("Debug mode is on");
		// ********** Delete this code and add yours (end) **********

		caseNum++;
		return true;
	}

	// Helper classes
	// (add here if necessary)

	// Helper functions
	public Integer getCollatzNumber(int i, int j) {
		int maxLength = 1;
		int len;
		for (int i = i; i <= j; i++) {
			len = cycle(i);
			maxLength = len > maxLen ? len : maxLen;
		}
		return maxLength;
	}

	private Integer cycle(int i) {
		int len = 1;
		while (n >= 1) {
			n = n % 2 == 0 ? 3*n+1 : n/2;
			len++;
		}
		return len;
	}


}
