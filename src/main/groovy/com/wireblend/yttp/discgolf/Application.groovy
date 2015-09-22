package com.wireblend.yttp.discgolf

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.ComponentScan

@ComponentScan(basePackages = ['com.wireblend.yttp.discgolf.*'])
@SpringBootApplication
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
