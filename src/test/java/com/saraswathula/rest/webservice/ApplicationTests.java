package com.saraswathula.rest.webservice;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.saraswathula.rest.webservice.models.Paragraph;
import com.saraswathula.rest.webservice.models.Player;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ApplicationTests {
	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void healthTest() {
		ResponseEntity<String> entity = this.restTemplate.getForEntity("/api/health", String.class);
		assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(entity.getBody()).isEqualTo("Health OK");
	}

	@Test
	public void wordFrequencyTestWithCorrectPayloadTest() {
		Paragraph paragraph = new Paragraph();
		paragraph.setPara("beta alpha gamma delta alpha.");
		HttpEntity<Paragraph> request = new HttpEntity<>(paragraph);
		Object[] freq = restTemplate.postForObject("/api/wordfrequency", request, Object[].class);
		assertTrue(freq.length > 0);

	}

	@Test
	public void getplayersTest() {
		ResponseEntity<Object[]> res = this.restTemplate.getForEntity("/v/players", Object[].class);
		assertTrue(res.getBody().length > 0);
	}

	@Test
	public void getplayersByIDTest() {
		ResponseEntity<Player> entity = this.restTemplate.getForEntity("/v/players/1", Player.class);

		assertTrue(entity.getStatusCodeValue() == 200);
	}

	@Test
	public void postPlayersTest() {
		Player requestPlayer = new Player();
		requestPlayer.setGoals(33);
		requestPlayer.setId((47l));
		requestPlayer.setWeight(180.0);
		HttpEntity<Player> request = new HttpEntity<>(requestPlayer);
		Player player = restTemplate.postForObject("/v/players", request, Player.class);
		assertTrue(player.getGoals() == 33);
	}
}
