package MemberManagement;

public class MemberDTO {
    private String id;
    private String pwd;
    private String name;
    private String phone;

    // Builder
    public MemberDTO(String id, String pwd) {
        this(id, pwd, "", "");
    }

    public MemberDTO(String id, String pwd, String name, String phone) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Id: " + id + " Pwd: " + pwd + " Name: " + name + " Phone: " + phone;
    }
}