package org.springframework.samples.petclinic.vacination;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.pet.PetType;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "vaccine")
public class Vaccine extends BaseEntity{

    @Column(name="id")
    Integer id;

    @NotEmpty
    @Size(min = 3, max=50)
    @Column(name = "name", unique = true)
    String name;

    @NotNull
    @Min(0)
    Double price;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "pet_type_id")
    PetType petType;
}