package site.yongh.tradecar.service

import site.yongh.tradecar.model.CarUser

/**
 * Created by Elvis on 2017/7/21.
 * 业务类，将多个功能合并到一个方法实现某一个业务
 */
interface ICarUserService {
    fun getCarUser(): List<CarUser>
}