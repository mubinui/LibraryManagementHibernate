import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Books {
    @Id
    private int bid;
    private String rakno;
    private String bname;
    private String bclass;

    public Books() {
    }

    public Books(int bid, String rakno, String bname, String bclass) {
        this.bid = bid;
        this.rakno = rakno;
        this.bname = bname;
        this.bclass = bclass;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getRakno() {
        return rakno;
    }

    public void setRakno(String rakno) {
        this.rakno = rakno;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBclass() {
        return bclass;
    }

    public void setBclass(String bclass) {
        this.bclass = bclass;
    }
}
