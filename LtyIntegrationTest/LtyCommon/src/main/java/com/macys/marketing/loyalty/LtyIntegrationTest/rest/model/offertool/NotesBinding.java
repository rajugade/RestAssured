package com.macys.marketing.loyalty.LtyIntegrationTest.rest.model.offertool;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * The Class NotesBinding.
 * This object contaion the List of Notes of the offer
 * @author vpula
 * @since 7/28/17
 */
@JsonRootName("notes")
public class NotesBinding implements Serializable {
	
	private static final long serialVersionUID = 1L;
	/** The note. */
	private List<NoteBinding> note;

	/**
	 * @return the note
	 */
	public List<NoteBinding> getNote() {
		return note;
	}

	/**
	 * @param note the new note
	 */
	public void setNote(List<NoteBinding> note) {
		this.note = note;
	}

}
