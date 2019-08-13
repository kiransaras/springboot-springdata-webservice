package com.saraswathula.rest.webservice.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.saraswathula.rest.webservice.dao.PlayerRepository;
import com.saraswathula.rest.webservice.models.Player;

@RunWith(SpringRunner.class)
public class PlayerServiceImplIntegrationTest {

	@TestConfiguration
	static class PlayerServiceImplTestContextConfiguration {

		@Bean
		public PlayerService playerServiceMock() {
			return new PlayerServiceImpl();
		}
	}

	@Autowired
	private PlayerService playerService;

	@MockBean
	private PlayerRepository playerRepository;

	@Before
	public void setUp() {
		Player player = new Player();
		player.setGoals(33);
		player.setId(2l);
		List<Player> playerList = new ArrayList<>();

		Mockito.when(playerRepository.findAll()).thenReturn(playerList);
		Mockito.when(playerRepository.save(player)).thenReturn(player);

	}

	@Test
	public void retrievePlayerTest() {

		List<Player> playerListFound = playerService.retrievePlayers();

		assertThat(playerListFound.size() == 1);

	}

	@Test
	public void savePlayerTest() {

		Player player = new Player();
		player.setGoals(9);
		player.setWeight(90);
		player.setId(2l);
		Mockito.when(playerRepository.save(player)).thenReturn(player);
		Player playerFound = playerService.savePlayer(player);

		assertThat(playerFound.getGoals() == 33);

	}

	@Test
	public void updatePlayerTest() {

		Player player = new Player();
		player.setGoals(44);
		Mockito.when(playerRepository.save(player)).thenReturn(player);
		Player playerFound = playerService.updatePlayer(player);
		System.out.println();

		assertThat(playerFound.getGoals() == 33);

	}
}