package movie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@Slf4j
@EnableAutoConfiguration
@EnableFeignClients
@ComponentScan(basePackages = {"movie.booking.*"})
public class MovieBookingService {
    public static void main(String[] args) {
        SpringApplication.run(MovieBookingService.class, args);
        System.out.println("Hello world!");
    }
}