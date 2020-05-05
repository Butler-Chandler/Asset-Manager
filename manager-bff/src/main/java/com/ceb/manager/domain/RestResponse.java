package com.ceb.manager.domain;

import java.util.ArrayList;
import java.util.List;

public class RestResponse {
    private Long status;
    private List<String> errors = new ArrayList<String>();

    public RestResponse(Long status){
        this.status = status;
    }

    public RestResponse(Long status, List<String> errors){
        this.errors = errors;
        this.status = status;
    }

    public Long getStatus() {
        return this.status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public List<String> getErrors() {
        return this.errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }    
}