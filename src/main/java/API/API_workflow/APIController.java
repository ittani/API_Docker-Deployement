package API.API_workflow;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class APIController {

    @RequestMapping("/services")
    public List<Services> retriveallAnimals()
    {
        return Arrays.asList(
                new Services(1, "Cloud Engineering", "Storage-maintanance", 550000L),
                new Services(2, "Software solution", "Development-maintanance",400000L ),
                new Services(3, "Cyber Security", "Protection",600000L),
                new Services(4, "Data Science", "Market-Forecast", 630000L),
                new Services(5,"IT Support", "Maintanance", 700000L)
        );
    }
}
