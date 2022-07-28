import com.baeldung.annotation.Person;
import com.baeldung.annotation.PersonBuilder;
import org.junit.jupiter.api.Test;

/**
 * Created by zhuhaoju on 2022/7/28.
 */
public class TestDemo {

    @Test
    public void test(){

        PersonBuilder personBuilder = new PersonBuilder();
        Person person = personBuilder.setAge(1)
                .setName("张三")
                .build();

        System.out.println(person.getAge() + person.getName());

    }
}
