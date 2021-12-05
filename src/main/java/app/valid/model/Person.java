package app.valid.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

	@NotNull
	@Size(min = 2, max = 15, message = "Name Should be more then 2 wordes!")
	private String name;

	@NotNull(message = "email filed should not be empty! ")
	@Email(regexp = "^(.+)@(\\S+) $.", message = "Invalid Email!")
	private String email;

	@Pattern(regexp = "[7-9][0-9]{9}", message = "invalid mobile number!")
	@Size(max = 10, message = "digits should be more than 10!")
	private String phon;

}
