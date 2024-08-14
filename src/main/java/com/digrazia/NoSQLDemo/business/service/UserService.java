package com.digrazia.NoSQLDemo.business.service;


import com.digrazia.NoSQLDemo.business.model.domain.User;

public interface UserService {
   User createUser(User userToCreate);

   User findById(String id);
}
