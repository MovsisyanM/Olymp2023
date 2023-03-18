package com.epam.olympiad.transportation.service;

import com.epam.olympiad.transportation.model.AddressResponse;
import com.epam.olympiad.transportation.model.RouteRequest;
import com.epam.olympiad.transportation.model.RouteResponse;
import com.epam.olympiad.transportation.repository.RouteInfo;
import com.epam.olympiad.transportation.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class RouteService implements BaseService<RouteRequest, RouteResponse> {
  private final RouteRepository repository;
  private final AddressService addressService;

  @Autowired
  public RouteService(RouteRepository repo, AddressService addressService) {
    this.repository = repo;
    this.addressService = addressService;
  }

  @Override
  public ResponseEntity<Page<RouteResponse>> getList(Map<String, String> requestParameters) {
    int offset = Integer.parseInt(requestParameters.get("offset"));
    int limit = Integer.parseInt(requestParameters.get("limit"));

    List<RouteInfo> routeInfoList = repository.getRouteInfoList(
      PageRequest.of(offset, limit)
    );



    return null;
  }

  @Override
  public ResponseEntity<RouteResponse> listRecordByID(Long id) {
    throw new UnsupportedOperationException();
  }

  @Override
  public ResponseEntity<Long> createNewRecord(RouteRequest request) {
    throw new UnsupportedOperationException();
  }

  @Override
  public ResponseEntity<Long> updateExistingRecord(RouteRequest request, Long id) {
    throw new UnsupportedOperationException();
  }

  @Override
  public ResponseEntity<String> deleteExistingRecord(Long id) {
    throw new UnsupportedOperationException();
  }

}
