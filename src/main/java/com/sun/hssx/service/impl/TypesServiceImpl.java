package com.sun.hssx.service.impl;

import com.sun.hssx.bean.Result;
import com.sun.hssx.bean.Types;
import com.sun.hssx.mapper.TypesMapper;
import com.sun.hssx.service.TypesService;
import com.sun.hssx.utils.Constants;
import org.apache.tomcat.util.bcel.classfile.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.List;

/**
 * projectName: hssx
 *
 * @author: 12510
 * time: 2020/11/3 15:10
 * description:
 */
@Service
public class TypesServiceImpl implements TypesService {

    @Autowired
    private TypesMapper typesMapper;
    @Override
    public Result saveTypes(Types types) {

        int rows = typesMapper.insertTypes(types);

        Result result = new Result();

        if(rows>0){
            //获取新的类型集合
            List<Types> list = typesMapper.queryTypesList();
            result.setCode(Constants.OK);
            result.setData(list);
        }else {
            result.setData(Constants.FAIL);
        }
        return result;
    }
}
