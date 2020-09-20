package com.example.notebook.listeners;

import com.example.notebook.entities.Note;

public interface NotesListener {
    void onNoteCliked(Note note , int position)  ;
}
