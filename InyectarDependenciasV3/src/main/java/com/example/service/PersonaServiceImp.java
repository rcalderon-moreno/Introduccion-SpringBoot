
package com.example.service;


import com.example.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImp implements IPersonaService {
    
    @Autowired   
    private IPersonaRepository personaRepository;
    
    @Override
    public void registrar(String nombre) {
        personaRepository.registrar(nombre);
    }    
}


