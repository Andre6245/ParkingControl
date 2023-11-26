package br.com.parking.parking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface parkingSpotRepository extends JpaRepository <ParkingSpotModel, UUI> {
    
}
