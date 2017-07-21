package site.yongh.tradecar.model

import java.util.*

/**
 * Created by Elvis on 2017/7/18.
 * description:车辆信息
 */
class Car {
    var id: Int = 0
    var name: String? = null
    var arrears: Double = 0.0        //车辆欠款
    var company: String? = null          //挂靠公司
    var address: String? = null           //车辆所属地
    var carNumber: String? = null          //车牌号
    var trailerNumber: String? = null         //挂车号
    var owner: CarUser = CarUser()      //车辆所属人
    var brand: CarBrand = CarBrand()                    // 汽车品牌
    var carBrandSerie: CarBrandSerie = CarBrandSerie()  //汽车系列
    var carConfig: CarConfig = CarConfig()          //车辆配置
    var insuranceStartTime: Date = Date()       // 保险开始时间
    var insuranceEndTime: Date = Date()         // 保险结束时间
    var selfProfit: Double = 0.0                // 中介自身盈利
    var note: String? = null                       // 备注（交通违章等）
    var fixedYears: Double = 0.0               // 车辆使用年限
}