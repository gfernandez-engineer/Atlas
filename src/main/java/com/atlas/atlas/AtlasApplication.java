package com.atlas.atlas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AtlasApplication {

	public static void main(String[] args) {
		// Crear una fibra (virtual thread) es tan sencillo como crear un hilo:
	/*	Thread.startVirtualThread(() -> {
			System.out.println("Esta es una fibra ejecutándose concurrentemente.");
		});*/
		SpringApplication.run(AtlasApplication.class, args);
	}

}
