package corrector;

/**
 * Created by АРТЁМ on 23.12.2015.
 */
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CorrectorController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    /*   @RequestMapping("/greeting")
       public Greeting greeting(@RequestBody String name) {
           return new Greeting(counter.incrementAndGet(),
                   String.format(template, name));
       }
       */
    @RequestMapping("/corrected")
    public Corrected corrected(@RequestBody String name) {
        return new Corrected(counter.incrementAndGet(),
                name);
    }
}