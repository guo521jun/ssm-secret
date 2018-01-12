package com.edu.xupt.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.edu.xupt.entities.Secret;
import com.edu.xupt.service.SecretService;

@Controller
public class SecretController {

	@Autowired
	private SecretService secretService;
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String register(HttpServletRequest request, Model model) {
		String user = request.getParameter("user");
		String password = request.getParameter("password");
		int flag = 0;
		if (!user.equals("")) {
			Secret secret = secretService.get(user);
			if (secret != null) {
				flag = secret.getIsHandled();
			}
			if (flag == 0) {
				int count = secretService.register(user, password);
				secretService.update(user, 1);
				if (count > 0) {
					secret = secretService.get(user);
					model.addAttribute("secret", secret);
					return "display";
				}
				
			}
			
		}
		return "redirect:register";
		
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(HttpServletRequest request, Model model) {
		String user = request.getParameter("user");
		String password = request.getParameter("password");
		if (user.equals("") && password.equals("")) {
			return "redirect:index.jsp";
		} else {
			Secret secret = secretService.get(user);
			if (secret != null) {
				String pw = secret.getPassword();
				if (password.equals(pw)) {
					return "detail";
				} else {
					return "redirect:index.jsp";
				}
			} else {
				return "redirect:index.jsp";
			}
		}
	}
	
	@RequestMapping(value="/encrytion", method=RequestMethod.GET)
	public String encode(HttpServletRequest request, Model model) {
		String msg = request.getParameter("msg");
		String user = request.getParameter("user");
		if (msg.equals("") && user.equals("")) {
			return "error";
		} else {
			Secret secret = secretService.get(user);
			if (secret != null) {
				secret.setMsg(msg);
				String encodeMsg = secretService.encode(secret);
				model.addAttribute("encode", secret);
				return "detail";
			} else {
				return "error";
			}
			
		}
		
		
	}
	
}
