package org.folder.todolistlinter.repository;

import org.folder.todolistlinter.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class MyRepository implements JpaRepository<User, Long> {
}
