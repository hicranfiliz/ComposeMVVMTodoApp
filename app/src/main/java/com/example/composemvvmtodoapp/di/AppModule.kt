package com.example.composemvvmtodoapp.di

import android.app.Application
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.composemvvmtodoapp.TodoApp
import com.example.composemvvmtodoapp.data.TodoDao
import com.example.composemvvmtodoapp.data.TodoDatabase
import com.example.composemvvmtodoapp.data.TodoRepository
import com.example.composemvvmtodoapp.data.TodoRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideTodoDatabase(app: Application) : TodoDatabase{
        return  Room.databaseBuilder(
            app,
            TodoDatabase::class.java,
            "todo-db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideTodoRepository(db: TodoDatabase) : TodoRepository{
        return TodoRepositoryImpl(db.dao)
    }
}