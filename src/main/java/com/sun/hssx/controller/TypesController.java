package com.sun.hssx.controller;

import com.sun.hssx.bean.Result;
import com.sun.hssx.bean.Types;
import com.sun.hssx.service.TypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName: hssx
 *
 * @author: 12510
 * time: 2020/11/3 15:04
 * description:类别模块的controller
 */
@RestController
@RequestMapping("types")
public class TypesController {

    @Autowired
    private TypesService typesService;

    /**
     * 保存types的方法
     * @param types
     * @return
     */

    @PostMapping("save")
    public Result saveTypes(Types types){

        Result result = typesService.saveTypes(types);
        return result;
    }
}
