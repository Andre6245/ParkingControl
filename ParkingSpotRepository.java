package br.com.parking.parking.services;

import org.hibernate.mapping.List;

import br.com.parking.parking.repository.ParkingSpotModel;

public class ParkingSpotRepository {

    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return null;
    }

    public boolean existsByLicensePlateCar(String licensePlatecar) {
        return false;
    }

    public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
        return false;
    }

    public boolean existsByApartmentAndBlock(String apartment, String block) {
        return false;
    }

    public List findAll() {
        return null;
    }

}
