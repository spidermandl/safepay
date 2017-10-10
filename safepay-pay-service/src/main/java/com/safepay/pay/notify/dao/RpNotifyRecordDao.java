package com.safepay.pay.notify.dao;

import com.safepay.pay.common.core.dao.BaseDao;
import com.safepay.pay.notify.entity.RpNotifyRecord;

/**
 * @功能说明:
 * @创建者: Peter
 * @创建时间: 16/6/2  上午11:20
 * @公司名称:safepay
 * @版本:V1.0
 */
public interface RpNotifyRecordDao  extends BaseDao<RpNotifyRecord> {

    RpNotifyRecord getNotifyByMerchantNoAndMerchantOrderNoAndNotifyType(String merchantNo, String merchantOrderNo, String notifyType);

    int deleteByPrimaryKey(String id);

    int insertSelective(RpNotifyRecord record);

    RpNotifyRecord selectByPrimaryKey(String id);

    int updateByPrimaryKey(RpNotifyRecord record);
}
