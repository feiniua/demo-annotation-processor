package cn.wen233.demo.processor;

import java.lang.annotation.*;

/**
 * 自定义注解
 *
 * @author huu
 * @date 2020-06-24 15:46
 */
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface Data {

    int code() default 400;

    String message() default "默认信息";
}
