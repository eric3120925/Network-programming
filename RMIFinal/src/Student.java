import java.io.Serializable;

public class Student implements Serializable{
	private String id, name, score;

	public String getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getScore() {
		return score;
	}

	public void setID(String id) {
		this.id=id;
	}

	public void setName(String name) {
		this.name=name;
	}

	public void setScore(String score) {
		this.score=score;
	}
}
