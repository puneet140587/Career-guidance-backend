package com.puneet.blog.controller;

import java.time.LocalDateTime;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.puneet.blog.payload.UserDTO;
import com.puneet.blog.services.UserService;

@RestController
@RequestMapping("/api/v1")
public class UserController {

//	@Autowired
//	private UserService userService;
//	
//	LocalDateTime localDateTime = LocalDateTime.now();
//
//	@PostMapping("/")
//	public ResponseEntity<UserDTO> CreateNewUser(@Valid @RequestBody UserDTO userDto) {
//		UserDTO createUserDto = userService.createUser(userDto);
//		return new ResponseEntity<>(createUserDto, HttpStatus.CREATED);
//	}

}
