package com.twb.oauth2.ent;

import com.twb.oauth2.users.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

interface TestRepository extends PagingAndSortingRepository<TestEntity, Long>, TestRepositoryCustom {
    Page<TestEntity> findAllByUser(User user, Pageable pageable);
}
