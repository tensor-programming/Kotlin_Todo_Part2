package tensor_programming.kttodo.model

/**
 * Created by Tensor on 2/4/2018.
 */
sealed class Action

var counter = 0L
data class AddTodo(val text: String, val id : Long = counter++) : Action()
data class ToggleTodo(val id: Long) : Action()
data class SetVisibility(val visibility: Visibility) : Action()
data class RemoveTodo(val id: Long) : Action()

sealed class Visibility{
    class All : Visibility()
    class Active : Visibility()
    class Completed : Visibility()
}

