package li.mkg.musicsheetarchive.musicsheet.domain;

import javax.persistence.*;

/**
 * Created by fke on 13.11.2015.
 */
@Entity
public class MusicSheet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long musicSheetId;
    @ManyToOne
    @JoinColumn(name = "Composer")
    private Composer composer;
    @ManyToOne
    @JoinColumn(name = "Arranger")
    private Arranger arranger;
    @Column(name = "Title")
    private String title;
    @Column(name = "Number")
    private int number;

    public MusicSheet(String title, Composer composer, Arranger arranger, int number) {
        this.title = title;
        this.composer = composer;
        this.arranger = arranger;
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format("MusicSheet[Id='%d', title='%s', composer='%s', arranger='%s', number='%d']", musicSheetId,
                title, composer, arranger, number);
    }

    public long getMusicSheetId() { return this.musicSheetId; }
    public Composer getComposer() { return this.composer; }
    public Arranger getArranger() { return this.arranger; }
    public String getTitle() { return this.title; }
    public int getNumber() { return this.number; }
}
