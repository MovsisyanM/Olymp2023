package com.epam.olympiad.transportation.repository;

public interface RouteInfo {
  Long getId();
  Double getWorkloadIndex();
  Double getUsageIndex();
  Long getStartDate();
  Long getEndDate();
  Integer getStartAddressId();
  Integer getEndAddressId();
}
