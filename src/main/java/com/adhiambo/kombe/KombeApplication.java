package com.adhiambo.kombe;

import com.adhiambo.kombe.controller.ProductController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KombeApplication {
	public static void main(String[] args) {
		SpringApplication.run(KombeApplication.class, args);
		System.out.println("halo");
	}

}
