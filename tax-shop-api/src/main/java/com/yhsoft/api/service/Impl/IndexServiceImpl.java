package com.yhsoft.api.service.Impl;

import com.yhsoft.api.mapper.IndexMapper;
import com.yhsoft.api.param.IndexParam;
import com.yhsoft.api.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class IndexServiceImpl implements IndexService {
    @Autowired
    private IndexMapper indexMapper;
    @Override
    public IndexParam getStatisticsInfo() {
        return indexMapper.getStatisticsInfo();
    }
}
