package io.ganguo.gradle.todo;


//import ch.qos.logback.classic.Logger;
//import org.slf4j.LoggerFactory;

/**
 * Created by Gabriel on 18/3/13.
 **/
public class App {
//    static Logger log= LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        TodoItem todo=new TodoItem();
        todo.setId(123);
        todo.setName("gabriel");
        System.out.println(todo.getId());
        System.out.println(todo.getName());
    }
}
