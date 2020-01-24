package com.springboot.jpa.services;

import com.springboot.jpa.beans.usuario;
import java.util.List;
import org.springframework.http.RequestEntity;

public interface serv {

    public String mensaje();

    public String guardar(usuario usr);

    public List<usuario> findAll();

    public usuario porpersona(RequestEntity<Object> request);

    public usuario erase(RequestEntity<Object> request);

}
