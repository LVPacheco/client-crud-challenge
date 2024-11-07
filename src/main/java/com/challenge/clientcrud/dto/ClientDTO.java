package com.challenge.clientcrud.dto;

import com.challenge.clientcrud.entities.Client;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class ClientDTO {

    private Long id;
    @NotBlank(message = "Name must not be blank")
    private String name;
    @Size(min = 11,  max = 11, message = "Invalid CPF")
    private String cpf;
    @Positive(message = "Income must a positive value")
    private Double income;
    @PastOrPresent(message = "Birth date cannot be after the current date")
    private LocalDate birthDate;
    @PositiveOrZero(message = "Number of children cannot be negative")
    private Integer children;


    public ClientDTO() {}

    public ClientDTO(Client entity) {
        id = entity.getId();
        name = entity.getName();
        cpf = entity.getCpf();
        income = entity.getIncome();
        birthDate = entity.getBirthDate();
        children = entity.getChildren();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }
}
