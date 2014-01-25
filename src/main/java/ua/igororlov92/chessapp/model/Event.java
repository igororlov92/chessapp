package ua.igororlov92.chessapp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import ua.igororlov92.chessapp.model.base.BaseEntity;

@Entity
@Table(name = "event")
public class Event extends BaseEntity {
	
	@NotNull
	private String name;
	
	@NotNull
	private String description;

	@NotNull
	private String place;
	
	@NotNull
	@ManyToOne(fetch = FetchType.EAGER)
	private UserAccount createdByUserAccount;
	
	@NotNull
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime createdTime;
	
	@NotNull
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime deadlineTime;
	
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime startTime;
	
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime endTime;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "event_form_field", joinColumns = { 
			@JoinColumn(name = "id", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "id", 
					nullable = false, updatable = false) })
	private Set<FormField> formFields = new HashSet<FormField>(0);
	
	@NotNull
	private Boolean withGroups;


	/*@NotNull
	private School school;*/
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public UserAccount getCreatedByUserAccount() {
		return createdByUserAccount;
	}

	public void setCreatedByUserAccount(UserAccount createdByUserAccount) {
		this.createdByUserAccount = createdByUserAccount;
	}

	public DateTime getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(DateTime createdTime) {
		this.createdTime = createdTime;
	}

	public DateTime getDeadlineTime() {
		return deadlineTime;
	}

	public void setDeadlineTime(DateTime deadlineTime) {
		this.deadlineTime = deadlineTime;
	}

	public DateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(DateTime startTime) {
		this.startTime = startTime;
	}

	public DateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(DateTime endTime) {
		this.endTime = endTime;
	}

	public Set<FormField> getFormFields() {
		return formFields;
	}

	public void setFormFields(Set<FormField> formFields) {
		this.formFields = formFields;
	}

	public Boolean getWithGroups() {
		return withGroups;
	}

	public void setWithGroups(Boolean withGroups) {
		this.withGroups = withGroups;
	}
	
}
