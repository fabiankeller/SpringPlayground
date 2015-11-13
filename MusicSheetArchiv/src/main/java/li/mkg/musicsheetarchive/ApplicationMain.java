package li.mkg.musicsheetarchive;

import li.mkg.musicsheetarchive.musicsheet.MusicSheetArchiveRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by fke on 13.11.2015.
 */
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = ApplicationMain.class)
@EnableJpaRepositories(basePackageClasses = {MusicSheetArchiveRepository.class})
public class ApplicationMain {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationMain.class);
    }
}
