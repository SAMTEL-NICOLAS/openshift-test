package co.com.samtel.controller.restservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.samtel.controller.entity.UserEntity;
import co.com.samtel.controller.service.IUserService;

@Controller
@RestController
@RequestMapping("/v.1/user")
public class UserController {
	@Autowired
	IUserService IUserService;
	
	@RequestMapping(method = RequestMethod.GET, value="/saludo")
	public ResponseEntity<String> getSaludo(){
		return new ResponseEntity<>("Hola todos", HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/")
	public ResponseEntity<List<UserEntity>> getUser(){
		return new ResponseEntity<>(IUserService.getAllUsers(), HttpStatus.OK);
	}

}
