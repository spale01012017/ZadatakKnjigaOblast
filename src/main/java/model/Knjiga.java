package model;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

/**
 * Created by androiddevelopment on 20.4.17..
 */
@DatabaseTable(tableName="knjiga")
public class Knjiga {




    private boolean prisutna;
    public static final  String POLJE_NASLOV="naslov";
    public  static  final String BROJ_STRANA="broj_strana";
    public  static final String POLJE_DATUM_IZDAVANJA="datum_izdavanja";
     @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField(columnName = POLJE_NASLOV,canBeNull = false)
    private String naslov;
    @DatabaseField(columnName = BROJ_STRANA,canBeNull = false)
    private int BrojStrana;
    @DatabaseField(columnName = POLJE_DATUM_IZDAVANJA,canBeNull = false)
    private Date DatumIzdanja;
    @ForeignCollectionField(foreignFieldName = "knjiga")
    private ForeignCollection<Oblast> oblast;

    public Knjiga() {

    }

    public Knjiga(String naslov, int brojStrana, Date datumIzdanja) {
        this.naslov = naslov;
        BrojStrana = brojStrana;
        DatumIzdanja = datumIzdanja;
    }

    public boolean isPrisutna() {
        return prisutna;
    }

    public void setPrisutna(boolean prisutna) {
        this.prisutna = prisutna;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public int getBrojStrana() {
        return BrojStrana;
    }

    public void setBrojStrana(int brojStrana) {
        BrojStrana = brojStrana;
    }

    public Date getDatumIzdanja() {
        return DatumIzdanja;
    }

    public void setDatumIzdanja(Date datumIzdanja) {
        DatumIzdanja = datumIzdanja;
    }

    public ForeignCollection<Oblast> getOblast() {
        return oblast;
    }

    public void setOblast(ForeignCollection<Oblast> oblast) {
        this.oblast = oblast;
    }

    @Override
    public String toString() {
        return "Knjiga{" +
                "id=" + id +
                ", naslov='" + naslov + '\'' +
                ", BrojStrana=" + BrojStrana +
                ", DatumIzdanja=" + DatumIzdanja +
                '}';
    }
}
