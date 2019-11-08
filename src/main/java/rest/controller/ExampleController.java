package rest.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import rest.response.ExampleResponse;

@RestController
public class ExampleController {

    @RequestMapping(value = "/example", method = {RequestMethod.GET, RequestMethod.POST}, produces = MediaType.APPLICATION_JSON_VALUE)
    public static ExampleResponse getExampleResponse(String name) {

        ExampleResponse response = new ExampleResponse();
        response.setParam1("Hello");
        response.setParam2(name);
        return response;
    }
}
