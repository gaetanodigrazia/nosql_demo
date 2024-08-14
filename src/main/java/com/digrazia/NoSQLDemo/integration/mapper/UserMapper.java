package com.digrazia.NoSQLDemo.integration.mapper;


import com.digrazia.NoSQLDemo.business.model.dto.CreateUserDTO;
import com.digrazia.NoSQLDemo.business.model.dto.CreatedUserDTO;
import com.digrazia.NoSQLDemo.business.model.dto.UserDTO;
import com.digrazia.NoSQLDemo.business.model.domain.User;
import com.digrazia.NoSQLDemo.integration.persistence.entity.UserEntity;
import org.mapstruct.MapMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.LocalDateTime;

@Mapper(componentModel = "spring", imports ={LocalDateTime.class})
public interface UserMapper {
    User fromCreateUserDTOToUser(CreateUserDTO createUserDTO);

    CreatedUserDTO fromUserToCreatedUserDTO(User user);

    @Mapping(target="createdAt", expression = "java(LocalDateTime.now())")
    UserEntity fromUserToUserEntity(User user);

    User fromUserEntityToUser(UserEntity userEntity);

    UserDTO fromUserToUserDTO(User user);
}
