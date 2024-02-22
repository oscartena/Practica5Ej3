package com.example.service;

import com.example.model.DateEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class DateService {
    private LocalDate date = LocalDate.now();

    // Método para obtener la fecha actual
    public ResponseEntity<DateEntity> getCurrentDate() {
        DateEntity dateEntity = new DateEntity();
        dateEntity.setYear(date.getYear());
        dateEntity.setMonth(date.getMonthValue());
        dateEntity.setDay(date.getDayOfMonth());
        return ResponseEntity.ok(dateEntity);
    }

    // Método para obtener la fecha actual + n días
    public ResponseEntity<DateEntity> getDatePlusNDays(int days) {
        DateEntity dateEntity = new DateEntity();
        LocalDate fecha = date.plusDays(days);
        dateEntity.setYear(fecha.getYear());
        dateEntity.setMonth(fecha.getMonthValue());
        dateEntity.setDay(fecha.getDayOfMonth());
        return ResponseEntity.ok(dateEntity);
    }

    public ResponseEntity<DateEntity> changeDate(DateEntity dateEntity) {
        // dateEntity contendria los nuevos valores de año, mes y día proporcionados en la solicitud POST.
        // Se puede acceder a estos valores con dateEntity.getYear(), dateEntity.getMonth(), dateEntity.getDay().
        // A continuación, se podría actualizar la fecha del sistema con estos valores si se poseen los permisos adecuados.
        // Aquí iría la implementación para actualizar la fecha en el sistema.

        return null;
    }
}
