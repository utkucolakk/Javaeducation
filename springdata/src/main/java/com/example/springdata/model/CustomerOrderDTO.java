package com.example.springdata.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class CustomerOrderDTO {

    private String customerName;
    private String orderName;

}
