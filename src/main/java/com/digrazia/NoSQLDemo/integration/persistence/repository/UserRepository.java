package com.digrazia.NoSQLDemo.integration.persistence.repository;


import com.digrazia.NoSQLDemo.integration.persistence.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<UserEntity, String> {

    Optional<UserEntity> findById(String id);

    UserEntity save(UserEntity user);
}
