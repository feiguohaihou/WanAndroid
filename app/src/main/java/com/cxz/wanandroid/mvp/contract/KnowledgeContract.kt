package com.cxz.wanandroid.mvp.contract

import com.cxz.wanandroid.base.IPresenter
import com.cxz.wanandroid.base.IView
import com.cxz.wanandroid.mvp.model.bean.KnowledgeTreeBody

/**
 * Created by chenxz on 2018/5/8.
 */
interface KnowledgeContract {

    interface View : IView {

        fun setKnowledgeTree(lists: List<KnowledgeTreeBody>)

    }

    interface Presenter : IPresenter<View> {

        fun requestKnowledgeTree()

    }

}