package com.sun.hssx.service;

import com.sun.hssx.bean.Result;
import com.sun.hssx.bean.Types;

/**
 * projectName: hssx
 *
 * @author: 12510
 * time: 2020/11/3 15:08
 * description:types的业务接口
 */
public interface TypesService {

    /**
     * 保存类型的业务方法
     * @param types
     * @return
     */
    Result saveTypes(Types types);
}
