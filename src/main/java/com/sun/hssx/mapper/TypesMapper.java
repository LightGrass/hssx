package com.sun.hssx.mapper;

import com.sun.hssx.bean.Types;

import java.util.List;

/**
 * projectName: hssx
 *
 * @author: 12510
 * time: 2020/11/3 15:13
 * description:Types类数据库操作的mapper
 */
public interface TypesMapper {
    /**
     * 插入数据的方法
     * @param types
     * @return int DML insert update delete 返回的影响行数
     */
    int insertTypes(Types types);

    /**
     * 查询全部
     * @return
     */
    List<Types> queryTypesList();

    /**
     * 修改方法
     * @param types
     * @return
     */
    int updateTypes(Types types);


}
