package co.com.samtel.controller.restservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/v.1/user")
public class UserController {
	
	@RequestMapping(method = RequestMethod.GET, value="/")
	public ResponseEntity<String> getSaludo(){
		return new ResponseEntity<>("Hola todos", HttpStatus.OK);
	}

}
