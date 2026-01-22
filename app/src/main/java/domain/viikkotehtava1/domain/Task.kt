package domain.viikkotehtava1.domain

data class Task (val id: Int,
                 val title: String,
                 val description: String = "",
                 val priority: Int = 0,
                 val dueDate: String = "",
                 val done: Boolean)