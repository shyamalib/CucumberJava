package StepDefinitions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class TestExecutionController {
	@Autowired 
	TestRunner testRunner;
	
	@GetMapping("/")
	public String home() {
		
		return "index";
	}
	
	
	@PostMapping("/execute-tests")
	@ResponseBody
	public String executeTests(Model model) {
		System.out.println("inside execute method");
		// execute cucumber tests using  TestRunner class
		//Manually trigger the cucumber tests
		String testExecutionResult = testRunner.run();
		
		System.out.println("outside execute method");
		
		//Pass the test execution result to the UI
		model.addAttribute("testExecutionResult", testExecutionResult);
		
		return "Tests executed";
		
		
	}

}
