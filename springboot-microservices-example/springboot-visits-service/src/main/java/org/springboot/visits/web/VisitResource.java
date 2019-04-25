
package org.springboot.visits.web;

import java.util.List;
import javax.validation.Valid;

import io.micrometer.core.annotation.Timed;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springboot.visits.model.Visit;
import org.springboot.visits.model.VisitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
@Timed("petclinic.visit")
class VisitResource {

	private static final Logger LOGGER = LoggerFactory.getLogger(VisitResource.class);

	@Autowired
	private VisitRepository visitRepository;

	@PostMapping("owners/*/pets/{petId}/visits")
	@ResponseStatus(HttpStatus.CREATED)
	void create(@Valid @RequestBody Visit visit, @PathVariable("petId") int petId) {
		visit.setPetId(petId);
		LOGGER.info("Saving visit {}", visit);
		visitRepository.save(visit);
	}

	@GetMapping("owners/*/pets/{petId}/visits")
	List<Visit> visits(@PathVariable("petId") int petId) {
		LOGGER.info("Fetch By visit {}", petId);
		return visitRepository.findByPetId(petId);
	}

	/*@GetMapping("pets/visits")
	Visits visitsMultiGet(@RequestParam("petId") List<Integer> petIds) {
	    List<Visit> byPetIdIn = visitRepository.findByPetIdIn(petIds);
		LOGGER.info("Fetch By visit {}", petIds);
		return new Visits();
	}

	@Value
	static class Visits {
		 List<Visit> items;
	}*/
}
