package com.surver.controllers;

import com.surver.dtos.delete.DeleteDTO;
import com.surver.dtos.participation.*;
import com.surver.services.ParticipationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ParticipationController {
    private final ParticipationService participationService;

    @Autowired
    public ParticipationController(ParticipationService participationService){
        this.participationService = participationService;
    }
    @GetMapping("/participations")
    public ResponseEntity<ListOfParticipationsDTO> getListOfparticipationsDTO() {
        return ResponseEntity.ok(participationService.getListOfparticipations());
    }
    @GetMapping("/participations/{id}")
    public ResponseEntity<ParticipationDTO> getparticipationDTO(@PathVariable Long id) {
        return ResponseEntity.ok(participationService.getParticipationByID(id));
    }
    @PostMapping("/participation")
    public ResponseEntity<ParticipationDTO> createparticipation(ParticipationDTO participationDTO) {
        return ResponseEntity.ok(participationService.createParticipationByParticipationDTO(participationDTO));
    }
    @PutMapping("/participation")
    public ResponseEntity<ParticipationDTO> updateParticipationByParticipationDTO(ParticipationDTO participationDTO) {
        return ResponseEntity.ok(participationService.updateParticipationByParticipationDTO(participationDTO));
    }
    @DeleteMapping("/participation")
    public ResponseEntity<DeleteDTO> deleteparticipation(ParticipationDTO participationDTO) {
        return ResponseEntity.ok(participationService.deleteParticipationByParticipationDTO(participationDTO));
    }
    @DeleteMapping("/participation/{id}")
    public ResponseEntity<DeleteDTO> deleteparticipationById(@PathVariable Long id) {
        return ResponseEntity.ok(participationService.deleteParticipationByParticipationID(id));
    }
}
