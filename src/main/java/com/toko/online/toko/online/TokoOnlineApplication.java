package com.toko.online.toko.online;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing

public class TokoOnlineApplication {
	@Bean
public ModelMapper modelMapper(){
	return new ModelMapper();
}

	public static void main(String[] args) {
		SpringApplication.run(TokoOnlineApplication.class, args);
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("                       Kamu nanya dah di run belum kamu bertanya tanya");
		System.out.println("                                                                        sini ya aku kasih tau ");
		System.out.println("                                                                                                Tapi boong");
		System.out.println("                                                                                                              slebewwwwwwww");

	}

}
