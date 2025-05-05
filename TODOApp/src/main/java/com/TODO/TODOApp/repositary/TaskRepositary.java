package com.TODO.TODOApp.repositary;

import com.TODO.TODOApp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepositary extends JpaRepository<Task,Long> {
}
