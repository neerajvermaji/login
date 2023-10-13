package com.farmersmart.Login.Controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.farmersmart.Login.Entity.LoginEntity;
import com.farmersmart.Login.Service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	LoginService loginService;
	
	@PostMapping("/addUserId")
	public String addUserId(@RequestBody LoginEntity entity ) {
		String response=loginService.addUserId(entity);
		logger.info(response);
		return response;
	}
	@GetMapping("/getUserDetails")
	public List<LoginEntity> getUserDetails(){
		return loginService.getUserDetails();
	}
	@GetMapping("/getpassWordById")
	public Optional<LoginEntity> getpassWordById(@RequestParam int id){
		return loginService.getpassWordById(id);
	}
	@PutMapping("/updateUserByPassword")
	public String updateUserByPassword(@RequestBody LoginEntity entity){
		return loginService.updateUserByPassword(entity);
	}
	@DeleteMapping("/deleteById")
	public String deleteById(@RequestParam int id) {
		return loginService.deleteById(id);
	}

}
