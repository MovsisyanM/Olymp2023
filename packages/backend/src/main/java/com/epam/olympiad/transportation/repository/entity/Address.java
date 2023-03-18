package com.epam.olympiad.transportation.repository.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Address {

  @Id()
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  @Column(name = "building_name")

  private String buildingName;

  @Column(name = "street_name")
  private String streetName;

  @Column(name = "city_name")
  private String cityName;
}
