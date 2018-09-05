package eventmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SampleController {

	@GetMapping("/")
	public String hello() {
		return "hello";
	}

	@GetMapping("/index")
	public String index() {

		return "index";
	}

	/**
	 * 画面から入力されたメッセージを受け取って表示する
	 * @param message メッセージ
	 * @param model モデル
	 * @return 入力画面
	 */
	@PostMapping("/index")
	public String send(@RequestParam String message,
			Model model) {
		model.addAttribute("message", message);


		return "index";
	}

}
