package com.zb.service;

import com.zb.pojo.Commodity;
import com.zb.util.Page;

public interface BlCommodityService {
    public Page<Commodity> getPageCommodity(Integer index, Integer size)throws  Exception;
}
