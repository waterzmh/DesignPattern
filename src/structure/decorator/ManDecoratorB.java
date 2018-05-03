package structure.decorator;

/**
 * Created by Administrator on 2017/10/29.
 */
public class ManDecoratorB extends AbstractDecorator {
    @Override
    public void eat(){
        super.eat();
        System.out.println("ManDecoratorB类");
    }

}
