package com.example.registration.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.registration.Model.people;
import com.example.registration.Repository.InformationRepository;

@Service
public class peopleServiceImp implements peopleService{
	@Autowired
	private InformationRepository informationRepository;
	public void savePeople(people people) {
		this.informationRepository.save(people);
	}
}
