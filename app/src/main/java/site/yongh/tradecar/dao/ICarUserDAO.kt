package site.yongh.tradecar.dao

import site.yongh.tradecar.model.Car
import site.yongh.tradecar.model.CarUser

/**
 * Created by Elvis on 2017/7/21.
 */
interface ICarUserDAO {
    abstract fun getCarUserList(): List<CarUser>
    abstract fun getCarUserByPhone(phone: String): CarUser
    abstract fun getCarUserByName(name: String): List<CarUser>
    abstract fun getCarUserByCar(car: Car): List<CarUser>
}