package Data.DTO;

public class UserDTO {

    //Fields
    int id;
    String name;

    public UserDTO() {
        this.id = 12;
        this.name = "Anders And";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
