package com.example.demo.repositorios;

import com.example.demo.entidades.Apicultor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface RepositorioApicultores extends JpaRepository<Apicultor, String> {

    @Query(value = "SELECT * FROM Apicultores WHERE numero_apiarios > :n1", nativeQuery = true)
    public List<Apicultor> getApicultoresUpToNumeroApiarios(
            @Param("n1") Integer n1
    );



}
