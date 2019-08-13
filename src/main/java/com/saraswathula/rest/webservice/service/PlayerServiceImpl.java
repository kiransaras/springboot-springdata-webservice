package com.saraswathula.rest.webservice.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.saraswathula.rest.webservice.dao.PlayerRepository;
import com.saraswathula.rest.webservice.models.Player;

// TODO: Auto-generated Javadoc
/**
 * The Class PlayerServiceImpl.
 */
@Component("playerService")
public class PlayerServiceImpl implements PlayerService {

	static final Logger LOGGER = LoggerFactory.getLogger(PlayerServiceImpl.class);

	/** The player repository. */
	@Autowired
	private PlayerRepository playerRepository;

	/**
	 * Sets the player repository.
	 *
	 * @param playerRepository
	 *            the new player repository
	 */
	public void setPlayerRepository(PlayerRepository playerRepository) {
		this.playerRepository = playerRepository;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.saraswathula.rest.webservice.service.PlayerService#retrievePlayers()
	 */
	@Override
	public List<Player> retrievePlayers() {
		LOGGER.info("in retrievePlayers method");
		List<Player> players = playerRepository.findAll();
		return players;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.saraswathula.rest.webservice.service.PlayerService#getPlayer(java.lang.
	 * Long)
	 */
	@Override
	public Optional<Player> getPlayer(Long playerId) {
		LOGGER.info("in getPlayer method");
		Optional<Player> optPlayer = playerRepository.findById(playerId);
		return optPlayer;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.saraswathula.rest.webservice.service.PlayerService#savePlayer(com.
	 * saraswathula.rest.webservice.models.Player)
	 */
	@Override
	public Player savePlayer(Player player) {
		LOGGER.info("in savePlayer method");
		return playerRepository.save(player);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.saraswathula.rest.webservice.service.PlayerService#deletePlayer(java.lang
	 * .Long)
	 */
	@Override
	public void deletePlayer(Long id) {
		LOGGER.info("in deletePlayer method");
		playerRepository.deleteById(id);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.saraswathula.rest.webservice.service.PlayerService#updatePlayer(com.
	 * saraswathula.rest.webservice.models.Player)
	 */
	@Override
	public Player updatePlayer(Player player) {
		LOGGER.info("in updatePlayer method");
		return playerRepository.save(player);

	}

}
