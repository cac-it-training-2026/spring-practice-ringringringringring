package jp.co.sss.practice.p02.q02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Practice0202Controller {
	@RequestMapping(path = "/show/redirect_page")
	public String p0202first() {
		return "practice02/02/redirect_link";
	}

	@RequestMapping(path = "/absolute")
	public String p0202second() {
		return "redirect:https://www.google.co.jp";
	}

	@RequestMapping(path = "/relative")
	public String p0202third() {
		return "redirect:/result";
	}

	@RequestMapping(path = "/result")
	public String p0202forth() {
		return "practice02/02/redirect_result";
	}
}