package org.folder.todolistlinter.repository;

import org.folder.todolistlinter.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class MyRepository implements JpaRepository<User, Long> {
}
