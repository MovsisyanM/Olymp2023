package com.epam.olympiad.transportation.repository;

import com.epam.olympiad.transportation.repository.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AddressRepository extends JpaRepository<Address, Long> {

  @Query(value = "")
  void updateAddressById(Long id, String buildingName, String streetName, String cityName);
}
