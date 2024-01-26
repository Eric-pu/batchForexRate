package org.batch_rate.repository;

import org.batch_rate.entity.CollectionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ForexRepository extends JpaRepository<CollectionEntity, String> {

    @Query(value = " select c.date from CollectionEntity c")
    List<String> queryListOfDatetime();

    @Query(value = " select c from CollectionEntity c where datetime = :datetime")
    Optional<CollectionEntity> findByDatetime(@Param("datetime") String datetime);

}
