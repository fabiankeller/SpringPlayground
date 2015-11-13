package li.mkg.musicsheetarchive.musicsheet.domain;

import javax.persistence.*;

/**
 * Created by fke on 13.11.2015.
 */
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected long id;
    @Column(name = "FirstName")
    protected String firstName;
    @Column(name = "LastName")
    protected String lastName;

    public long getId() { return this.id; }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
}
