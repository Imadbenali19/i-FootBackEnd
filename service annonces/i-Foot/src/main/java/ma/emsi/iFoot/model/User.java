package ma.emsi.iFoot.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Document("users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Transient
	public static final String SEQUENCE_NAME="user_sequence";
	
	@jakarta.persistence.Id
	private int id;
	private String fullname;
	private String username;
	private String password;
	private String email;
	
	private List<Role> roles;
}
