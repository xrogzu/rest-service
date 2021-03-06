package com.lihe.persistence;

import org.apache.ibatis.annotations.Select;

/**
 * Created by trimup on 2016/7/27.
 */
public interface KeyValueMapper {


    /**
     * 查询出恒生的 身份证 编码
     * @return
     */
    @Select("select * from lh_hs_keyvalue_map where value_name='身份证'")
    public String findHsIndentityCardCode();
}
