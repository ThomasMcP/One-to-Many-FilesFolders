package com.codeclan.filesandfolders.FilesAndFolders.repositories;

import com.codeclan.filesandfolders.FilesAndFolders.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
