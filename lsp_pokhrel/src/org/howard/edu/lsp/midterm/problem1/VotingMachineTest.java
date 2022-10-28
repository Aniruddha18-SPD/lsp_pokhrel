package org.howard.edu.lsp.midterm.problem1;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class VotingMachineTest {

	// testing getVotes
	@Test
	@DisplayName("Test cases for getVotes")
	public void testgetVotes() throws VotingMachineException{
		VotingMachine machine = new VotingMachine(); 

		machine.addCandidate("Anirudd");
		machine.addCandidate("John");
		machine.addCandidate("parat");
		
		machine.castVotes("Anirudd", 10);
		machine.castVotes("John", 20);
		machine.castVotes("parat", 30);
		
    
		assertNotEquals("error found in getVotes()", 200, machine.getVotes("John"));
		assertEquals("error found in getVotes()", 20, machine.getVotes("John"));
    
		assertEquals("error found in getVotes()", 30, machine.getVotes("parat"));
		assertNotEquals("error found in getVotes()", 300, machine.getVotes("John"));
		
		assertEquals("error found in getVotes()", 10, machine.getVotes("Anirudd"));
		assertNotEquals("error found in getVotes()", 100, machine.getVotes("Anirudd"));
	}

	
	// Testing Sum
	@Test
	@DisplayName("Testcases for Sum")
	public void testSum() {
		VotingMachine virtual = new VotingMachine();
		// adding candidates
		virtual.addCandidate("Nick");
		virtual.addCandidate("Ram");
		virtual.castVotes("Nick", 10);
		virtual.castVotes("Ram", 20);
		
		assertNotEquals("error found in sum()", 100, virtual.sum());
		assertEquals("error found in sum()", 90, virtual.sum());
	}

	@Test
	@DisplayName("testgetVotes Exception")
	public void testgetVotes_THROWS_EXCEPTION() {
		VotingMachine vm2 = new VotingMachine();
		Exception exception = assertThrows(VotingMachineException.class, ()->{
			vm2.getVotes("Unknown");
		});
		String expectedMessage = "This is not a candidate!";
		String actualMessage = exception.getMessage();
		assertTrue(actualMessage.contains(expectedMessage));
	}
}