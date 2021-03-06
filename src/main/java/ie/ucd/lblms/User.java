package ie.ucd.lblms;
import javax.persistence.*;

@Entity
@Table(name = "users")
public class User
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long userId;
    private String username;
    private String password;
    
    public User() { }

    public User(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    public Long getUserId() { return userId; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }
}
