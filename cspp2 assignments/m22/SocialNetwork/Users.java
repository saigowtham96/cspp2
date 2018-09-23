class Users {
	private String name;
	private List<String> followers;

	Users() { }

	Users(String name) {
		this.name = name;
		followers = new List<String>();
	}

	public String getName() {
		return this.name;
	}

	public void addFollower(String followername) {
		followers.add(followername);
	}

	public List<String> getFollowerList() {
		return followers;
	}

	public String toString() {
		String str = this.name+": "+followers.toString();
		return str;
	}
}