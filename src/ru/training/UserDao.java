package ru.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class UserDao implements Dao<User>{

    List<User> users = new ArrayList<>();

    @Override//id из таблицы или List?
    public Optional<User> get(int id) {
        return Optional.ofNullable(users.get(id));
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public void save(User user) {
        users.add(user);

    }

    @Override
    public void update(User user, String[] params) {
        user.setLastName(Objects.requireNonNull(params[0], "Surname cannot be null"));
        user.setFirstName(Objects.requireNonNull(params[1], "Name cannot be null"));
    }

    @Override
    public void delete(User user) {
        users.remove(user);
    }
}
