package com.saraswathula.rest.webservice.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Player.
 */
@Entity
@Table(name = "player")
public class Player {

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", team=" + team + ", position=" + position + ", weight="
				+ weight + ", goals=" + goals + "]";
	}

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/** The name. */
	private String name;
	
	/** The team. */
	private String team;
	
	/** The position. */
	private String position;
	
	/** The weight. */
	private double weight;
	
	/** The goals. */
	private int goals;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the team.
	 *
	 * @return the team
	 */
	public String getTeam() {
		return team;
	}

	/**
	 * Sets the team.
	 *
	 * @param team the new team
	 */
	public void setTeam(String team) {
		this.team = team;
	}

	/**
	 * Gets the position.
	 *
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * Sets the position.
	 *
	 * @param position the new position
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * Gets the weight.
	 *
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * Sets the weight.
	 *
	 * @param weight the new weight
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * Gets the goals.
	 *
	 * @return the goals
	 */
	public int getGoals() {
		return goals;
	}

	/**
	 * Sets the goals.
	 *
	 * @param goals the new goals
	 */
	public void setGoals(int goals) {
		this.goals = goals;
	}

}