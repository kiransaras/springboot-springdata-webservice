package com.saraswathula.rest.webservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saraswathula.rest.webservice.models.Player;

/**
 * The Interface PlayerRepository.
 */
@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

}