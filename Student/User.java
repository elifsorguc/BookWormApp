/**
 * User
 * @author Gazal Amirrashed
 */
public abstract class User {

    protected String email;
    protected String password;
    protected String bilkentID;
    protected boolean isAdmin;
    protected String name;
    protected String surname;

    // getter methods
    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    public String getName(){
        return name;
    }
    
    public String getSurname(){
        return surname;
    }

    public String getID(){
        return bilkentID;
    }

    public boolean getUserType;

    // setter methods

    public void setPassword(String password){
        this.password = password;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setID(String id){
        this.bilkentID = id;
    }

    public void setUserStatus(boolean b){
        this.isAdmin = b;
    }

    public void setEmail(String email){
        this.email = email;
    }


}