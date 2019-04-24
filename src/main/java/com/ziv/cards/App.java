package com.ziv.cards;

import com.ziv.cards.server.IServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {

    @Autowired
    private IServer server;

    @Override
    public void run(String... args) throws Exception {
        server.start();
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}