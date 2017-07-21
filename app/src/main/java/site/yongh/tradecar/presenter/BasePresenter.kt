package site.yongh.tradecar.presenter

/**
 * Created by Elvis on 2017/7/21.
 */
abstract class BasePresenter<T> {
    var iView: T? = null
    fun attach(iView: T): BasePresenter<T> {
        this.iView = iView
        return this
    }

    fun deAttach() {
        this.iView = null
    }
}