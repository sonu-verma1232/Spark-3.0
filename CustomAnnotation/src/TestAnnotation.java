import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)  // it tells we want to access the annotation at runtime
@Target(ElementType.TYPE)   // it tells where we want to apply this annotation
@interface MyAnnotation {
     String value();
}

@MyAnnotation(value="Custom Annotation")
public class TestAnnotation{

    public static void main(String[] args) {

        Class<TestAnnotation> obj = TestAnnotation.class;
        if(obj.isAnnotationPresent(MyAnnotation.class))
        {
            MyAnnotation annotation = obj.getAnnotation(MyAnnotation.class);
            System.out.println("Annotation value : "+annotation.value());
        }

    }

}
