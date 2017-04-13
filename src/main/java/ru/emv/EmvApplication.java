package ru.emv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.emv.kernel.Kernel;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class EmvApplication {

    @Autowired
    private Kernel kernel;

    public static void main(String[] args) {
        SpringApplication.run(EmvApplication.class, args);
    }

    @PostConstruct
    private void init() {
        kernel.start();
    }
}
