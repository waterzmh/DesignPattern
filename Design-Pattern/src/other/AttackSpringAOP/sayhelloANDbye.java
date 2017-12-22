package other.AttackSpringAOP;

/**
 * Created by Administrator on 2017/12/7.
 */
public interface sayhelloANDbye {
    default void hello(){
        System.out.println("hellohello~");
    }
    default void bye(){
        System.out.println("byebye~");
    }
    void operation();
}
