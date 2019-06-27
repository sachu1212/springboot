package qa.nationwide1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import qa.nationwide1.model.Note;
import qa.nationwide1.repository.NotesRepository;

@RestController
@RequestMapping("api/v1")
public class NotesController {
	
	@Autowired
	private NotesRepository notesRepository;
	
	@RequestMapping(value = "notes", method = RequestMethod.GET)
	public List<Note> list(){
		return notesRepository.findAll();
	}
	
	@RequestMapping(value = "notes", method = RequestMethod.POST)
	public Note create(@RequestBody Note note) {
		return notesRepository.saveAndFlush(note);
	}
	
	@RequestMapping(value = "notes/{id}", method = RequestMethod.GET)
	public Note getNote(@PathVariable Long id) {
		return notesRepository.findOne(id);
	}

	@RequestMapping(value = "notes/{id}", method = RequestMethod.DELETE)
	public Note delete(@PathVariable Long id) {
		Note existingNote = notesRepository.findOne(id);
		notesRepository.delete(existingNote);
			return existingNote;
	}
	
}
