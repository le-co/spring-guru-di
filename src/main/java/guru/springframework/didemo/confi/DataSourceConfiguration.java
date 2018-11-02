package guru.springframework.didemo.confi;

import guru.springframework.didemo.examplebean.DataSourceFactory;
import guru.springframework.didemo.examplebean.JmsFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
//@PropertySources({
//        @PropertySource("classpath:datasource.yml"),
//        @PropertySource("classpath:jms.yml")
//})
public class DataSourceConfiguration {

    @Value("${datasource.username}")
    private String username;

    @Value("${datasource.password}")
    private String password;

    @Value("${datasource.url}")
    private String url;

    @Value("${jms.username}")
    private String jmsUsername;

    @Value("${jms.password}")
    private String jmsPassword;

    @Value("${jms.url}")
    private String jmsUrl;

    @Bean
    public DataSourceFactory dataSourceFactory() {
        DataSourceFactory dataSourceFactory = new DataSourceFactory();
        dataSourceFactory.setUsername(this.username);
        dataSourceFactory.setPassword(this.password);
        dataSourceFactory.setUrl(this.url);
        return dataSourceFactory;
    }

    @Bean
    public JmsFactory jmsFactory() {
        JmsFactory jmsFactory = new JmsFactory();
        jmsFactory.setPassword(jmsPassword);
        jmsFactory.setUrl(jmsUrl);
        jmsFactory.setUsername(jmsUsername);
        return jmsFactory;
    }

}
