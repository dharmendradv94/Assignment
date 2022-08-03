package dk.it.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int projId;
	private String projName;
	public Project(int projId, String projName) {
		super();
		this.projId = projId;
		this.projName = projName;
	}
	public Project() {

	}
	public int getProjId() {
		return projId;
	}
	public void setProjId(int projId) {
		this.projId = projId;
	}
	public String getProjName() {
		return projName;
	}
	public void setProjName(String projName) {
		this.projName = projName;
	}
	@Override
	public String toString() {
		return "Project [projId=" + projId + ", projName=" + projName + "]";
	}
	
	
}
