package com.farmersmart.Login.Service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farmersmart.Login.Entity.LoginEntity;
import com.farmersmart.Login.Entity.LoginRepository;

//import ch.qos.logback.classic.Logger;
@Service
public class LoginService {
	private static final Logger logger = LoggerFactory.getLogger(LoginService.class);

	@Autowired
	LoginRepository loginRepository;
	
	
	public String addUserId(LoginEntity entity) {
		// TODO Auto-generated method stub
		System.out.println(entity.toString());
		logger.info(entity.toString());
		loginRepository.save(entity);
		return "Record has been added successfully";
	}

	public List<LoginEntity> getUserDetails() {
		// TODO Auto-generated method stub
		return loginRepository.findAll();
	}

	public Optional<LoginEntity> getpassWordById(int id) {
		// TODO Auto-generated method stub
		return loginRepository.findById(id);
	}

	public String updateUserByPassword(LoginEntity entity) {
		// TODO Auto-generated method stub
		 loginRepository.save(entity);
		 return "record has been updated successufully";
	}

	public String deleteById(int id) {
		// TODO Auto-generated method stub
		String message;
		try {
		message="Record has been deleted successfully";
		loginRepository.deleteById(id);
		logger.info(message);
		}catch(Exception e) {
		message="Invalid id";
		logger.error(message);
		}return message;
			
		}
	
	

}
