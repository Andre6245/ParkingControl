package br.com.parking.parking.services;


import org.hibernate.mapping.List;
import org.springframework.stereotype.Service;

import br.com.parking.parking.repository.ParkingSpotModel;
import jakarta.transaction.Transactional;

@Service

public class ParkingSpotService {

    final ParkingSpotRepository parkingSpotRepository;

    ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }
    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return parkingSpotRepository.save(parkingSpotModel);
    }
    public boolean existsByLicensePlateCar(String licensePlatecar) {
        return parkingSpotRepository.existsByLicensePlateCar(licensePlatecar);
    }
    public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
        return parkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
    }
    public boolean existsByApartmentAndBlock(String apartment, String block) {
        return parkingSpotRepository.existsByApartmentAndBlock( apartment, block);

    }
   
    
    public List findAll() {
        return parkingSpotRepository.findAll();
    }
    
}
