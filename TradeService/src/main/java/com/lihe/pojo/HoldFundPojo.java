package com.lihe.pojo;

import lombok.Data;

/**
 * Created by trimup on 2016/9/22.
 * 持有基金详情
 */
@Data
public class HoldFundPojo {
    Integer fund_id;
    String  fund_full_name; //基金名称
    String  fund_code; //基金代码
    String  totalProfit;//累计收益
    String  fundType;//基金类别
    String  fallAndRise;//最新涨幅
    String yzdf ="---";//月涨跌幅
    String jzdf ="---";//季度涨跌幅
    String bnzdf="---";//半年涨跌幅
    String nzdf="---";//年涨跌幅
    String  trade_time;//交易时间
    String  auto_buy; //分红方式
    String  todayProfit;//今日收益
    String  profit_date;//今日收益日期
    boolean  allow_fix_bonus;//允许修改分红方式
    Integer    ofund_risklevel	    ;   //       基金风险等级	N	8	0	N	v4.0.0.0
     String   ofundRisk ;         //基金风险等级
}
