package mrloiho.hust.config;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

//@Configuration
//@ComponentScan(basePackages = "mrloiho.hust")
//@EnableMongoRepositories({"mrloiho.hust.repositories"})
public class Config {
//
//    @Bean
//    public MongoTemplate mongoTemplate(MongoDbFactory mongoDbFactory, MongoMappingContext context) {
//        MappingMongoConverter converter = new MappingMongoConverter(new DefaultDbRefResolver(mongoDbFactory), context);
//        converter.setTypeMapper(new DefaultMongoTypeMapper(null));
//        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory, converter);
//        return mongoTemplate;
//    }
}
