package com.example.springdataexample.repository;


import com.example.springdataexample.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
