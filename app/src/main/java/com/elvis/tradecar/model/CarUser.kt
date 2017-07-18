package com.elvis.tradecar.model

import java.util.*

/**
 * Created by Elvis on 2017/7/18.
 * description:车主/司机/购车用户信息
 */
class CarUser {
    var id: Int = 0
    var name: String = ""                   // 姓名
    var address: String = ""                // 地址
    var mobile: Long = 0                    // 联系方式
    var hopeMinSalePrice: Double = 0.0      // 最低能接受的出售价格
    var hopeMaxSalePrice: Double = 0.0      // 理想的出售价格
    var hopeMinBuyPrice: Double = 0.0       // 最低想支付的购买价格
    var hopeMaxBuyPrice: Double = 0.0       // 最高能承受的购买价格
    var carInfo: Car = Car()                 // 出售/购买的车辆信息
    var time: Date = Date()                 // 求购/出售 登记时间
}