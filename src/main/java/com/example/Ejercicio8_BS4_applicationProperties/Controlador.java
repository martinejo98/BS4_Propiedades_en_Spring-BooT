package com.example.Ejercicio8_BS4_applicationProperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@ConfigurationProperties
@RestController
public class Controlador {

    //Puedo crear los valores aquí o junto con la función
    //@Value("${VAR1}")
    //String var1;
    //@Value("${My.VAR2}")
    //int var2;

    @GetMapping("/valores")
    public String valores(@Value("${VAR1}") String var1, @Value("${My.VAR2}") int var2){    //Los valores que pido del sistema son los que estan en @Value("${valor1")
        return "Este es el valor de mi var1: "+var1+", y este el valor de mi var2: "+var2;
    }

    @GetMapping("/valor3")
    public String valor3(@Value("${VAR3: No tiene valor}") String var3){ //Si en el application.properties no tengo valor alguno para esa variable, puedo definirle un valor por defecto de esta manera
        return "El valor de var3 es: "+var3;    //Si creo la variable VAR3 en el application.properties me cogerá el valor que le he asigando ahí y no el valor por defecto que le he asignado aquí
    }
}
