fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val toRemove = mutableListOf<Int>()
    list.forEach { if(it % 2 == 0) toRemove.add(it)}
    list.removeAll(toRemove)
    println(list) // Output: [1, 3, 5]

    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    val setToRemove = set.filter { it % 2 == 0 }.toSet()
    set.removeAll(setToRemove)
    println(set) //Output: [1,3,5]
} 