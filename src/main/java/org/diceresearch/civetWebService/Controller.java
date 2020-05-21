package org.diceresearch.civetWebService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@PostMapping("/example")
	  String Example(@RequestBody String example) {
	    return "Hello "+ example;
	  }
}
