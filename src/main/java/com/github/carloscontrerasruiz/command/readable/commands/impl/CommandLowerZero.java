package com.github.carloscontrerasruiz.command.readable.commands.impl;

import com.github.carloscontrerasruiz.command.readable.commands.Command;
import org.springframework.stereotype.Component;

@Component
public class CommandLowerZero implements Command {
    @Override
    public boolean isValid(int number, String name) {
        return number < 0;
    }

    @Override
    public String execute(int number, String name) {
        throw new IllegalArgumentException("Negative numbers not allowed");
    }
}
