package com.example.rest.controller.v1;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.model.Task;
import com.example.rest.repository.TaskRepository;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;

/**
 * タスクコントローラ（v1）。
 */
@RestController
@RequestMapping("/api/v1/tasks/")
@CrossOrigin // CORSを有効化
@RequiredArgsConstructor
public class TaskController {

	/** タスクリポジトリ */
	private final TaskRepository repository;

	/**
	 * タスクを全件取得。
	 * GET: /api/v1/tasks/
	 */
	@Operation(summary = "タスクを全件取得します") // Swagger UI の操作説明
	@GetMapping("/")
	public List<Task> findAll() {
		return repository.findAll();
	}

	/**
	 * タスクを登録。
	 * POST: /api/v1/tasks/
	 */
	@Operation(summary = "タスクを登録します")
	@PostMapping("/")
	public Task save(@RequestBody Task task) {
		return repository.save(task);
	}

	/**
	 * タスクを1件取得。
	 * GET: /api/v1/tasks/{id}
	 */
	@Operation(summary = "タスクを1件取得します")
	@GetMapping("/{id}")
	public Task findById(@PathVariable long id) {
		return repository.findById(id).get();
	}

	/**
	 * タスクを更新。
	 * PUT: /api/v1/tasks/{id}
	 */
	@Operation(summary = "タスクを更新します")
	@PutMapping("/{id}")
	public Task save(@RequestBody Task newTask, @PathVariable Long id) {
		// 該当IDが存在する場合は更新、存在しない場合は登録
		return repository.findById(id).map(task -> {
			task.setName(newTask.getName());
			task.setCompleted(newTask.getCompleted());
			return repository.save(task);
		}).orElseGet(() -> {
			newTask.setId(id);
			return repository.save(newTask);
		});
	}

	/**
	 * タスクを削除。
	 * DELETE: /api/v1/tasks/{id}
	 */
	@Operation(summary = "タスクを削除します")
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		repository.deleteById(id);
	}

}
