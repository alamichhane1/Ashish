package medicalapp;

import java.util.*;

public class Appointment {

	private String id;
	private Date appDateTime;
	private double duration;
	private String reason;
	private String status;
	private String note;
	private String docId;
	private String patId;

	public Appointment(Date appDateTime, double duration, String reason, String status, String note, String docId, String patId) {

		this.id = Utility.generateID();
		this.appDateTime = appDateTime;
		this.duration = duration;
		this.reason = reason;
		this.status = status;
		this.note = note;
		this.docId = docId;
		this.patId = patId;
	}

	public Date getAppDateTime() {

		return appDateTime;
	}

	public void setAppDateTime(Date appDateTime) {

		this.appDateTime = appDateTime;
	}

	public double getDuration() {

		return duration;
	}

	public void setDuration(double duration) {

		this.duration = duration;
	}

	public String getReason() {

		return reason;
	}

	public void setReason(String reason) {

		this.reason = reason;
	}

	public String getStatus() {

		return status;
	}

	public void setStatus(String status) {

		this.status = status;
	}

	public String getNote() {

		return note;
	}

	public void setNote(String note) {

		this.note = note;
	}

	public String getDocId() {

		return docId;
	}

	public void setDocId(String docId) {

		this.docId = docId;
	}

	public String getPatId() {

		return patId;
	}

	public void setPatId(String patId) {

		this.patId = patId;
	}

	public String getId() {

		return id;
	}

}
