package tensor_programming.kttodo.store

import android.arch.lifecycle.LiveData

/**
 * Created by Tensor on 2/4/2018.
 */
interface Renderer<T> {
    fun render(model: LiveData<T>)
}