package com.epam.olympiad.transportation.repository;

import com.epam.olympiad.transportation.repository.entity.Route;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RouteRepository extends JpaRepository<Route, Long> {
  @Query(
    value = "SELECT route_id as id, AVG(workload_index) as workloadIndex, AVG(usage_index) as usageIndex, MIN(start_date) as startDate, MAX(end_date) as endDate,\n" +
      "      MIN(address_id) as startAddressId, MAX(address_id) as endAddressId\n" +
      "FROM `route` \n" +
      "GROUP BY route_id\n" +
      "ORDER BY order_number ASC;",
    nativeQuery = true
  )
  List<RouteInfo> getRouteInfoList(Pageable pageable);
}
