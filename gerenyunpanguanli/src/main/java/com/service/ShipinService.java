package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShipinEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 视频信息 服务类
 */
public interface ShipinService extends IService<ShipinEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}