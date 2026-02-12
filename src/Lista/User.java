package Lista;

public class User {

    private String firtName;
    private String lastName;

    public void setFirtName(String firtName) {
        this.firtName = firtName.toUpperCase();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirtName() {
        return firtName;
    }

}
