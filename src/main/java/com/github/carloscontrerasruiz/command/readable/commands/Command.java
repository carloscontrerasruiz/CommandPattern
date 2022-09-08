package com.github.carloscontrerasruiz.command.readable.commands;

public interface Command {

    boolean isValid(int number, String name);
    String execute(int number, String name);
}
