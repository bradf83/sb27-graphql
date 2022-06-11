package com.example.demo.controllers;

import java.time.Instant;
import java.time.YearMonth;
import java.util.Collection;
import java.util.List;

import javax.validation.Valid;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

import com.example.demo.controllers.input.HolidayAMonthInput;

@Controller
public class HolidayController {
    @MutationMapping
    public Collection<Holiday> addHolidays(@Argument @Valid HolidayAMonthInput holidays) {
        // TODO Validate passed in dates and throw nice error
        return List.of(new Holiday(1, YearMonth.of(2022, 1), Instant.parse(holidays.getJanuary())),
                new Holiday(2, YearMonth.of(2022, 2), Instant.parse(holidays.getFebruary())));
    }
}

/*
 * Holiday data type, trying out YearMonth
 */
record Holiday(int id, YearMonth month, Instant date) {
};
