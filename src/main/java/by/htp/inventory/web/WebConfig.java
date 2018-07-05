package by.htp.inventory.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan({"by.htp.inventory.controller", "by.htp.inventory.config"})
public class WebConfig {

}
