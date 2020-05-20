package com.tout.web;

import com.tout.model.patientsEntity;
import com.tout.model.usersEntity;
import com.tout.service.InterfazServicePatients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class patientsController {
    @Autowired
    private InterfazServicePatients serviceP;

    @GetMapping("/listarPacientes")
    public String listarPacientes(Model model){
        List<patientsEntity> p = serviceP.listar();
        model.addAttribute("patients",p);
        return "interfazPaciente";
    }

    @GetMapping("/nuevoPaciente")
    public String agregarPaciente(Model model){
        model.addAttribute("patients",new patientsEntity());
        return "crearPacienteForm";
    }

    @PostMapping("/guardarPaciente")
    public String guardarPaciente(@Valid patientsEntity p , Model model) {
        serviceP.save(p);
        return "redirect:/listarPacientes";
    }

    @GetMapping("/editarPac/{id}")
    public String editarPac(@PathVariable int id, Model model){
        Optional<patientsEntity> p = serviceP.listarId(id);
        model.addAttribute("patient", p);
        return "crearPacienteForm";
    }

    @GetMapping("/eliminarPac/{id}")
    public  String eliminarPac(Model model, @PathVariable int id){
        serviceP.delete(id);
        return "redirect:/listarPacientes";
    }
}
