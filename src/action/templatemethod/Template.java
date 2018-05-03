package action.templatemethod;

/**
 * Created by Administrator on 2017/12/22.
 */

/**
 * 抽象模板中方法1已经实现并且无法更改,方法2页已经实现但是可以在子类中重写，方法3和4需要子类去实现
 */
public abstract class Template {
    protected final void method1(){
        System.out.println("模板方法1已经实现");
    }
    protected void method2(){
        System.out.println("模板方法2已经实现");
    }
    abstract void method3();
    abstract void method4();
}
