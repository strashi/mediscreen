package com.mediscreen.practitionersnotesapi.web.controller;

import com.mediscreen.practitionersnotesapi.model.Note;
import com.mediscreen.practitionersnotesapi.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NoteController {

    @Autowired
    private NoteRepository noteRepository;

    @GetMapping("/patHistory/{patId}")
    public List<Note> getPatientNote(@PathVariable Long patId){
        return noteRepository.findByPatId(patId);
    }

    @PostMapping("/patHistory/add")
    public Note addNote(@RequestBody Note note){
        return noteRepository.insert(note);
    }
}
