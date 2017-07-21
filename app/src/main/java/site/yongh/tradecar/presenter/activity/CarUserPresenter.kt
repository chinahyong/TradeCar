package site.yongh.tradecar.presenter.activity

import android.widget.Toast
import site.yongh.tradecar.R
import site.yongh.tradecar.presenter.BasePresenter
import site.yongh.tradecar.view.activity.IMainActivityView

/**
 * Created by Elvis on 2017/7/21.
 */
class CarUserPresenter : BasePresenter<IMainActivityView>() {

    fun tabSelected(tab: Int) {
        when (tab) {
            R.id.navigation_home ->
                Toast.makeText(iView!!.getViewContext(), "购买", Toast.LENGTH_SHORT).show()
            R.id.navigation_dashboard ->
                Toast.makeText(iView!!.getViewContext(), "出售", Toast.LENGTH_SHORT).show()
            R.id.navigation_notifications ->
                Toast.makeText(iView!!.getViewContext(), "车辆信息", Toast.LENGTH_SHORT).show()
        }
    }
}