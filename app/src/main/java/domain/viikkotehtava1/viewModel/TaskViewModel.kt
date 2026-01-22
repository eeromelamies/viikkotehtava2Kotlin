package domain.viikkotehtava1.viewModel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import domain.viikkotehtava1.domain.Task
import domain.viikkotehtava1.domain.mockTodos
import kotlin.collections.plus
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class TaskViewModel : ViewModel() {
    var isSortedByDate by mutableStateOf(false)
    var tasks by mutableStateOf(listOf<Task>())

      private set
    private var allTasks: List<Task> = mockTodos

    init {
        tasks = mockTodos
    }

    fun addTask(task: Task) {
        allTasks = allTasks + task
        tasks = allTasks
    }

    fun toggleDone(id: Int) {
        allTasks = allTasks.map { task ->
            if (task.id == id) task.copy(done = !task.done) else task
        }
        tasks = tasks.map { task ->
            if (task.id == id) task.copy(done = !task.done) else task
        }
    }

    fun removeTask(id: Int) {
        tasks = tasks.filter { it.id != id }
    }

    fun filterByDone(done: Boolean) {
        tasks = tasks.filter { it.done == done }
    }
    fun showAll() {

        tasks = allTasks
    }

    fun sortByDueDate() {
        if (isSortedByDate) {
            allTasks = allTasks.sortedBy { it.id }
            tasks = allTasks
            isSortedByDate = false
        } else {
            allTasks = allTasks.sortedBy { it.dueDate }
            tasks = allTasks
            isSortedByDate = true
        }
    }
}
