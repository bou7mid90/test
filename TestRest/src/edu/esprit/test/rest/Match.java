package edu.esprit.test.rest;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Match {
	private int id;
	 private String date;
	 private String score;
	 private String equipe;
	

public Match(){
	
}
@XmlAttribute(name="id")
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}
@XmlAttribute(name="Date")
public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public String getScore() {
	return score;
}

public void setScore(String score) {
	this.score = score;
}
public String getEquipe() {
	return equipe;
}
public void setEquipe(String equipe) {
	this.equipe = equipe;
}
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((date == null) ? 0 : date.hashCode());
	result = prime * result + ((equipe == null) ? 0 : equipe.hashCode());
	result = prime * result + id;
	result = prime * result + ((score == null) ? 0 : score.hashCode());
	return result;
}
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Match other = (Match) obj;
	if (date == null) {
		if (other.date != null)
			return false;
	} else if (!date.equals(other.date))
		return false;
	if (equipe == null) {
		if (other.equipe != null)
			return false;
	} else if (!equipe.equals(other.equipe))
		return false;
	if (id != other.id)
		return false;
	if (score == null) {
		if (other.score != null)
			return false;
	} else if (!score.equals(other.score))
		return false;
	return true;
}



}
