package com.pets.service;

import com.pets.model.entity.Tests;
import java.util.ArrayList;

/**
 * @description 测试服务接口
 * @author 芒果love
 */
@SuppressWarnings("ALL")
public interface ITestService {
    /**
     * 查询列表
     *
     * @param
     * @return ArrayList<Tests>
     */
    ArrayList<Tests> findTestList();
}