package li.mkg.musicsheetarchive.musicsheet.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by fke on 13.11.2015.
 */
@Entity
@Table(name = "Composer")
public class Composer extends Person {

    public Composer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return String.format("Arranger[id=%d, firstname='%s', lastname='%s']",
                id, firstName, lastName);
    }
}
