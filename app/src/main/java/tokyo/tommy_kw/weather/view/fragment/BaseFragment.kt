package tokyo.tommy_kw.weather.view.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import butterknife.ButterKnife

/**
 * Created by tommy on 15/11/13.
 */
class BaseFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}