package site.yongh.tradecar.model.service.dao

import site.yongh.tradecar.model.bean.Car
import site.yongh.tradecar.model.bean.CarUser

/**
 * Created by Elvis on 2017/7/21.
 */
interface ICarUserDAO {
    fun getCarUserList(): List<CarUser>
    fun getCarUserByPhone(phone: String): CarUser
    fun getCarUserByName(name: String): List<CarUser>
    fun getCarUserByCar(car: Car): List<CarUser>
}