package li.mkg.musicsheetarchive.musicsheet.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by fke on 13.11.2015.
 */
@Entity
@Table(name = "Arranger")
public class Arranger extends Person {

    public Arranger(String firstname, String lastname) {
        firstName = firstname;
        lastName = lastname;
    }



    @Override
    public String toString() {
        return String.format("Composer[id=%d, firstname='%s', lastname='%s']",
                id, firstName, lastName);
    }
}
