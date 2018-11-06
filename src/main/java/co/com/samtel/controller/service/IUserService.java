package co.com.samtel.controller.service;

import java.util.List;

import co.com.samtel.controller.entity.UserEntity;

public interface IUserService {
	
	List<UserEntity> getAllUsers();
	
	UserEntity saveUser(UserEntity user);
}
