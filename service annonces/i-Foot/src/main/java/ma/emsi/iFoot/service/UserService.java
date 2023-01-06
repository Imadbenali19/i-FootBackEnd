package ma.emsi.iFoot.service;

import java.util.List;

import ma.emsi.iFoot.model.User;

public interface UserService {

	User createUser(User user);
	User getUser(int id);
	List<User> getUsers();
}
