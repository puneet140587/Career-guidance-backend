package com.puneet.blog.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.puneet.blog.entites.User;
import com.puneet.blog.payload.UserDTO;
import com.puneet.blog.repository.UserRepository;
import com.puneet.blog.services.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired 
	private UserRepository userRepository ;
	
	@Autowired
	private ModelMapper modelMapper ;
	
	private User dtoToUser(UserDTO userDTO) {
		User user = modelMapper.map(userDTO, User.class);
		return user ; 
	}
	
	private UserDTO userToDto(User user) {
		UserDTO userDto = modelMapper.map(user, UserDTO.class);
		return userDto ; 
	}

	@Override
	public UserDTO registerNewUser(UserDTO userDTO) {
		User user = modelMapper.map(userDTO, User.class);
		User newUser = userRepository.save(user);
		return modelMapper.map(newUser, UserDTO.class);
	}
	

}
