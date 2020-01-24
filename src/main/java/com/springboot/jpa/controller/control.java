package com.springboot.jpa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.springboot.jpa.beans.usuario;
import com.springboot.jpa.services.serv;

@RestController
public class control {
    
    @Autowired
    serv servicio;
    
    @RequestMapping(value = "/test")
    public String hola() {
        return "hola spring";
    }

    @RequestMapping(value = "/api", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public String create(RequestEntity<Object> request) {
        return servicio.mensaje();
    }

    @RequestMapping(value = "/guardar", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String guardar(@RequestBody usuario usr) {
        return servicio.guardar(usr);
    }

    @RequestMapping(value = "/todo", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<usuario> all() {
        return servicio.findAll();
    }

    @RequestMapping(value = "/uno", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public usuario one(RequestEntity<Object> request) {
        return servicio.porpersona(request);
    }

    @RequestMapping(value = "/borra", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public usuario borrar(RequestEntity<Object> request) {
        return servicio.erase(request);
    }
}