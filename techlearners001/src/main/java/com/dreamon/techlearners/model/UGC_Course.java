package com.dreamon.techlearners.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.Map;

@Document(collection = "SuPathWay.PhisicalScience")
public class UGC_Course {

    @Id
    private String id;
    private String name;

    private Map<String, Double> eligibility = new HashMap();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Double> getEligibility() {
        return eligibility;
    }

    public void setEligibility(Map<String, Double> eligibility) {
        this.eligibility = eligibility;
    }
}