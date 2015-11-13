package li.mkg.musicsheetarchive.musicsheet;

import li.mkg.musicsheetarchive.musicsheet.domain.MusicSheet;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by fke on 13.11.2015.
 */
public interface MusicSheetArchiveRepository extends CrudRepository<MusicSheet, Long> {

    MusicSheet findByTitle(String title);
    List<MusicSheet> findAll();
}
