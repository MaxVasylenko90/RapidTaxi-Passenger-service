package dev.mvasylenko.rapidtaxipassengerservice.controller;

import dev.mvasylenko.rapidtaxipassengerservice.dto.RideDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static dev.mvasylenko.rapidtaxipassengerservice.constants.Constants.RIDE_SERVICE_BASE_URL;

@RestController
@RequestMapping("/api/passengers")
public class PassengerController {
    private static final Logger LOG = LoggerFactory.getLogger(PassengerController.class);

    private final RestTemplate restTemplate;

    @Autowired
    public PassengerController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/{passengerId}/rides")
    public List<RideDto> getRides(@PathVariable long passengerId) {
        String url = RIDE_SERVICE_BASE_URL + "?passengerId=" + passengerId;
        RideDto[] response = restTemplate.getForObject(url, RideDto[].class);
        return response != null ? Arrays.asList(response) : Collections.emptyList();
    }

}
