package com.yhsoft.api.mapper;

import com.yhsoft.api.param.IndexParam;
import com.yhsoft.framework.core.persistence.annotation.MyBatisDao;
import org.apache.ibatis.annotations.Select;

@MyBatisDao
public interface IndexMapper {
/*    @Select( "SELECT "+
            "a.user_total, "+
            "b.case_total, "+
            "b.f_total, "+
            "b.m_total, "+
            "c.comment_total, "+
            "d.taxlib_total "+
            "FROM "+
            "       (SELECT "+
            "               COUNT(1) user_total "+
            "               FROM "+
            "               sys_user "+
            "               WHERE "+
            "                  TYPE <> 3 "+
            "AND STATUS = 0) a, "+
            "(SELECT "+
            "COUNT(1) case_total, "+
            " SUM( "+
            " CASE "+
            "        WHEN case_type = 1 "+
            "       THEN 1 "+
            "       ELSE 0 "+
            "       END "+
            " ) f_total, "+
            "SUM( "+
            "  CASE "+
            "       WHEN case_type = 2 "+
            "       THEN 1 "+
            "       ELSE 0 "+
            "       END "+
            ") m_total "+
            "FROM "+
            "info_case "+
            "WHERE state = 2) b, "+
            "(SELECT "+
            "COUNT(1) comment_total "+
            "FROM "+
            "info_case_comment) c, "+
            "(SELECT "+
            "COUNT(1) taxlib_total "+
            "FROM "+
            "info_orders s "+
            "WHERE s.order_status = 1 "+
            "AND s.order_product_type = 4) d")*/
    IndexParam getStatisticsInfo();
}
