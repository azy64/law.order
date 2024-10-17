package com.tunaweza.law.order;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LawOrderApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(LawOrderApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        System.out.println("je suis dans le demarage...");; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
