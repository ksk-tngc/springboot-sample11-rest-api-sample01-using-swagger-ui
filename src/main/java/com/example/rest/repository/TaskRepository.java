package com.example.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rest.model.Task;

/**
 * タスクリポジトリインターフェース。
 */
public interface TaskRepository extends JpaRepository<Task, Long> {
}
