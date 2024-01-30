package com.microsservico.projectdemo1.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produto {

    private int Id;
    private String Name;
    private int Amount;
    private double Price;

}
