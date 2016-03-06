package com.app.mvc.excel;import java.lang.annotation.Documented;import java.lang.annotation.Retention;import java.lang.annotation.RetentionPolicy;import java.lang.annotation.Target;import static java.lang.annotation.ElementType.FIELD;/** * Created by jimin on 16/2/21. */@Documented@Retention(RetentionPolicy.RUNTIME)@Target(value = FIELD)public @interface ExcelHeader {    /**     * 字段序号, 由小到大     */    int index() default 0;    /**     * excel 类型, 字符串,数字等     */    Class type() default String.class;    /**     * 格式, date类型等使用     */    String format() default "";}