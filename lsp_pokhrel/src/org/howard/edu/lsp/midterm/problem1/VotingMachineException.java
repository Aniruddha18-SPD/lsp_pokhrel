package org.howard.edu.lsp.midterm.problem1;

public class VotingMachineException extends Exception{
	private static final long serialVersionUID = 1L;
	public VotingMachineException() {
		super("This is not a candidate!");
	}
}