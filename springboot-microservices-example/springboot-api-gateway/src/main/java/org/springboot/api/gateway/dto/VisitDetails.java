
package org.springboot.api.gateway.dto;

//import lombok.NoArgsConstructor;
//import lombok.Value;

//@Value
//@NoArgsConstructor
public class VisitDetails {

	private Integer id;
	private Integer petId;
	private String date;
	private String description;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPetId() {
		return petId;
	}

	public void setPetId(Integer petId) {
		this.petId = petId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
