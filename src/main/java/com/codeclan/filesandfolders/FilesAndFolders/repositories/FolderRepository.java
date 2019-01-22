package com.codeclan.filesandfolders.FilesAndFolders.repositories;

import com.codeclan.filesandfolders.FilesAndFolders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
