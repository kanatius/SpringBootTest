package models;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@SuppressWarnings("serial")
@MappedSuperclass
public abstract class EntidadeAbstrata implements Serializable{

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
