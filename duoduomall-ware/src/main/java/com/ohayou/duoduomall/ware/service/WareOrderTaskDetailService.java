package com.ohayou.duoduomall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ohayou.common.utils.PageUtils;
import com.ohayou.duoduomall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author ohayou
 * @email llyyffhh@gmail.com
 * @date 2020-05-04 14:24:27
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

