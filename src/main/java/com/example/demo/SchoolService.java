package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolService {
	@Autowired
	private SchoolRepository schoolRepository;

	public void saveschool(School school) {
		// TODO Auto-generated method stub
		schoolRepository.save(school);

	}

	public List<School> findAll() {
		// TODO Auto-generated method stub

		return schoolRepository.findAll();
	}

	public Optional<School> findByid(long id) {
		// TODO Auto-generated method stub
		return schoolRepository.findById(id);
	}

	public void updateschool(Optional<School> data, School school) {
		// TODO Auto-generated method stub
		School sdata = data.get();
		sdata.setFirstName(school.getFirstName());
		sdata.setLastName(school.getLastName());
		sdata.setEmail(school.getEmail());
		sdata.setMobNo(school.getMobNo());
		sdata.setGender(school.getGender());
		sdata.setDob(school.getDob());
		sdata.setReligion(school.getReligion());
		sdata.setLanguage(school.getLanguage());
		sdata.setAddress(school.getAddress());
		sdata.setLandmark(school.getLandmark());
		sdata.setCity(school.getCity());
		sdata.setRegion(school.getRegion());
		sdata.setPincode(school.getPincode());
		sdata.setCountry(school.getCountry());
		sdata.setFfirstName(school.getFfirstName());
		sdata.setFlastName(school.getFlastName());
		sdata.setMfirstName(school.getMfirstName());
		sdata.setMlastName(school.getMlastName());
		schoolRepository.save(sdata);

	}

	public void deleteByid(long id) {
		// TODO Auto-generated method stub
		schoolRepository.deleteById(id);

	}

	public void saveschoolform(School school) {
		// TODO Auto-generated method stub
		schoolRepository.save(school);

	}

	public void saveschooll(School school) {
		// TODO Auto-generated method stub
		schoolRepository.save(school);
		
	}

}
