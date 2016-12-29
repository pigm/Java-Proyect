// @author Pablo
public class User {
    private String userName;
    private String password;
    private String email;
    private int cellPhone;

    
    public User() {
    
    }
    
    public User(String userName, String password, String email, int cellPhone) throws Exception {
        setUserName(userName);
        setPassword(password);
        setEmail(email);
        setCellPhone(cellPhone);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName)throws Exception{
        if (userName.trim().length() >= 6) {
            this.userName = userName;
        } else {
            throw new Exception(", nombre invalido");
        }
    }

    protected String getPassword() {
        return password;
    }

    public void setPassword(String password)throws Exception{
        if (password.trim().length() >= 5) {
            this.password = password;
        } else {
            throw new Exception(", contraseña invalida");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email)throws Exception{
        if (email.trim().length() >=1) {
            this.email = email;
        } else {
            throw new Exception(", E-mail invalido.");
        }
    }

    public int getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(int cellPhone) throws Exception {
        if (cellPhone >= 40000000 && cellPhone <= 99999999) {
            this.cellPhone = cellPhone;
        }else{
             throw new Exception(", numero invalido");
        }
    }
    
    
}
