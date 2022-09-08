package com.github.carloscontrerasruiz.command.readable.commands.impl;

import com.github.carloscontrerasruiz.command.readable.commands.Command;
import org.springframework.stereotype.Component;

@Component
public class NumberGtHundred implements Command {
    @Override
    public boolean isValid(int number, String name) {
        return number > 100 && !name.equals("Roberto");
    }

    @Override
    public String execute(int number, String name) {
        System.out.println("Numero mayor a 100 y nombre no Roberto");
        System.out.println("El nombre es "+name);
        return name;
    }
}
