package example.cashcardapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration;

@SpringBootApplication
public class CashCardApplication {

    public static void main(String[] args) {
        SpringApplication.run(CashCardApplication.class, args);

    }

}
