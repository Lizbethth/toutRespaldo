package com.tout.web;

import com.tout.model.usersEntity;
import com.tout.service.InterfazService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class usersControler {
    @Autowired
    private InterfazService service;

    @GetMapping("/listar")
    public String listar(Model model){
        List<usersEntity> u = service.listar();
        model.addAttribute("usuarios",u);
        return "interfazUsuario";
    }
}
