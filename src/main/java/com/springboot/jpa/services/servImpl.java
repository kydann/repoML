package com.springboot.jpa.services;

import com.springboot.jpa.beans.usuario;
import com.springboot.jpa.repositories.repo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;

@Service
public class servImpl implements serv{
    
    @Autowired
    private repo imp;
    
    @Override
    public String mensaje() {
        
        return imp.mensaje();
        
    }

    @Override
    public String guardar(usuario usr) {
        return imp.guardar(usr);
    }

    @Override
    public List<usuario> findAll() {
        return imp.getAll();
    }
    
    @Override
    public usuario porpersona(RequestEntity<Object> request){
        return imp.findbyId(request);
    }
    
    @Override
    public usuario erase(RequestEntity<Object> request){
        return imp.findbyId(request);
    }

}
