//Author: Kariny Oliveira
//Student Number: CT1004878

import java.util.HashSet;
import java.util.Set;

public class TestCase {

	/*
	 * testCaseID (unique identifier)
	 * testSteps (instructions to execute the test)
	 * expectedOutcome (expected result after executing test steps)
	 * 
	 * For encapsulation:
	 * Make all attributes private.
	 * Provide getters and setters for each attribute, but ensure that the testCaseID 
	 * can only be set once and not modified thereafter.
	 * Implement a constructor to initialize testCaseID, testSteps, and expectedOutcome.
	 */
	
	private String testCaseID;
	private String testSteps;
	private String expectedOutcome;

	
	private static final Set<String> testCaseIDSet = new HashSet<String>();
	
	//No-Arg Constructor
	public TestCase() {
		super();
	}

	// Parameterized Constructor and add Test Case ID to Hash Set
	public TestCase(String testCaseID, String testSteps, String expectedOutcome) {
		this.testCaseID = testCaseID;
		this.testSteps = testSteps;
		this.expectedOutcome = expectedOutcome;
		testCaseIDSet.add(testCaseID);
	}
	
	//Set Method to validate the TestCaseID
	public void setTestCaseID (String testID) throws UnsupportedOperationException{
        if (testCaseIDSet.contains(testID))
            throw new UnsupportedOperationException("TestCaseID can only be set once and  can not be modified!!!");
        if (this.testCaseID != null)
            testCaseIDSet.remove(this.testCaseID);
        testCaseIDSet.add(testID);
        this.testCaseID = testID;         
   }

	// Getter for testCaseID
	public String getTestCaseID() {
		return testCaseID;
	}

	// Getter for testSteps
	public String getTestSteps() {
		return testSteps;
	}

	// Setter for testSteps
	public void setTestSteps(String testSteps) {
		this.testSteps = testSteps;
	}

	// Getter for expectedOutcome
	public String getExpectedOutcome() {
		return expectedOutcome;
	}

	// Setter for expectedOutcome
	public void setExpectedOutcome(String expectedOutcome) {
		this.expectedOutcome = expectedOutcome;
	}

	public static void main(String[] args) {
		// Create a few TestCase objects using Constructor
		TestCase testCase1 = new TestCase("TC001", "Step 1: Open browser\nStep 2: Click on Exit Button", "The browser should close");
		TestCase testCase2 = new TestCase("TC002", "Step 1: Open phone application\nStep 2: Click on Dial Pad", "The dial numbers should appear");
		TestCase testCase3 = new TestCase();

		// Modify some attributes using setter
		testCase1.setTestSteps("Step 1: Open browser\nStep 2: Press ALT+F4");
		testCase1.setExpectedOutcome("The browser should close after the keyboard input");

		// Print details using getters
		System.out.println("============== TEST CASE 1 =============");
		System.out.println("Test Case 1 ID: " + testCase1.getTestCaseID());
		System.out.println("Test Case 1 Steps: " + testCase1.getTestSteps());
		System.out.println("Test Case 1 Expected Outcome: " + testCase1.getExpectedOutcome());
		
		System.out.println("============== TEST CASE 2 =============");
		System.out.println("Test Case 2 ID: " + testCase2.getTestCaseID());
		System.out.println("Test Case 2 Steps: " + testCase2.getTestSteps());
		System.out.println("Test Case 2 Expected Outcome: " + testCase2.getExpectedOutcome());

		// Test same Test Case ID | Uncomment to trigger exception
		//testCase3.setTestCaseID("TC001");
		
		// Test modifying a test case ID | Uncomment to trigger exception
		//testCase1.setTestCaseID("TC003");
	    }
}

	
	

