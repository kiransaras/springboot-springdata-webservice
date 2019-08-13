package com.saraswathula.rest.webservice.resource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.saraswathula.rest.webservice.exception.ResourceNotFoundException;
import com.saraswathula.rest.webservice.models.Player;
import com.saraswathula.rest.webservice.service.PlayerService;

// TODO: Auto-generated Javadoc
/**
 * The Class PlayerResource.
 */
@Path("v")

@RestController
public class PlayerResource {

	static final Logger LOGGER = LoggerFactory.getLogger(PlayerResource.class);

	/** The player service. */
	@Autowired
	@Qualifier("playerService")
	private PlayerService playerService;

	/**
	 * Sets the player service.
	 *
	 * @param playerService
	 *            the new player service
	 */
	public void setplayerService(PlayerService playerService) {
		this.playerService = playerService;
	}

	/**
	 * Gets the players.
	 *
	 * @return the players
	 */
	@GET
	@Path("/players")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Player> getplayers() {
		LOGGER.info("in getplayers method");
		List<Player> players = playerService.retrievePlayers();
		return players;
	}

	/**
	 * Gets the player.
	 *
	 * @param id
	 *            the id
	 * @return the player
	 * @throws ResourceNotFoundException
	 *             the resource not found exception
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/players/{id}")
	public ResponseEntity<Player> getplayer(@PathParam("id") Long id) throws ResourceNotFoundException {
		LOGGER.info("in getplayer method" + "id::" + id);
		Player player = playerService.getPlayer(id)
				.orElseThrow(() -> new ResourceNotFoundException("Player not found for this id :: " + id));

		return ResponseEntity.ok().body(player);

	}

	/**
	 * Saveplayer.
	 *
	 * @param player
	 *            the player
	 * @return the player
	 */
	@Path("/players")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Player saveplayer(@Valid Player player) {
		LOGGER.info("in saveplayer method" + "player ::" + player.toString());
		return playerService.savePlayer(player);

	}

	/**
	 * Deleteplayer.
	 *
	 * @param id
	 *            the id
	 * @return the map
	 * @throws ResourceNotFoundException
	 *             the resource not found exception
	 */
	@Path("/players/{id}")
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public Map<String, Boolean> deleteplayer(@PathParam("id") Long id) throws ResourceNotFoundException {
		LOGGER.info("in deleteplayer method" + "id::" + id);
		Player player = playerService.getPlayer(id)
				.orElseThrow(() -> new ResourceNotFoundException("Player not found for this id :: " + id));
		playerService.deletePlayer(player.getId());
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;

	}

	/**
	 * Updateplayer.
	 *
	 * @param player
	 *            the player
	 * @param playerId
	 *            the player id
	 * @return the response entity
	 * @throws ResourceNotFoundException
	 *             the resource not found exception
	 */
	@Path("/players/{playerId}")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseEntity<Player> updateplayer(@Valid Player player, @PathParam("playerId") Long playerId)
			throws ResourceNotFoundException {
		LOGGER.info("in deleteplayer method" + "id::" + playerId);
		Player playerCheck = playerService.getPlayer(playerId)
				.orElseThrow(() -> new ResourceNotFoundException("Player not found for this id :: " + playerId));

		if (playerCheck == null) {
			throw new ResourceNotFoundException("no player with id ::" + playerId);
		}

		Player updatedPlayer = playerService.updatePlayer(player);

		return ResponseEntity.ok().body(updatedPlayer);
	}

}
