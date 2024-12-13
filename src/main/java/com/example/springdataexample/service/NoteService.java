package com.example.springdataexample.service;


import com.example.springdataexample.model.Note;
import com.example.springdataexample.repository.NoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    private final NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public List<Note> findAll() {
        return noteRepository.findAll();
    }

    public Note save(Note note) {
        return noteRepository.save(note);
    }
}

