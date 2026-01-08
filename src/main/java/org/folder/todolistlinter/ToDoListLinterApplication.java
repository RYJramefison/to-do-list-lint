package org.folder.todolistlinter;

import jakarta.persistence.Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan
@ComponentScan({ "org.folder.todolistlinter.repository"})
public class ToDoListLinterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToDoListLinterApplication.class, args);
    }

}
