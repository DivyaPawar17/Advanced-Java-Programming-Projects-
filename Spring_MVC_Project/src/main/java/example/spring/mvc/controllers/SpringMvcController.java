package example.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import example.spring.mvc.model.User;
import example.spring.mvc.model.UserValidator;

@Controller  //This Marks the class as a controller
public class SpringMvcController {
	@RequestMapping("/greet")  //This marks the method as a request handling method
	public String getIndexPage() {
		//This method gets invoked when client requests for the resource with URL : /greet
		return "index";//It is View Name
	}

	@RequestMapping("/showLogin")
	public String getLoginPage() {
		return "Login";
	}
	@RequestMapping(value="/doValidate", method = RequestMethod.POST)
	public String doValidateUser(
			@RequestParam("user_name")String uid,  //String uid = request.getParameter("user_name");
			@RequestParam("user_password")String pwd) {
		User userObj = new User(uid, pwd);
		boolean valid =UserValidator.isValid(userObj);
		String resultPage = "failure";
		if(valid)
			resultPage = "success";
		return resultPage;
		
		
	}
}
