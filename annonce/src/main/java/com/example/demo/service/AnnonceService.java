package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Annonce;
import com.example.demo.model.User;


public interface AnnonceService {

	Annonce createAnnonce(Annonce annonce);
	Annonce updateAnnonce(Annonce annonce);
	void deleteAnnonce(Long id);
	Annonce getAnnonce(Long id);
	List<Annonce> getAnnonces();
	
	boolean requestJoinAnnonce(User user, Annonce annonce);
}
