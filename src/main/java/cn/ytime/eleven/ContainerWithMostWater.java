package cn.ytime.eleven;

/**
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0) 。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * 双指针法
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/container-with-most-water
 *
 * @author y-time
 * @version 1.0
 * @date 2021-07-17 21:35
 */
public class ContainerWithMostWater {

    public int maxArea(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int resultArea = 0;
        while (left < right) {
            int leftHigh = arr[left];
            int rightHigh = arr[right];
            // 面积等于左右指针小的数乘左右指针距离，与上个面积比较，去最大面积
            resultArea = Math.max(resultArea, Math.min(leftHigh, rightHigh) * (right - left));
            if (leftHigh > rightHigh) {
                --right;
            } else {
                ++left;
            }
        }
        return resultArea;
    }

}
