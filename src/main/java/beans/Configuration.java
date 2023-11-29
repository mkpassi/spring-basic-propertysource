package beans;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@ComponentScan
@PropertySources({
				@PropertySource("classpath:/app-defaults.properties"),
				@PropertySource("file:D:\\code\\tutorials\\spring-basic-propertysource\\app-home\\app-db.properties")
})
public class Configuration {

}
