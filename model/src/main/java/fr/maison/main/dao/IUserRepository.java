package fr.maison.main.dao;

import fr.maison.main.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Integer> {
}
