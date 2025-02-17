package com.example.composemvvmtodoapp.ui.theme

import androidx.lifecycle.ViewModel
import com.example.composemvvmtodoapp.data.TodoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TodoListViewModel @Inject constructor(
    private val repository: TodoRepository
): ViewModel() {

    val todos = repository.getTodos()


}