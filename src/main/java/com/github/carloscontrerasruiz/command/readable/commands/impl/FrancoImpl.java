package com.github.carloscontrerasruiz.command.readable.commands.impl;

import com.github.carloscontrerasruiz.command.readable.commands.Command;
import org.springframework.stereotype.Component;

@Component
public class FrancoImpl implements Command {
    @Override
    public boolean isValid(int number, String name) {
        return number > 0 && number < 5;
    }

    @Override
    public String execute(int number, String name) {
        System.out.println("Numero menor a 5");
        return "Franco";
    }
}
