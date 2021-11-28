package com.Citas_MS.CitasMS.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Citas_MS.CitasMS.models.Citas;

public interface CitasRepository extends MongoRepository<Citas, String > {

}
