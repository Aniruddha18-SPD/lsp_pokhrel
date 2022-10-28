package org.howard.edu.lsp.midterm.problem1;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;


public class VotingMachine {
	// imported build-in classes
	static LinkedHashMap<String, Integer> voters = new LinkedHashMap<>();
	static Scanner  scanner = new Scanner(System.in);
	
	
	// sum
	public static int sum() {
		int res = 0;
		Set<String> votes = voters.keySet();
		for (String vote : votes) {
			res += voters.get(vote);
		}
		return res;
	}

	// getVotes
	public static int getVotes(String name) throws VotingMachineException  {
		if (voters.containsKey(name)) {
			int vote = voters.get(name);
			return vote;
		}
		else {
			throw new VotingMachineException();
		}
	}
	
	// addCandidate
	public static void addCandidate(String name) {
		// add the candidate to voters attribute with vote=0
		voters.put(name, 0);
	} 

	
	// castVotes
	public static void castVotes(String name, int votes) {
		voters.put(name,votes);
	}


	// main method
	public static void main(String[] args) throws VotingMachineException {
		//data representation to associate a name with respective votes
		
		boolean checker = true;
		
		while (checker) {
			System.out.println("Please enter a number from following: ");
			System.out.println("1. addCandidate");
			System.out.println("2. castVote");
			System.out.println("3. See Votes");
			System.out.println("4. See Overall Votes");
			
			int inp = scanner.nextInt();
			
			// Case - 1
			if (inp == 1) {
				scanner.nextLine();
				System.out.println("Enter candidate name: ");
				String name = scanner.nextLine();
				addCandidate(name);
			}
			
			// case - 2
			else if (inp == 2) {
				scanner.nextLine();
				
				// printing all the candidates
				System.out.println("All candidates: ");
				for (String n:voters.keySet()) {
					System.out.println(n);
				}
				
				// asking to cast vote
				System.out.println("\nEnter voter name: ");
				String name = scanner.nextLine();
				
				if (voters.containsKey(name)) {
					int vote = voters.get(name);
					vote = vote + 1;
					castVotes(name,vote);
				}
				else {
					throw new VotingMachineException();
				}
			}
			
			// case - 3
			else if (inp == 3) {
				scanner.nextLine();
				System.out.println("Enter candidates name to the vote of: ");
				String name = scanner.nextLine();
				System.out.println("votes: " + getVotes(name));
			}
			
			// case - 4
			else {
				System.out.println("The overall votes: " + sum());
			}
		}
	}
}