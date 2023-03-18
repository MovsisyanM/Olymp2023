package com.epam.olympiad.transportation.repository.entity;

import javax.persistence.*;

@Entity
public class Route {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  @Column(name = "route_id")
  private long routeId;

  @Column(name = "order_number")
  private int orderNumber;

  @Column(name = "workload_index")
  private int workloadIndex;

  @Column(name = "column_index")
  private int usageIndex;

  @Column(name = "start_date")
  private long startDate;

  @Column(name = "end_date")
  private long endDate;

  @Column(name = "address_id")
  private int addressId;
}
