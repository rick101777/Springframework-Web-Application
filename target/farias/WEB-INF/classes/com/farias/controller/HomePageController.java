package com.farias.controller


@Controller
public class HomePageController {
	
	@RequestMapping("/farias/")
	public String loginMessage() {
		return "Welcome";
	}
}
