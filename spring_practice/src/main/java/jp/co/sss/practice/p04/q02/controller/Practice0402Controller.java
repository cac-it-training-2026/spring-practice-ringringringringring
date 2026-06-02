package jp.co.sss.practice.p04.q02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpSession;

@Controller
public class Practice0402Controller {
	@RequestMapping(path = "/numguess/start", method = RequestMethod.GET)
	public String p0402first(HttpSession session) {
		Integer hitNumber = (int) (Math.floor(Math.random() * 9) + 1);
		session.setAttribute("hitNumber", hitNumber);
		System.out.println("当たりの数値: " + hitNumber);
		return "practice04/02/numguess_start";
	}

	@GetMapping(path = "/numguess/input")
	public String p0402second() {
		return "practice04/02/numguess_input";
	}

	@GetMapping(path = "/numguess/judge")
	public String p0402third(HttpSession session, Integer inputNum) {
		Integer hitNumber = (Integer) session.getAttribute("hitNumber");
		if (hitNumber.equals(inputNum)) {
			return "redirect:/numguess/hit";
		} else {
			return "practice04/02/numguess_judge";
		}
	}

	@GetMapping(path = "/numguess/hit")
	public String p0402forth(Model model, HttpSession session) {
		Integer hitNumber = (Integer) session.getAttribute("hitNumber");
		String message = "当たりです！ 正解は" + hitNumber + "でした。";
		model.addAttribute("message", message);
		session.removeAttribute("hitNumber");
		return "practice04/02/numguess_end";
	}

}
