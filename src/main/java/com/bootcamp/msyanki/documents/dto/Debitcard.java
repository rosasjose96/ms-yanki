package com.bootcamp.msyanki.documents.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Debitcard implements Serializable {

    private static final long serialVersionUID = 4406836646813129971L;

    private String pan;
    private String password;
}
