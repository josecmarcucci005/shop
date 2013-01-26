package com.marcucci.demo.web.controller.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marcucci.demo.service.user.UserService;
import com.marcucci.demo.web.controller.AbstractController;
import com.marcucci.demo.web.view.ViewCONST;

@Controller
@RequestMapping(ViewCONST.ADMIN)
public class LoginController extends AbstractController {
	
	@Autowired
	private UserService userService; 
					
	@RequestMapping(value = ViewCONST.ADMIN_VIEW_HOME,method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		return ViewCONST.ADMIN_VIEW_HOME;
	}
	 
	@RequestMapping(value = ViewCONST.ADMIN_VIEW_LOGINFAILED, method = RequestMethod.GET)
	public String loginerror(ModelMap model) {

		model.addAttribute("error", "true");
		
		return ViewCONST.ADMIN_VIEW_LOGIN;
 
	}
 
	@RequestMapping(value = ViewCONST.ADMIN_VIEW_LOGOUT , method = RequestMethod.GET)
	public String logout(ModelMap model) {
		return ViewCONST.ADMIN_VIEW_LOGIN;
	}
	
	@RequestMapping(value = ViewCONST.ADMIN_VIEW_LOGIN, method = RequestMethod.GET)
	public String login(ModelMap model) {
		return ViewCONST.ADMIN_VIEW_LOGIN;
	}


}
