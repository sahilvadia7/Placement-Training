package com.group1.shoppingmall.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.group1.shoppingmall.model.User;

import jakarta.transaction.Transactional;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{
	
//	
//	@Modifying
//    @Transactional
//    @Query(value = "INSERT INTO app_user (name, password, type) VALUES (:#{#user.name}, :#{#user.password}, :#{#user.type}) RETURNING *", nativeQuery = true)
//    User addUser(@Param("user") User user);
	
//	public User addUser(User user);
//	public User updateUser(User user);
//	public User deleteUser(long id);

}
