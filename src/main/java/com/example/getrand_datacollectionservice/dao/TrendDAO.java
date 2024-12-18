package com.example.getrand_datacollectionservice.dao;

import com.example.getrand_datacollectionservice.dto.DefaultPastOYDTO;
import com.example.getrand_datacollectionservice.dto.RealTimeTrendDTO;
import com.example.getrand_datacollectionservice.dto.RelatedQueriesDTO;
import com.example.getrand_datacollectionservice.dto.RelatedTopicsDTO;

import java.util.List;

public interface TrendDAO {
    void insertDOY(List<DefaultPastOYDTO> dto);
    void insertRtt(List<RealTimeTrendDTO> dto);
    void insertRq(List<RelatedQueriesDTO> dto);
    void insertRt(List<RelatedTopicsDTO> dto);
    void deleteAll();


}