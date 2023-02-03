package com.ly.ch03

import android.app.Activity

/**
 * @author LiuYang
 * @desc 管理 Activity，方便统一操作，如一键退出等
 * @date 2023/2/3
 */
object ActivityController {
    private val activities = ArrayList<Activity>()

    fun addActivity(activity: Activity) {
        activities.add(activity)
    }

    fun removeActivity(activity: Activity) {
        activities.remove(activity)
    }

    fun finishAll() {
        for (activity in activities) {
            if (!activity.isFinishing) {
                activity.finish()
            }
        }
        activities.clear()
        // 可以在该方法中加入杀掉当前进程的方法，确保程序完全退出
        android.os.Process.killProcess(android.os.Process.myPid())
    }
}