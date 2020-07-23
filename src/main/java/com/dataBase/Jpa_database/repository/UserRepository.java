package com.dataBase.Jpa_database.repository;

import com.dataBase.Jpa_database.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {

}
