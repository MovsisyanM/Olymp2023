package com.epam.olympiad.transportation.service;

import com.epam.olympiad.transportation.model.AddressRequest;
import com.epam.olympiad.transportation.model.AddressResponse;
import com.epam.olympiad.transportation.repository.AddressRepository;
import com.epam.olympiad.transportation.repository.entity.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class AddressService implements BaseService<AddressRequest, AddressResponse> {

  private AddressRepository repository;

  @Autowired
  public AddressService(AddressRepository repository) {
    this.repository = repository;
  }

  @Override
  public ResponseEntity<Page<AddressResponse>> getList(Map<String, String> requestParameters) {
    throw new UnsupportedOperationException();
  }

  public List<AddressResponse> getAddressesById(List<Integer> ids) {
    List<Address> addresses = repository.findByIdIn(ids);
    return addresses.stream().map(
      address -> {
        AddressResponse response = new AddressResponse();
        response.setBuildingNo(address.getBuildingName());
        response.setCityName(address.getCityName());
        response.setStreet(address.getStreetName());
        return response;
      }
    ).collect(Collectors.toList());
  }

  @Override
  public ResponseEntity<AddressResponse> listRecordByID(Long id) {
    throw new UnsupportedOperationException();
  }

  @Override
  public ResponseEntity<Long> createNewRecord(AddressRequest request) {
    Address address = new Address();
    address.setBuildingName(request.getBuildingNo());
    address.setCityName(request.getCityID());
    address.setStreetName(request.getStreet());
    repository.save(address);

    return new ResponseEntity(HttpStatus.CREATED);
  }

  @Override
  public ResponseEntity<Long> updateExistingRecord(AddressRequest request, Long id) {

    throw new UnsupportedOperationException();
  }

  @Override
  public ResponseEntity<String> deleteExistingRecord(Long id) {
    throw new UnsupportedOperationException();
  }

}
