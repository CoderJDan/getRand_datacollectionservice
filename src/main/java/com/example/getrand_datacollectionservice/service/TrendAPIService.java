package com.example.getrand_datacollectionservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "googleTrand", url = "https://serpapi.com/search.json")
public interface TrendAPIService {

    @GetMapping("")
    String getRealTimeTrand(@RequestParam("geo") String geo,
                            @RequestParam("engine") String engine,
                            @RequestParam("api_key") String apiKey);

    @GetMapping("")
    String getRelatedQueries(@RequestParam("geo") String geo,
                            @RequestParam("engine") String engine,
                            @RequestParam("data_type") String dataType,
                            @RequestParam("q") String query,
                            @RequestParam("api_key") String apiKey);

    @GetMapping("")
    String getRelatedTopics(@RequestParam("geo") String geo,
                             @RequestParam("engine") String engine,
                             @RequestParam("data_type") String dataType,
                             @RequestParam("q") String query,
                             @RequestParam("api_key") String apiKey);
}
