package com.recknerd.discgolf

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.ComponentScan
import springfox.documentation.swagger2.annotations.EnableSwagger2

@ComponentScan(basePackages = ['com.recknerd.discgolf.*'])
@SpringBootApplication
@EnableSwagger2
class Application {

    private static ConfigurableApplicationContext ctx

    static void main(String... args) {
        if (args && args[0] == 'stop') {
            System.exit(SpringApplication.exit(ctx))
        } else {
            ctx = SpringApplication.run(Application)
        }
    }
}
