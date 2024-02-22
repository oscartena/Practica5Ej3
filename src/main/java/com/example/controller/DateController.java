package com.example.controller;

import com.example.model.DateEntity;
import com.example.service.DateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DateController {
    private final DateService dateService;

    @Autowired
    public DateController(DateService dateService) {
        this.dateService = dateService;
    }

    // Endpoint para obtener la fecha actual
    @GetMapping("/date")
    public ResponseEntity<DateEntity> getCurrentDate() {
        return dateService.getCurrentDate();
    }

    // Endpoint para obtener la fecha actual + n días
    @GetMapping("/date/{n}")
    public ResponseEntity<DateEntity> getDatePlusNDays(@PathVariable int n) {
        return dateService.getDatePlusNDays(n);
    }

    // Endpoint para cambiar la fecha, se espera un objeto DateEntity en el cuerpo de la solicitud
    @PostMapping("/date")
    public ResponseEntity<DateEntity> changeDate(@RequestBody DateEntity dateEntity) {
        return dateService.changeDate(dateEntity);
    }
}

