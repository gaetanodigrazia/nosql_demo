package com.digrazia.NoSQLDemo.business.API;


import com.digrazia.NoSQLDemo.business.model.dto.CreateUserDTO;
import com.digrazia.NoSQLDemo.business.model.dto.CreatedUserDTO;
import com.digrazia.NoSQLDemo.business.model.dto.UserDTO;
import org.springframework.validation.annotation.Validated;

public interface UserAPI {

    CreatedUserDTO createUser(@Validated CreateUserDTO createUserDTO);

    UserDTO findById(String id);
}
