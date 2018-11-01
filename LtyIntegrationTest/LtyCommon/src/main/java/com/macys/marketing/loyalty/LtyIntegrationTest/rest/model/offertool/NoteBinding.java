package com.macys.marketing.loyalty.LtyIntegrationTest.rest.model.offertool;

import java.io.Serializable;
import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * The Class NoteBinding.
 * This Object contains the Note information if the offer
 * @author vpula
 * @since 7/28/17
 */
@JsonRootName("note")
public class NoteBinding implements Serializable{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The note. */
	private String note;
	
	/** The note by. */
	private String noteBy;
	
	/** The note dt. */
	private String noteDt;
	
	/** The last update ts. */
	private Timestamp lastUpdateTs;
	
	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}
	
	/**
	 * @param note the new note
	 */
	public void setNote(String note) {
		this.note = note;
	}
	
	/**
	 * @return the note by
	 */
	public String getNoteBy() {
		return noteBy;
	}
	
	/**
	 * @param noteBy the new note by
	 */
	public void setNoteBy(String noteBy) {
		this.noteBy = noteBy;
	}
	
	/**
	 * @return the note dt
	 */
	public String getNoteDt() {
		return noteDt;
	}
	
	/**
	 * @param noteDt the new note dt
	 */
	public void setNoteDt(String noteDt) {
		this.noteDt = noteDt;
	}
	
	/**
	 * @return the last update ts
	 */
	public Timestamp getLastUpdateTs() {
		return lastUpdateTs;
	}
	
	/**
	 * @param lastUpdateTs the new last update ts
	 */
	public void setLastUpdateTs(Timestamp lastUpdateTs) {
		this.lastUpdateTs = lastUpdateTs;
	}
	

}
