package com.thoughtworks;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

  private String name;
  private String strasse;
  private String zip;
  private String city;
}
