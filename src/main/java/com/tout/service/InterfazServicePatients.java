package com.tout.service;

import com.tout.model.patientsEntity;
import com.tout.model.userSocio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface InterfazServicePatients {
    public List<patientsEntity> listar();
    public Optional<patientsEntity> listarId(int id);
    public int save(patientsEntity p);
    public void delete(int id);
}
