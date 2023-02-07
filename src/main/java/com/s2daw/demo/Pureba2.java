package com.s2daw.demo;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

public class Pureba2 {
    @RequestMapping (value="prueba")
    public List<String> prueba(){
        List<String> lista= Arrays.asList("prueba","prueba2","prueba3");
        return lista;
    }
}
