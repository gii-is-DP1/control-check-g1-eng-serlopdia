package org.springframework.samples.petclinic.vacination;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.pet.Pet;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "vaccination")
public class Vaccination{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    Integer id;

    @DateTimeFormat(pattern = "yyyy/MM/dd")
    LocalDate date;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "vaccinated_pet_id")
    Pet vaccinatedPet;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "vaccine_id")
    Vaccine vaccine;

}