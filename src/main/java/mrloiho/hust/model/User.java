package mrloiho.hust.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;
import java.util.List;

@Document(collection = "users")
@Data
public class User {
    @Id
    private String id;
    private String username;
    private String password;
    private int numTasks;
    private List<Task> listTasks;

    public User(String username, String password){
        this.username= username;
        this.password= password;
    }
}
