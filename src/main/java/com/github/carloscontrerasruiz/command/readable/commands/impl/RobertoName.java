package com.github.carloscontrerasruiz.command.readable.commands.impl;

import com.github.carloscontrerasruiz.command.readable.commands.Command;
import org.springframework.stereotype.Component;

@Component
public class RobertoName implements Command {
    @Override
    public boolean isValid(int number, String name) {
        return number > 100 && name.equals("Roberto");
    }

    @Override
    public String execute(int number, String name) {
        System.out.println("Numero mayor a 100");
        throw new IllegalArgumentException("Number or name not aalowed");
    }
}
