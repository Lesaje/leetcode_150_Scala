object ArraysHashing {
  def containsDuplicate(nums: Array[Int]): Boolean = {
    nums.toSet.size == nums.size;
  }

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    for (i <- 0 until nums.size) {
      for (j <- i + 1 until nums.size) {
        if (nums(i) + nums(j) == target) {
          return Array(i, j)
        }
      }
    }
    Array(0, 0)
  }
}
