package com.phnomservice.basic.file.repository;

import com.phnomservice.basic.file.domain.FileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<FileEntity, Long> {
    void deleteByName(final String name);
}
