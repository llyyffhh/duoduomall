package com.ohayou.duoduomall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ohayou.common.utils.PageUtils;
import com.ohayou.duoduomall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author ohayou
 * @email llyyffhh@gmail.com
 * @date 2020-05-04 14:06:32
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

