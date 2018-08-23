package dto;

import java.util.Date;

//@Entity
//@Table(name="BK_FILE")
public class BkFile{


    private Long ID;
    private String ORG_NAME;
    private String NEW_NAME;
    private String PATH_TO;
    private String TYPE;
    private String FLAG;
    private String CREATE_USER;
    private Date CREATE_DATE;
    private String UPDATE_USER;
    private Date UPDATE_DATE;


    //@Column(name ="ID")
    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    //@Column(name ="ORG_NAME")
    public String getORG_NAME() {
        return ORG_NAME;
    }

    public void setORG_NAME(String ORG_NAME) {
        this.ORG_NAME = ORG_NAME;
    }

    //@Column(name ="NEW_NAME")
    public String getNEW_NAME() {
        return NEW_NAME;
    }

    public void setNEW_NAME(String NEW_NAME) {
        this.NEW_NAME = NEW_NAME;
    }

    //@Column(name ="PATH_TO")
    public String getPATH_TO() {
        return PATH_TO;
    }

    public void setPATH_TO(String PATH_TO) {
        this.PATH_TO = PATH_TO;
    }

    //@Column(name ="TYPE")
    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    //@Column(name ="FLAG")
    public String getFLAG() {
        return FLAG;
    }

    public void setFLAG(String FLAG) {
        this.FLAG = FLAG;
    }

    //@Column(name ="CREATE_USER")
    public String getCREATE_USER() {
        return CREATE_USER;
    }

    public void setCREATE_USER(String CREATE_USER) {
        this.CREATE_USER = CREATE_USER;
    }

    //@Column(name ="CREATE_DATE")
    public Date getCREATE_DATE() {
        return CREATE_DATE;
    }

    public void setCREATE_DATE(Date CREATE_DATE) {
        this.CREATE_DATE = CREATE_DATE;
    }

    //@Column(name ="UPDATE_USER")
    public String getUPDATE_USER() {
        return UPDATE_USER;
    }

    public void setUPDATE_USER(String UPDATE_USER) {
        this.UPDATE_USER = UPDATE_USER;
    }

    //@Column(name ="UPDATE_DATE")
    public Date getUPDATE_DATE() {
        return UPDATE_DATE;
    }

    public void setUPDATE_DATE(Date UPDATE_DATE) {
        this.UPDATE_DATE = UPDATE_DATE;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        BkFile bkFile = (BkFile) object;
        return java.util.Objects.equals(ID, bkFile.ID) &&
                java.util.Objects.equals(ORG_NAME, bkFile.ORG_NAME) &&
                java.util.Objects.equals(NEW_NAME, bkFile.NEW_NAME) &&
                java.util.Objects.equals(PATH_TO, bkFile.PATH_TO) &&
                java.util.Objects.equals(TYPE, bkFile.TYPE) &&
                java.util.Objects.equals(FLAG, bkFile.FLAG) &&
                java.util.Objects.equals(CREATE_USER, bkFile.CREATE_USER) &&
                java.util.Objects.equals(CREATE_DATE, bkFile.CREATE_DATE) &&
                java.util.Objects.equals(UPDATE_USER, bkFile.UPDATE_USER) &&
                java.util.Objects.equals(UPDATE_DATE, bkFile.UPDATE_DATE);
    }

    public int hashCode() {

        return java.util.Objects.hash(super.hashCode(), ID, ORG_NAME, NEW_NAME, PATH_TO, TYPE, FLAG, CREATE_USER, CREATE_DATE, UPDATE_USER, UPDATE_DATE);
    }

    //@java.lang.Override
    public java.lang.String toString() {
        return "BkFile{" +
                "ID=" + ID +
                ", ORG_NAME='" + ORG_NAME + '\'' +
                ", NEW_NAME='" + NEW_NAME + '\'' +
                ", PATH_TO='" + PATH_TO + '\'' +
                ", TYPE='" + TYPE + '\'' +
                ", FLAG='" + FLAG + '\'' +
                ", CREATE_USER='" + CREATE_USER + '\'' +
                ", CREATE_DATE=" + CREATE_DATE +
                ", UPDATE_USER='" + UPDATE_USER + '\'' +
                ", UPDATE_DATE=" + UPDATE_DATE +
                '}';
    }
}