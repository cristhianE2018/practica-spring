package com.example.demo.controladores;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ControladorEjemplo {

    private static final Logger LOGGER = LoggerFactory.getLogger(ControladorEjemplo.class);


    @GetMapping("saludo")
    public ModelAndView mostrarInicio(){
        LOGGER.debug("mostrarInicio ()");
        ModelAndView mav = new ModelAndView("bienvenida");
        LOGGER.debug("bienvenida");
        return mav;
    }



}
