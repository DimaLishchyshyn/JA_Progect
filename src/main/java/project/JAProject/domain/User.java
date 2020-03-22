package project.JAProject.domain;

public class User {
	private Integer id;
	private String email;
	private String firsName;
	private String lastName;
	private UserRole pole;
	private String password;

	public User() {
	}

	public User(String email, String firsName, String lastName, UserRole pole, String password) {
		this.email = email;
		this.firsName = firsName;
		this.lastName = lastName;
		this.pole = pole;
		this.password = password;
	}

	public User(Integer id, String email, String firsName, String lastName, UserRole pole, String password) {
		this.id = id;
		this.email = email;
		this.firsName = firsName;
		this.lastName = lastName;
		this.pole = pole;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public UserRole getPole() {
		return pole;
	}

	public void setPole(UserRole pole) {
		this.pole = pole;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firsName == null) ? 0 : firsName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((pole == null) ? 0 : pole.hashCode());
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
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firsName == null) {
			if (other.firsName != null)
				return false;
		} else if (!firsName.equals(other.firsName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (pole != other.pole)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", firsName=" + firsName + ", lastName=" + lastName + ", pole="
				+ pole + ", password=" + password + "]";
	}

}
