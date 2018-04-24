package spring.hello;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * Project Name:spring web hello world
 * Package Name:
 * File Name:Application.java
 * Date:Apr 24, 2018 4:43:51 PM
 * 
 */

/**
* ClassName: Application <br/>
* Description: TODO <br/>
* Date: Apr 24, 2018 4:43:51 PM <br/>
* 
*/
@RestController
@SpringBootApplication
public class Application {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
