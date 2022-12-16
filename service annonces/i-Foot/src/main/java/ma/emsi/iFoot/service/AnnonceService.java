package ma.emsi.iFoot.service;

import java.util.List;

import ma.emsi.iFoot.model.Annonce;
import ma.emsi.iFoot.model.User;

public interface AnnonceService {

	Annonce createAnnonce(Annonce annonce);
	Annonce updateAnnonce(Annonce annonce);
	void deleteAnnonce(Long id);
	Annonce getAnnonce(Long id);
	List<Annonce> getAnnonces();
	
	boolean requestJoinAnnonce(User user, Annonce annonce);
}
