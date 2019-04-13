package com.hwrky.shop.service.impl;

import com.hwrky.shop.dao.LastIDMapper;
import com.hwrky.shop.service.LastIDService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("lastIDService")
public class LastIDServiceImpl implements LastIDService {
    private LastIDMapper lastIDMapper;

    @Resource(name = "lastIDMapper")
    public void setLastIDMapper(LastIDMapper lastIDMapper) {
        this.lastIDMapper = lastIDMapper;
    }

    @Override
    public int selectLastID() {
        return lastIDMapper.selectLastID();
    }
}
