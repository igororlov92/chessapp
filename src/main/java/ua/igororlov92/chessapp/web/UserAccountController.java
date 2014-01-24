package ua.igororlov92.chessapp.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ua.igororlov92.chessapp.model.Event;
import ua.igororlov92.chessapp.model.UserAccount;
import ua.igororlov92.chessapp.services.UserAccountService;

@Controller
@RequestMapping("/users")
public class UserAccountController {
	
	@Autowired
	private UserAccountService userAccountService;
	
	private static final Logger logger = LoggerFactory.getLogger(UserAccountController.class);
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getUsersPage() {
		
		logger.info("Inside users page");
		ModelAndView modelAndView = new ModelAndView("users");
		
		List<UserAccount> userAccounts = userAccountService.testGetUserAccounts();
		modelAndView.addObject("userAccounts", userAccounts);
		
		return modelAndView; 
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public String getOneUserPage(@PathVariable("id") Long id) {
		logger.info("Inside one user page: " + id);
		return "oneUser"; // TODO rename  
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	public void deleteOneUserPage(@PathVariable("id") Long id) {
		logger.info("Inside delete user page " + id);
	}
	
}