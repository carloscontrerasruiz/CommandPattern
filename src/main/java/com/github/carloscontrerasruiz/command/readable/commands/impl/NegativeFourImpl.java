package com.github.carloscontrerasruiz.command.readable.commands.impl;

import com.github.carloscontrerasruiz.command.readable.commands.Command;
import org.springframework.stereotype.Component;

@Component
public class NegativeFourImpl implements Command {
    @Override
    public boolean isValid(int number, String name) {
        return number == -4;
    }

    @Override
    public String execute(int number, String name) {
        System.out.println("Entrar a negative four");
        return "Negative 4";
    }
}
