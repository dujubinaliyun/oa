public interface UserService{
	User getById(String id);
	List<User> getAll();
	int save(User user);
}
