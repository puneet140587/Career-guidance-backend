package com.puneet.blog.payload;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserDTO {

	private int id;
	@Size(min = 4, message = "Username must be of min 4 Character")
	@NotEmpty(message = "Name can't be empty")
	private String name;
	@NotEmpty(message = "Email can't be empty")
	private String email;
	@Size(min = 10, message = "Phone no must be of minimu 10 number ")
	@NotEmpty
	private String phoneNo;
	@NotBlank
	private String query;

	

}
