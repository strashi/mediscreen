package com.mediscreen.practitionersnotesapi.repository;

import com.mediscreen.practitionersnotesapi.model.Note;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepository extends MongoRepository<Note, String> {
    List<Note> findByPatId(Long patId);

    @Query("{'patId' : ?0}")
    List<String> findNotesByPatId(Long patId);
}
