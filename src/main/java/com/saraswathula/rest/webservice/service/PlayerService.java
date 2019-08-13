package com.saraswathula.rest.webservice.service;

import java.util.List;
import java.util.Optional;

import com.saraswathula.rest.webservice.models.Player;


/**
 * The Interface PlayerService.
 */
public interface PlayerService {
	
	/**
	 * Retrieve players.
	 *
	 * @return the list
	 */
	public List<Player> retrievePlayers();

	/**
	 * Gets the player.
	 *
	 * @param id the id
	 * @return the player
	 */
	public Optional<Player> getPlayer(Long id);

	/**
	 * Save player.
	 *
	 * @param player the player
	 * @return the player
	 */
	public Player savePlayer(Player player);

	/**
	 * Delete player.
	 *
	 * @param id the id
	 */
	public void deletePlayer(Long id);

	/**
	 * Update player.
	 *
	 * @param player the player
	 * @return the player
	 */
	public Player updatePlayer(Player player);
}