package com.github.carloscontrerasruiz.command.readable.commands.impl;

import com.github.carloscontrerasruiz.command.readable.commands.Command;
import org.springframework.stereotype.Component;

@Component
public class NumberEqTwo implements Command {
    @Override
    public boolean isValid(int number, String name) {
        return number == 2;
    }

    @Override
    public String execute(int number, String name) {
        System.out.println("Numero igual a 2");
        return "Maria";
    }
}
