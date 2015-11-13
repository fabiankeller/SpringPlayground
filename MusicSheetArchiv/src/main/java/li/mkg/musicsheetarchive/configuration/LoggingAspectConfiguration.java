package li.mkg.musicsheetarchive.configuration;

import li.mkg.musicsheetarchive.aspects.LoggingAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by fke on 13.11.2015.
 */
@Configuration
@EnableAspectJAutoProxy
public class LoggingAspectConfiguration {

    @Bean
    public LoggingAspect loggingAspect() { return new LoggingAspect(); }
}
