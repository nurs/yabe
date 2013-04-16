package models;
 
import java.util.*;
import javax.persistence.*;
import play.data.validation.Email;
import play.data.validation.Required;
 
import play.db.jpa.*;
 
@Entity
@Table(name="blog_user")
public class User extends Model {
 
    @Email
    @Required    
    public String email;
    
    @Required
    public String password;
    
    public String fullname;
    public boolean isAdmin;
    
    public User(String email, String password, String fullname) {
        this.email = email;
        this.password = password;
        this.fullname = fullname;
    }

    public static Object connect(String username, String password) {
        User u = User.find("select u from User u where u.email = ? and u.password = ? and isAdmin = 1", username, password).first();
        return u;
    }

    @Override
    public String toString() {
        return this.email;
    }

}