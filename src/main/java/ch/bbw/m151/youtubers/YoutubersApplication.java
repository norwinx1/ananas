package ch.bbw.m151.youtubers;

import org.h2.tools.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.SQLException;

@SpringBootApplication
public class YoutubersApplication {

    public static void main(String[] args) {
        SpringApplication.run(YoutubersApplication.class, args);
    }

    @Bean(initMethod = "start", destroyMethod = "stop")
    public Server inMemoryH2DatabaseServer() throws SQLException {
        //connectable on: jdbc:h2:tcp://localhost:9090/mem:mydb
        return Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", "9090");
        //INSERT INTO YOUTUBERS_ENTITY(RANK, USERNAME, YOUTUBE_URL, NAME, CATEGORY, AMOUNT_SUBSCRIBERS, COUNTRY, AVG_VIEWS, AVG_LIKES, AVG_COMMENTS) ((SELECT * FROM CSVREAD('src/main/resources/top_1000_youtubers.csv')))
    }

}
