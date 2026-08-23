package com.example.demo.service;

import com.example.demo.entity.Appointment;
import com.example.demo.repo.AppointmentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    private final AppointmentRepo repo;

    public AppointmentService(AppointmentRepo repo) {
        this.repo = repo;
    }

    public Appointment save(Appointment appointment) {
        return repo.save(appointment);
    }

    public List<Appointment> getAll() {
        return repo.findAll();
    }

    public Appointment getById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    public Appointment update(Integer id, Appointment appointment) {
        appointment.setAppointmentId(id);
        return repo.save(appointment);
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }
}