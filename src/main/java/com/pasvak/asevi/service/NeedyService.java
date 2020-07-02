package com.pasvak.asevi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pasvak.asevi.model.Needy;
import com.pasvak.asevi.repository.NeedyRepository;

@Service
public class NeedyService {
	@Autowired
	private NeedyRepository needyRep;

	public List<Needy> listAll() {
		return needyRep.findAll();
	}

	public void save(Needy needy) {
		needyRep.save(needy);

	}

	public Needy get(Long id) {
		return needyRep.findById(id).get();
	}

	public void delete(Long id) {
		needyRep.deleteById(id);
	}
}
