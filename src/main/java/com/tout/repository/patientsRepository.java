package com.tout.repository;

import com.tout.model.patientsEntity;
import com.tout.model.userSocio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface patientsRepository  extends CrudRepository<patientsEntity,Integer> {
}
