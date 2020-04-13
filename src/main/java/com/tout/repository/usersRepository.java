package com.tout.repository;


import com.tout.model.usersEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface usersRepository extends CrudRepository<usersEntity, Integer> {


}