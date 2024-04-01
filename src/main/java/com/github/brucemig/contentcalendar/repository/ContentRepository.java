package com.github.brucemig.contentcalendar.repository;

import com.github.brucemig.contentcalendar.model.Content;
import com.github.brucemig.contentcalendar.model.Status;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContentRepository extends ListCrudRepository<Content, Integer> {
    // using query derivation
    List<Content> findAllByTitleContains(String keyword);

    // without query derivation
    @Query("""
            SELECT * FROM Content
            WHERE status = :status
            """)
    List<Content> listByStatus(@Param("status") Status status);
}
