package li.mkg.musicsheetarchive.musicsheet;

import li.mkg.musicsheetarchive.musicsheet.domain.MusicSheet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by fke on 13.11.2015.
 */
@Controller
@Scope("singleton")
public class MusicSheetController {

    public static final Logger LOGGER = LoggerFactory.getLogger(MusicSheetController.class);

    @Autowired
    private MusicSheetArchiveRepository repo;

    @Value("${application.title}")
    private String appName;

    /*
    @PostConstruct
    private void createInitialData() {
        LOGGER.info(appName + ": Creating initial data");
        repo.deleteAll();
        Arranger johnMossArranger = new Arranger("John", "Moss");
        Composer thomasDossComposer = new Composer("Thomas", "Doss");
        repo.save(new MusicSheet("Montana Fanfare", thomasDossComposer, johnMossArranger, 1994));
        Composer ottoMSchwarzComposer = new Composer("Otto", "M.Schwarz");
        repo.save(new MusicSheet("Welcome Overture", ottoMSchwarzComposer, johnMossArranger, 2001));
        repo.save(new MusicSheet("Eisenhower Centennial", new Composer("James", "Barnes"),
                new Arranger("Gerhard", "Baumann"), 5232));
    }
    */

    @RequestMapping("/musicsheets")
    @ResponseBody
    public List<MusicSheet> findAllMusicSheets() {
        List<MusicSheet> result = repo.findAll();
        LOGGER.info(appName + ": Returning the list of all the musicsheets. Size: " + result.size());
        return result;
    }

    @RequestMapping("/musicsheets/{title}")
    @ResponseBody
    public MusicSheet findMusicSheetByTitle(@PathVariable String title) {
        MusicSheet result = repo.findByTitle(title);
        LOGGER.info(appName + ": Returning the musicsheet with title: " + result.getTitle());
        return result;
    }
}
