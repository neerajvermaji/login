package com.farmersmart.Login.Entity;

//import java.util.List;
//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LoginRepository extends JpaRepository<LoginEntity, Integer> {

	//public Optional<LoginEntity> findPasswordById(int id);

	//public List<LoginEntity> updateUserByPassword(LoginEntity entity);

	

	

}
