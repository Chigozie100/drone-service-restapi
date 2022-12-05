package com.springboot.dronerestapi;

import com.springboot.dronerestapi.model.Drone;
import com.springboot.dronerestapi.repository.DroneRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.math.BigDecimal;

@SpringBootApplication
@EnableScheduling
public class DroneRestapiApplication {

	public static void main(String[] args) {SpringApplication.run(DroneRestapiApplication.class, args);}

}
