package site.yongh.tradecar.view.activity

import android.support.design.widget.BottomNavigationView
import android.widget.FrameLayout
import site.yongh.tradecar.view.IView

/**
 * Created by Elvis on 2017/7/21.
 */
interface IMainActivityView : IView {
    fun getFrameContent(): FrameLayout
    fun getNavigation(): BottomNavigationView
}