package site.yongh.tradecar.model.service.service

import android.util.Log
import site.yongh.tradecar.model.bean.CarUser

/**
 * Created by Elvis on 2017/7/21.
 */
class CarUserService : ICarUserService {
    val TAG = this.javaClass.name
    /**
     * 获取用户信息列表业务
     */
    override fun getCarUser(): List<CarUser> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        Log.e(TAG, "method: " + getCarUser())
    }
}