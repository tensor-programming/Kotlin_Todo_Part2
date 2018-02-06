package tensor_programming.kttodo.store

import android.arch.core.util.Function
import tensor_programming.kttodo.model.Action


/**
 * Created by Tensor on 2/4/2018.
 */
interface Store<T> {
    fun dispatch(action: Action)

    fun subscribe(renderer: Renderer<T>, func: Function<T, T> = Function { it })
}