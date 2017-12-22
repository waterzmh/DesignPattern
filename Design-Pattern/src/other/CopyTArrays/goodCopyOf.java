package other.CopyTArrays;

import java.lang.reflect.Array;

/**
 * Created by Administrator on 2017/10/21.
 */
//利用反射复制泛型数组 JAVA 核心技术 卷1 P203
public class goodCopyOf{
    public static Object CopyTArrays(Object obj,int newLength){
        Class c=obj.getClass();
        if(!c.isArray()){ return null;}
        Class componentType=c.getComponentType();
        int length= Array.getLength(obj);
        Object newarray=Array.newInstance(componentType,newLength);
        System.arraycopy(obj,0,newarray,0,Math.min(length,newLength));
        return newarray;
    }
}
