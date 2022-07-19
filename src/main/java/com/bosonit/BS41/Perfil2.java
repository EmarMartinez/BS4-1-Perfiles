package com.bosonit.BS41;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("perfil2")
public class Perfil2 implements Perfiles{
    @Override
    public void miFuncion() {
        System.out.println("Hola desde el perfil 2");
    }
}
