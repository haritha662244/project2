package in.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.ashokit.util.AppSecurity;

@Configuration
public class AppConfig {
    public AppConfig() {
    	System.out.println("Appconfig::constructor");
    }
    @Bean
    public AppSecurity security() {
    	AppSecurity se=new AppSecurity();
    	System.out.println("bean method calling");
    	return se;
    }
}
