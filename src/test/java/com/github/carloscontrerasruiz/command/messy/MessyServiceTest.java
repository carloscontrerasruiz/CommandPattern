package com.github.carloscontrerasruiz.command.messy;

import com.github.carloscontrerasruiz.command.readable.ReadableService;
import org.junit.jupiter.api.Test;

class MessyServiceTest {
    ;

    @Test
    public void testMessyMethod() {
        int number = 1;
        String name = "DEFAULT";

        MessyService service = new MessyService();

        try {
            String aDefault = service.messyMethod(number, name);
            System.out.println(aDefault);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        System.out.println("==========================");
        System.out.println("==========================");
        System.out.println("==========================");
        System.out.println("==========================");

        ReadableService service2 = new ReadableService();

        try {
            String default1 = service2.readableMethod(number, name);
            System.out.println(default1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}