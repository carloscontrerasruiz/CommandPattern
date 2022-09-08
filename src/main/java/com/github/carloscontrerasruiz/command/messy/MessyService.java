package com.github.carloscontrerasruiz.command.messy;

import lombok.NonNull;
import org.springframework.stereotype.Service;

@Service
public class MessyService {

    public String messyMethod(@NonNull int number, String name){
        if(number > 0){
            if(number < 5){
                name = "Franco";
                System.out.println("Numero menor a 5");
            }else{

                System.out.println("Numero mayor a 5");
                if (name.equals("DEFAULT")){
                    name = "Renata";
                }else{
                    name = "Roberto";
                }

                if(number > 100 && name.equals("Roberto")){
                    System.out.println("Numero mayor a 100");
                    throw new IllegalArgumentException("Number or name not aalowed");
                }else{
                    if (number > 100){
                        System.out.println("Numero mayor a 100 y nombre no Roberto");
                        System.out.println("El nombre es "+name);
                    }
                    if (name.equals("Renata")){
                        System.out.println("Numero mayor a 100 nombre RENATA");
                        name = "Renata 222";
                    }
                }

            }
            if(number == 2){
                System.out.println("Numero igual a 2");
                name = "Maria";
            }
        }else{
            throw new IllegalArgumentException("Negative numbers not allowed");
        }
        return "NOMBRE: "+name+" ::: NUMERO "+number;
    }
}
