package ${NAME}


private fun Int.modPositive(other Int): Int = if(this%(other)<0) (this%(other))+(other) else (this%(other))


class Solution {
    fun ${NAME}(): Unit {
		//TODO: Solve the problem
    }
}

fun main() {
	//TODO: Generate input data and feed into function

    val solution = Solution()
    print(solution.${NAME}())
}