package com.tout.repository;

import com.tout.model.userSocio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userSocioRepository extends CrudRepository<userSocio,Integer> {


}
