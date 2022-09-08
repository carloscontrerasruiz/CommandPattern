package com.github.carloscontrerasruiz.command.readable.commands.impl;

import com.github.carloscontrerasruiz.command.readable.commands.Command;
import org.springframework.stereotype.Component;

@Component
public class DefaultNameImpl implements Command {
    @Override
    public boolean isValid(int number, String name) {
        return number > 5;
    }

    @Override
    public String execute(int number, String name) {
        System.out.println("Numero mayor a 5");
        if (name.equals("DEFAULT")){
            name = "Renata";
        }else{
            name = "Roberto";
        }
        return name;
    }
}
