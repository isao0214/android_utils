package android_utils.views

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import androidx.recyclerview.widget.RecyclerView

class NoScrollRecyclerView : RecyclerView {

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet, style: Int) : super(context, attrs, style) {}

    override fun dispatchTouchEvent(motionEvent: MotionEvent): Boolean {

        return if (motionEvent.action == MotionEvent.ACTION_MOVE) true else super.dispatchTouchEvent(motionEvent)
    }
}