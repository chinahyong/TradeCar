package site.yongh.tradecar.view.activity

import android.content.Context
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.widget.FrameLayout
import kotlinx.android.synthetic.main.activity_main.*
import site.yongh.tradecar.R
import site.yongh.tradecar.view.activity.base.BaseActivity
import site.yongh.tradecar.presenter.activity.CarUserPresenter
import site.yongh.tradecar.view.view.activity.IMainActivityView

class MainActivity : BaseActivity(), IMainActivityView {
    val mCarUserPresenter: CarUserPresenter = CarUserPresenter().attach(this) as CarUserPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.home_navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    // activity销毁时，销毁presenter，防止内存泄漏
    override fun onDestroy() {
        mCarUserPresenter.deAttach()
        super.onDestroy()
    }

    /**
     * 底部切换监听器
     */
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        mCarUserPresenter!!.tabSelected(item.itemId)
        when (item.itemId) {
            R.id.navigation_home -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    /**
     * IView实现 begin
     */
    override fun getFrameContent(): FrameLayout {
        return this.home_content
    }

    override fun getNavigation(): BottomNavigationView {
        return this.home_navigation
    }

    override fun getViewContext(): Context {
        return this
    }
    /*      IView实现  end       */
}
