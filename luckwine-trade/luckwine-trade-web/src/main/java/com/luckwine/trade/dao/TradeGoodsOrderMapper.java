package com.luckwine.trade.dao;

import com.luckwine.trade.entity.TradeGoodsOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TradeGoodsOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_goods_order
     *
     * @mbg.generated Tue Sep 25 19:46:51 CST 2018
     */
    int deleteByPrimaryKey(String goodsOrderCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_goods_order
     *
     * @mbg.generated Tue Sep 25 19:46:51 CST 2018
     */
    int insert(TradeGoodsOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_goods_order
     *
     * @mbg.generated Tue Sep 25 19:46:51 CST 2018
     */
    int insertSelective(TradeGoodsOrder record);

    int insertBatch(@Param("tradeGoodsOrderList") List<TradeGoodsOrder> tradeGoodsOrderList);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_goods_order
     *
     * @mbg.generated Tue Sep 25 19:46:51 CST 2018
     */
    TradeGoodsOrder selectByPrimaryKey(String goodsOrderCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_goods_order
     *
     * @mbg.generated Tue Sep 25 19:46:51 CST 2018
     */
    int updateByPrimaryKeySelective(TradeGoodsOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_goods_order
     *
     * @mbg.generated Tue Sep 25 19:46:51 CST 2018
     */
    int updateByPrimaryKey(TradeGoodsOrder record);
}