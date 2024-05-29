package in.ashokit.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.CityEntity;
import in.ashokit.entity.CountryEntity;
import in.ashokit.entity.UserEntity;

public interface CountryRepo extends JpaRepository<CountryEntity, Integer> {
	
	public  List<CountryEntity> findByCountryId(Integer countryId);

}