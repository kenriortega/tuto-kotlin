enum class TaskList(val description: String, val statusCode: Int) {
    NOT_STARTED(statusCode = -1, description = "is used for define a new task"),
    IN_PROGRESS(statusCode = 0, description = "is used when the task is in progress"),
    COMPLETE(statusCode = 1, description = "is used when the task was finished");

    fun checkStatus() {
        when (this.statusCode) {
            0 -> println("This task is ${this.name}")
            -1 -> println("This task is ${this.name}")
            1 -> println("This task is ${this.name}")
            else -> println("unknown")
        }
    }
}