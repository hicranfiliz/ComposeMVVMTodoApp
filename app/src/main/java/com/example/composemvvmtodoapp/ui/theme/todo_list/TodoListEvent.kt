package com.example.composemvvmtodoapp.ui.theme.todo_list

import com.example.composemvvmtodoapp.data.Todo

sealed class TodoListEvent {
    data class OnDeleteTodoClick(val todo: Todo) : TodoListEvent()
    data class OnDoneChangeClick(val todo: Todo, val isDone: Boolean) : TodoListEvent()
    object OnUndoDeleteClick: TodoListEvent()
    data class OnTodoClick(val todo: Todo): TodoListEvent()
    object OnAddTodoClick: TodoListEvent()
}