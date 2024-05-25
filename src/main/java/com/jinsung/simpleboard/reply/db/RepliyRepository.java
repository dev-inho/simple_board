package com.jinsung.simpleboard.reply.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepliyRepository extends JpaRepository<ReplyEntity, Long> {
}
