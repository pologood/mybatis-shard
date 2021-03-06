package org.lysu.shard.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用于参与分库判断的条件数据.
 * 
 * @author lysu created on 14-4-6 下午3:35
 * @version $Id$
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
public @interface DbShardWith {

    /**
     * 需要用被标注数据内部数据的情况.
     * 
     * @return
     */
    String[] props() default {};

}
