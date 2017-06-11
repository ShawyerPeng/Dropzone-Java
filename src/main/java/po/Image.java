package po;

public class Image {
    private Integer id;

    private String iname;

    private String iurl;

    private Long isize;

    private String itype;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname == null ? null : iname.trim();
    }

    public String getIurl() {
        return iurl;
    }

    public void setIurl(String iurl) {
        this.iurl = iurl == null ? null : iurl.trim();
    }

    public Long getIsize() {
        return isize;
    }

    public void setIsize(Long isize) {
        this.isize = isize;
    }

    public String getItype() {
        return itype;
    }

    public void setItype(String itype) {
        this.itype = itype == null ? null : itype.trim();
    }
}