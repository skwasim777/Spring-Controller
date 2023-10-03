package in.wasimIT;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
		@GetMapping("/get")
		public String getMassage() {
			return "Welcome to wasim It";
		}
}
