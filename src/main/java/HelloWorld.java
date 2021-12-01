import org.apache.commons.lang3.StringUtils;

/**
 * @author hufan
 * @date 2021/11/16 11:22 下午
 * @annotation
 */
public class HelloWorld {
    public void test(){
        StringUtils.isEmpty("string");
    }

    public static void main(String[] args) {
        boolean test = StringUtils.isEmpty("string");
        System.out.println(test);
    }
}
