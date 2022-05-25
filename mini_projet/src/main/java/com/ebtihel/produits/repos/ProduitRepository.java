package com.ebtihel.produits.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ebtihel.produits.entities.Categorie;
import com.ebtihel.produits.entities.Norriture;
    @RepositoryRestResource(path = "rest")
	public interface ProduitRepository extends JpaRepository<Norriture, Long> {
		

	}
	

