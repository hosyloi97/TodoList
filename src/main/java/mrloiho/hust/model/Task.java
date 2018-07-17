package mrloiho.hust.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class Task {
   @Field(value = "task")
   private String nameTask;
   private String status;
}
