package qa.nationwide1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

}
