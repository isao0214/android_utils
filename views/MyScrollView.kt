package android_utils.views

import android.content.Context
import android.util.AttributeSet
import android.widget.ScrollView

/**
 * API Version23未満でScrollViewのonScrollChanged()を使うためのclass
 */
class MyScrollView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ScrollView(context, attrs, defStyleAttr) {

    private var mOnScrollChangedListener: OnScrollChangedListener? = null

    interface OnScrollChangedListener {
        fun onScrollChanged(x: Int, y: Int, oldx: Int, oldy: Int)
    }

    fun setOnScrollListener(listenerOn: OnScrollChangedListener) {
        this.mOnScrollChangedListener = listenerOn
    }

    override fun onScrollChanged(x: Int, y: Int, oldx: Int, oldy: Int) {
        super.onScrollChanged(x, y, oldx, oldy)
        mOnScrollChangedListener?.onScrollChanged(x, y, oldx, oldy)
    }
}