package site.yongh.tradecar.model.httpservice

import retrofit2.http.GET
import site.yongh.tradecar.model.bean.CarUser

/**
 * Created by Elvis on 8/17/17.
 */
interface ICarUserHttpService {
    /**
     * 获取用户信息列表
     * @param page 分页数
     * @param count 每页显示数
     */
    @GET("getCarUserList/")
    fun getCarUserList(page:Int,count:Int):List<CarUser>
}