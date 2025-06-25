import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Driver {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        DbOperation db = new DbOperation();
        Method method = DbOperation.class.getMethod("readDate");

        if(method.isAnnotationPresent(LogExecutionTime.class)){
            long startTime = System.currentTimeMillis();
            method.invoke(db);
            long endTime = System.currentTimeMillis();

            System.out.println("Execution time : "+(endTime-startTime));
        }

    }

}
