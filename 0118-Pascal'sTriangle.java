class Solution {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> ans = new ArrayList<>();

    for (int i = 0; i < numRows; ++i) {
      Integer[] temp = new Integer[i + 1];
      Arrays.fill(temp, 1);
      ans.add(Arrays.asList(temp));
    }

    for (int i = 2; i < numRows; ++i)
      for (int j = 1; j < ans.get(i).size() - 1; ++j)
        ans.get(i).set(j, ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));

    return ans;
  }
}
// public List<List<Integer>> generate(int numRows) {
    //     List<List<Integer>> list = new ArrayList<>();
    //     int num;
    //     for(int i=0; i<numRows; i++){
    //         list.add(new ArrayList<Integer>(i+1));
    //         num =1;
    //         for(int j=0; i<=i; j++){
    //             list.get(i).add(j,num);
    //             num = num*(i-j)/(j+1);
    //         }
    //     }
    //     return list;
    // }
    //Memory Limit Exceeded
