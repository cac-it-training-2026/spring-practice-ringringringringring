package jp.co.sss.practice.p04.q01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.practice.p04.q01.form.BmiForm;

@Controller
public class Practice0401Controller {
	@RequestMapping(path = "/bmi/input", method = RequestMethod.GET)
	public String q0401first() {
		return "practice04/01/bmi_input";
	}

	@RequestMapping(path = "/bmi/result", method = RequestMethod.POST)
	public String q0401second(BmiForm bmiForm, Model model) {
		Double weight = bmiForm.getWeight();
		Double height = bmiForm.getHeight() / 100;
		bmiForm.setBmi(weight / (height * height));//答え写した

		model.addAttribute("bmiForm", bmiForm);
		return "practice04/01/bmi_result";
	}

}
