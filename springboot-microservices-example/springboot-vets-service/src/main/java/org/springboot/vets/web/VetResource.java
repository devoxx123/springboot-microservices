
package org.springboot.vets.web;

//import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springboot.vets.model.Vet;
import org.springboot.vets.model.VetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/vets")
@RestController
//@RequiredArgsConstructor
class VetResource {

	@Autowired
    private VetRepository vetRepository;

    @GetMapping
    public List<Vet> showResourcesVetList() {
        return vetRepository.findAll();
    }
}
