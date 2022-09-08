package com.github.carloscontrerasruiz.command.readable.commands.impl;

import com.github.carloscontrerasruiz.command.readable.commands.Command;
import org.springframework.stereotype.Component;

@Component
public class RenataNameImpl implements Command {
    @Override
    public boolean isValid(int number, String name) {
        return number < 100 || !name.equals("Roberto");
    }

    @Override
    public String execute(int number, String name) {
        if (name.equals("Renata")){
            System.out.println("Numero mayor a 100 nombre RENATA");
            name = "Renata 222";
        }
        return name;
    }
}
