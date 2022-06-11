package com.example.demo.controllers.input;

import javax.validation.constraints.NotBlank;

/**
 * Implement some javax validators.
 */
public class HolidayAMonthInput {
    @NotBlank
    private String january;
    private String february;

    public String getJanuary() {
        return this.january;
    }

    public void setJanuary(String january) {
        this.january = january;
    }

    public String getFebruary() {
        return this.february;
    }

    public void setFebruary(String february) {
        this.february = february;
    }
}
