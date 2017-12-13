package com.yhsoft.framework.core.persistence.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * 
 * 类名称：MyBatisDao<br>
 * 类描述：标识MyBatis的DAO,方便{@link org.mybatis.spring.mapper.MapperScannerConfigurer}的扫描。<br>
 * 创建人：qinjiaxue<br>
 * 创建时间：2017年5月22日 下午10:06:03<br>  
 * @version v1.0
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Component
public @interface MyBatisDao {

    /**
     * 该值可能表示对逻辑组件名称的建议,在被自动检测的组件的情况下变成一个Spring bean.
     * @return 建议的组件名称，如果有的话
     */
    String value() default "";

}
