package site.yongh.tradecar.dao

import site.yongh.tradecar.model.Car
import site.yongh.tradecar.model.CarUser

/**
 * Created by Elvis on 2017/7/21.
 * 进本操作功能（直接操作数据库等数据）
 */
class CarUserDao : ICarUserDAO {
    // 获取车主信息列表
    override fun getCarUserList(): List<CarUser> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    // 通过手机号，获取车主信息
    override fun getCarUserByPhone(phone: String): CarUser {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    // 通过姓名查找车主信息（有可能重名）
    override fun getCarUserByName(name: String): List<CarUser> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    // 通过车辆信息查找车主信息列表
    override fun getCarUserByCar(car: Car): List<CarUser> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}