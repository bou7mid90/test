package com.esprit.ToDOList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class tache {
	
	private int id;
	
	
	private String titre;
	 private String date;
	 private String priorite;


@XmlAttribute(name="id")
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

@XmlAttribute(name="titre")
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}

@XmlAttribute(name="date")
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}

@XmlAttribute(name="priorite")
public String getPriorite() {
	return priorite;
}
public void setPriorite(String priorite) {
	this.priorite = priorite;
}



@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	result = prime * result
			+ ((priorite == null) ? 0 : priorite.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	tache other = (tache) obj;
	if (id != other.id)
		return false;
	if (priorite == null) {
		if (other.priorite != null)
			return false;
	} else if (!priorite.equals(other.priorite))
		return false;
	return true;
}


}


