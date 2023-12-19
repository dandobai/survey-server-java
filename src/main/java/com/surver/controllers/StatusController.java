package com.surver.controllers;

import com.surver.dtos.delete.DeleteDTO;
import com.surver.dtos.status.*;
import com.surver.services.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StatusController {
    private final StatusService statusService;

    @Autowired
    public StatusController(StatusService statusService){
        this.statusService = statusService;
    }
    @GetMapping("/status")
    public ResponseEntity<ListOfStatusDTO> getListOfStatusDTO() {
        return ResponseEntity.ok(statusService.getListOfStatus());
    }
    @GetMapping("/status/{id}")
    public ResponseEntity<StatusDTO> getstatusDTO(@PathVariable String id) {
        return ResponseEntity.ok(statusService.getStatusById(id));
    }
    @PostMapping("/addstatus")
    public ResponseEntity<StatusDTO> createstatus(StatusDTO statusDTO) {
        return ResponseEntity.ok(statusService.createStatusByStatusDTO(statusDTO));
    }
    @PutMapping("/updatestatus")
    public ResponseEntity<StatusDTO> updatestatus(StatusDTO statusDTO) {
        return ResponseEntity.ok(statusService.updateStatusByStatusDTO(statusDTO));
    }
    @DeleteMapping("/deletestatus")
    public ResponseEntity<DeleteDTO> deletestatus(StatusDTO statusDTO) {
        return ResponseEntity.ok(statusService.deletestatusBystatusDTO(statusDTO));
    }
    @DeleteMapping("/deletestatus/{id}")
    public ResponseEntity<DeleteDTO> deleteStatusById(@PathVariable Long id) {
        return ResponseEntity.ok(statusService.deleteStausByStatusId(id));
    }
}
