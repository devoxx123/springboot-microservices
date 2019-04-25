
package org.springboot.api.gateway.dto;

import java.util.List;

//import lombok.NoArgsConstructor;
//import lombok.Value;

//@Value
//@NoArgsConstructor
public class Visits {

	private List<VisitDetails> items;

	public List<VisitDetails> getItems() {
		return items;
	}

	public void setItems(List<VisitDetails> items) {
		this.items = items;
	}

}
