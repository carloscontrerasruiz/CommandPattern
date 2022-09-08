package com.github.carloscontrerasruiz.command.readable;

import com.github.carloscontrerasruiz.command.readable.commands.Command;
import com.github.carloscontrerasruiz.command.readable.commands.impl.*;
import lombok.NonNull;
import org.springframework.stereotype.Service;

@Service
public class ReadableService {

    public String readableMethod(@NonNull int number, String name) {

        Command[] commands = {
                //new NegativeFourImpl(),
                new CommandLowerZero(),
                new FrancoImpl(),
                new DefaultNameImpl(),
                new RobertoName(),
                new NumberGtHundred(),
                new RenataNameImpl(),
                new NumberEqTwo()
        };

        for (Command command : commands) {
            if (command.isValid(number, name)) {
                name = command.execute(number, name);
            }
        }

        return "NOMBRE: " + name + " ::: NUMERO " + number;
    }
}
