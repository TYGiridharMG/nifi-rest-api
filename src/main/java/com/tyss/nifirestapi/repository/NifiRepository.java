package com.tyss.nifirestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyss.nifirestapi.dto.NifiBean;

public interface NifiRepository extends JpaRepository<NifiBean, Integer> {
}
