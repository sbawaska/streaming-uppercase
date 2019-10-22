package io.projectriffdemo.streaminguppercase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Flux;

import java.util.function.Function;

@SpringBootApplication
public class StreaminguppercaseApplication {

    @Bean
    public Function<Flux<String>, Flux<String>> streamingUppercase() {
        return stringFlux -> stringFlux.log().map(String::toUpperCase);
    }

    public static void main(String[] args) {
        SpringApplication.run(StreaminguppercaseApplication.class, args);
    }

}
