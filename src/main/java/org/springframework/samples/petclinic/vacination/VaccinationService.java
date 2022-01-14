package org.springframework.samples.petclinic.vacination;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VaccinationService {
	
	@Autowired
	private VaccinationRepository vaccinationRepository;
	
    public List<Vaccination> getAll(){
    	List<Vaccination> v = vaccinationRepository.findAll();
        return v;
    }

    public List<Vaccine> getAllVaccines(){
        return null;
    }

    public Vaccine getVaccine(String typeName) {
        return null;
    }

    public Vaccination save(Vaccination p) throws UnfeasibleVaccinationException {
        return null;       
    }

    
}
