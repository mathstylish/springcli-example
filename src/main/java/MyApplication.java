import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.SpringApplication;

@RestController
@EnableAutoConfiguration
public class MyApplication {
  @RequestMapping("/")
  String home() {
    return "Hello World!";
  }

  public static void main(String[] args) {
    SpringApplication.run(MyApplication.class, args);
  }
}
