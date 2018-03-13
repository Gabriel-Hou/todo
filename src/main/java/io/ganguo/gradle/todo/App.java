package io.ganguo.gradle.todo;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by Gabriel on 18/3/13.
 **/
public class App {
    public static void main(String[] args) {
        TodoItem todo=new TodoItem();
        todo.setId(123);
        todo.setName("gabriel");
        System.out.println(todo.getId());
        System.out.println(todo.getName());
    }
}
