import cn.wen233.demo.processor.Data;

/**
 * @author wenei
 * @date 2021-02-05 9:58
 */
@Data
public class User {

    private String name;

    public static void main(String[] args) {
        User user = new User();
        user.setName("xiaoming");
        System.out.println(user.getName());
    }
}
