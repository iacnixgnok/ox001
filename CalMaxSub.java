package demo0;

public class CalMaxSub {
	public int Cal(int array[]) {

		int sum = 0;// 记录子数组的和

		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				int cursum = 0;// 所遍历出来的子数组的和
				// 计算遍历的子数组之和
				for (int k = i; k <= j; k++) {
					cursum += array[k];
				}
				// 找出最大的子数组
				if (cursum > sum) {
					sum = cursum;// 更新sum为最大值

				}
			}
		}

		return sum;
	}
}
