package ma.emsi.iFoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.emsi.iFoot.model.User;
import ma.emsi.iFoot.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private SequenceGeneratorService sequenceGeneratorService;
	
	@Override
	public User createUser(User user) {
		user.setId(sequenceGeneratorService.getSequenceNumber(User.SEQUENCE_NAME));
		return userRepository.save(user);
	}

	@Override
	public User getUser(int id) {
		return userRepository.findById(id).get();
	}

	@Override
	public List<User> getUsers() {
		return userRepository.findAll();
	}

}
