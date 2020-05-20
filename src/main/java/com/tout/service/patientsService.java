package com.tout.service;

import com.tout.model.patientsEntity;
import com.tout.model.userSocio;
import com.tout.repository.patientsRepository;
import com.tout.repository.userSocioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class patientsService  implements InterfazServicePatients{
    @Autowired
    private patientsRepository dataPaciente;

    @Override
    public List<patientsEntity> listar() {
        return (List<patientsEntity>) dataPaciente.findAll();
    }

    @Override
    public Optional<patientsEntity> listarId(int id) {
        return dataPaciente.findById(id);
    }

    @Override
    public int save(patientsEntity p){
    int res=0;
    patientsEntity pa =  dataPaciente.save(p);
        if (!pa.equals(null)){
        res=1;
    }
        return res;
    }

    @Override
    public void delete(int id) {
        dataPaciente.deleteById(id);
    }
}
