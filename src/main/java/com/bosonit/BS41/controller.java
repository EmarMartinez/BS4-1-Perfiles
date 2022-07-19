package com.bosonit.BS41;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @Autowired
    Parametros parametros;

    @Autowired
    Configuracion misParametros;

    @Autowired
    Perfiles perfil;

    @Autowired
    private org.springframework.core.env.Environment environment;

    @GetMapping("/parametros")
    public String getParametros(){
        return "url: " + parametros.getUrl() + " pass: " + parametros.getPassword();
    }

    @GetMapping("/miconfiguracion")
    public String getMisParametros(){
        return "url: " + parametros.getUrl() + " pass: " + parametros.getPassword() + " value1: " + misParametros.getValor1() + " value2: " + misParametros.getValor2();
    }

    @GetMapping("/perfil")
    public String[] getPerfil() {
        perfil.miFuncion();
        return environment.getActiveProfiles();
    }

}
