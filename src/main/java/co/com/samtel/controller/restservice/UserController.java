package co.com.samtel.controller.restservice;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.samtel.controller.dto.UserDTO;
import co.com.samtel.controller.entity.UserEntity;
import co.com.samtel.controller.service.IUserService;

@Controller
@RestController
@RequestMapping("/v.1/user")
public class UserController {
	@Autowired
	IUserService IUserService;

	@Autowired
	ModelMapper modelMapper;

	@RequestMapping(method = RequestMethod.GET, value = "/saludo")
	public ResponseEntity<String> getSaludo() {
		return new ResponseEntity<>("Hola todos", HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/")
	public ResponseEntity<UserDTO[]> getUser() {
		return new ResponseEntity<>(modelMapper.map(IUserService.getAllUsers(), UserDTO[].class), HttpStatus.OK);
	}

	@PostMapping("/")
	public ResponseEntity<UserDTO> save(@RequestBody(required = true) UserDTO user) {
		return new ResponseEntity<>(
				modelMapper.map(IUserService.saveUser(modelMapper.map(user, UserEntity.class)), UserDTO.class),
				HttpStatus.OK);
	}

}
